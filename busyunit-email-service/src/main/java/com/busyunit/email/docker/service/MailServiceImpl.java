package com.busyunit.email.docker.service;

import com.busyunit.email.docker.dto.MailResponse;
import com.busyunit.email.docker.model.EmbassyMessage;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * <p/>
 * {@code MailServiceImpl} implements JavaMailSender
 * <p/>
 *
 * @author ramayall
 * @since 22/04/2019
 */

@Slf4j
@Service
public class MailServiceImpl implements MailService{

    @Autowired
    private JavaMailSender emailSender;

    @Autowired
    private Configuration freemarkerConfig;


    public MailResponse sendEmbassyMessage(EmbassyMessage embassyMessage) throws MessagingException, IOException, TemplateException {

        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message,
                MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
                StandardCharsets.UTF_8.name());

        //helper.addAttachment("logo.png", new ClassPathResource("memorynotfound-logo.png"));

        Template t = freemarkerConfig.getTemplate("embassy-template.ftl");
        String html = FreeMarkerTemplateUtils.processTemplateIntoString(t, embassyMessage);

        helper.setTo(embassyMessage.getReceiverEmail());
        helper.setText(html, true);
        //helper.addInline("logo.png", new ClassPathResource("memorynotfound-logo.png")); For Adding attachmments
        helper.setSubject(embassyMessage.getSubject());
        helper.setFrom(embassyMessage.getSenderEmail());

        emailSender.send(message);

        log.info("Email Sent to :{} ", embassyMessage.getReceiverEmail());

        MailResponse mailResponse = new MailResponse();
        mailResponse.setMessageSent(true);
        mailResponse.setReceiverEmail(embassyMessage.getReceiverEmail());

        return mailResponse;
    }
}

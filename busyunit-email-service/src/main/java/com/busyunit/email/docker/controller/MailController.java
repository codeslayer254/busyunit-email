package com.busyunit.email.docker.controller;

import com.busyunit.email.docker.dto.MailResponse;
import com.busyunit.email.docker.model.EmbassyMessage;
import com.busyunit.email.docker.service.MailService;
import com.busyunit.email.docker.service.MailServiceImpl;
import freemarker.template.TemplateException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;

/**
 * <p/>
 * {@code MailController} represents a request during MailController creation.
 * <p/>
 *
 * @author ramayall
 * @since 22/04/2019
 */

@Slf4j
@RestController
@Api(value = "Mail Sender API",
        description = "MAIL SENDER API",
        produces = "application/json", tags = {"MAIL API"})
public class MailController {

    @Autowired
    private MailService mailService;

    public static final String MAIL_URL = "/mail";


    @ApiOperation(value = "Send an e-mail.",
            notes = "Requires a mail sender, receiver, message.",
            response = MailResponse.class)
    @ApiResponses({@ApiResponse(code = 200,
            response = Override.class,
            message = "Override override sent successfully")})
    @RequestMapping(method = RequestMethod.POST,
            value = MAIL_URL,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MailResponse> sendEmail(@RequestBody EmbassyMessage embassyMessage) throws MessagingException, IOException, TemplateException {

        log.info("Email message sender address :{} Name:{}", embassyMessage.getSenderEmail(), embassyMessage.getSenderName());
    
        MailResponse mailResponse = mailService.sendEmbassyMessage(embassyMessage);
        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(mailResponse);
    }
}

package com.busyunit.email.docker.service;

import com.busyunit.email.docker.dto.MailResponse;
import com.busyunit.email.docker.model.EmbassyMessage;
import freemarker.template.TemplateException;

import javax.mail.MessagingException;
import java.io.IOException;

/**
 * <p/>
 * {@code MailService} represents a request during MailService creation.
 * <p/>
 *
 * @author ramayall
 * @since 23/04/2019
 */

public interface MailService {

    MailResponse sendEmbassyMessage(EmbassyMessage embassyMessage) throws MessagingException, IOException, TemplateException;
}

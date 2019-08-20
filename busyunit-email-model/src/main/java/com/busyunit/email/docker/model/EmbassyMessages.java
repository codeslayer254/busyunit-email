package com.busyunit.email.docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p/>
 * {@code EmbassyMessages} represents a request during EmbassyMessages creation.
 * <p/>
 *
 * @author ramayall
 * @since 28/05/2019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmbassyMessages {

    private String senderName;

    private String senderEmail;

    private String subject;

    private String message;

    private boolean messageSent = false;

    private List<Recipient> recipients;

    private List<Object> attachments;

    private Map<String, Object> signature = new HashMap<>();

    private LocalDateTime dateSent =  LocalDateTime.now();
}

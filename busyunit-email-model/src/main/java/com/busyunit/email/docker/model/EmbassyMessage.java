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
 * {@code EmbassyMessage} represents email message to send.
 * <p/>
 *
 * @author Ram Ayall
 * @since 23/04/19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmbassyMessage {

    private String senderName;

    private String senderEmail;

    private String receiverName;

    private String receiverEmail;

    private String subject;

    private String message;

    private boolean messageSent = false;

    private List<Object> attachments;

    private Map<String, Object> signature = new HashMap<>();

    private LocalDateTime dateSent =  LocalDateTime.now();
}

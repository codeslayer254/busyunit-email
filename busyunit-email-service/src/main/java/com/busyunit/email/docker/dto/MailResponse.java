package com.busyunit.email.docker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p/>
 * {@code MailResponse} is returned after email send request.
 * <p/>
 *
 * @author ramayall
 * @since 23/04/2019
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MailResponse {

    private String receiverEmail;
    private boolean messageSent = false;
}

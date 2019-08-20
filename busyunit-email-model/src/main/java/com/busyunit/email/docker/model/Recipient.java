package com.busyunit.email.docker.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * <p/>
 * {@code Recipient} represents a request during Recipient creation.
 * <p/>
 *
 * @author ramayall
 * @since 28/05/2019
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipient {

    private String receiverName;

    private String receiverEmail;
}

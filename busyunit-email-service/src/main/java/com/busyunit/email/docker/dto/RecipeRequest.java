/**
 * {@code BookRequest} represents a request during recipe creation.
 * <p/>
 *
 * @author Ram Ayall
 * @since 17/03/19
 */
package com.busyunit.email.docker.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecipeRequest {
    private String author;
    private String bookDesc;
    private String bookIntro;
    private String bookTitle;
    private long coverBackgroundID;
    private List<Recipe> recipes;
}

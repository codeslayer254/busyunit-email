/**
 * {@code BookRequest} represents a request during book creation.
 * <p/>
 *
 * @author Ram Ayall
 * @since 17/03/19
 */
package com.busyunit.email.docker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Recipe {

    @JsonProperty("bookmarks")
    private long bookmarks;

    @JsonProperty("creationDate")
    private long creationDate;

    @JsonProperty("creationDate")
    private String cuisine;

    private String desc;

    private long duration;

    private String fullname;

    private boolean hasCooked;

    private String id;

    private List<Ingredient> ingredient;

    private boolean isSelected;

    private long likes;

    private List<Method> method;

    private List<String> pathList;

    private String recipeLink;

    private long recooked;

    private long serving;

    private String title;

    private List<String> typeChecked;

    private List<String> photoURI;

    private String userID;

    private String userPhotoURL;
}

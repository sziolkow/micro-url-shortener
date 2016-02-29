package org.home.sziolkow.microservice.urlshortener.model;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.core.IsNull.notNullValue;

/**
 * Represents main business object in the system
 */
public class ShortUrl {

    private String longLink;

    private String shortLink;

    private String description;

    public ShortUrl(String longLink, String shortLink, String description) {
        assertThat("Item can't be null", longLink, is(notNullValue()));
        assertThat("Item can't be null", shortLink, is(notNullValue()));
        assertThat("Item can't be null", description, is(notNullValue()));
        this.longLink = longLink;
        this.shortLink = shortLink;
        this.description = description;
    }
}

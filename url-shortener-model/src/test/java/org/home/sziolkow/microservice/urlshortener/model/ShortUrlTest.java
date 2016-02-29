package org.home.sziolkow.microservice.urlshortener.model;

import org.junit.Test;

/**
 * Represents main business object in the system
 */
public class ShortUrlTest {


    @Test(expected = AssertionError.class)
    public void must_have_longLink() {
      new ShortUrl("short", null, "desc");
    }


    @Test(expected = AssertionError.class)
    public void must_have_longShort() {
        new ShortUrl(null, "short", "desc");
    }


    @Test(expected = AssertionError.class)
    public void must_have_description() {
        new ShortUrl("short", "long", null);
    }

    @Test
    public void must_have_all_propertes_set() {
        new ShortUrl("short", "long", "desc");
    }
}

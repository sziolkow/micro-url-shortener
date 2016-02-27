package org.home.sziolkow.microservice.management;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@Entity
public class UrlItem {

	@Id
	@GeneratedValue
	private Long id;

	@Column(nullable = false)
	private String shortLink;

    @Column(nullable = false)
    private String longLink;

    @Column(nullable = false)
    private String description;

    public UrlItem() {
        super();
    }

	public UrlItem(String longLink, String shortLink, String description) {
        assertThat("Item can't be null", longLink, is(notNullValue()));
        assertThat("Item can't be null", shortLink, is(notNullValue()));
        assertThat("Item can't be null", description, is(notNullValue()));
        this.longLink = longLink;
        this.shortLink = shortLink;
        this.description = description;
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getShortLink() {
        return shortLink;
    }

    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    public String getLongLink() {
        return longLink;
    }

    public void setLongLink(String longLink) {
        this.longLink = longLink;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);

	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

}

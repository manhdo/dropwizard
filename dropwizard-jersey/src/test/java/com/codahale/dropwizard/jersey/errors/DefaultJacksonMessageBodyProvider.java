package com.codahale.dropwizard.jersey.errors;

import com.codahale.dropwizard.jackson.Jackson;
import com.codahale.dropwizard.jersey.jackson.JacksonMessageBodyProvider;

import javax.validation.Validation;
import javax.ws.rs.ext.Provider;

@Provider
public class DefaultJacksonMessageBodyProvider extends JacksonMessageBodyProvider {
    public DefaultJacksonMessageBodyProvider() {
        super(Jackson.newObjectMapper(), Validation.buildDefaultValidatorFactory().getValidator());
    }
}

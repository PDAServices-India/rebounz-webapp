package com.rebounz.rest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.glassfish.jersey.server.validation.ValidationFeature;

import com.rebounz.login.resource.LoginResource;

public class RebounzRestConfig extends ResourceConfig {
	
	public RebounzRestConfig() {
		register(LoginResource.class);
		register(RequestContextFilter.class);
        register(JacksonFeature.class);
        //enable logging
        register(LoggingFilter.class);
        //enable jersey bean validation
        register(ValidationFeature.class);	
	}

}

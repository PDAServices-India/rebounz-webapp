package com.rebounz.rest.config;

import org.glassfish.jersey.filter.LoggingFilter;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.ServerProperties;
import org.glassfish.jersey.server.spring.scope.RequestContextFilter;
import org.glassfish.jersey.server.validation.ValidationFeature;

import com.rebounz.common.exception.ApplicationExceptionMapper;
import com.rebounz.common.exception.NotFoundExceptionMapper;
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
        // exception mapper classes
        register(ApplicationExceptionMapper.class);
        register(NotFoundExceptionMapper.class);
        //enable error response to the client for JSR 303 bean validations
        property(ServerProperties.BV_SEND_ERROR_IN_RESPONSE, true);
        
	}

}

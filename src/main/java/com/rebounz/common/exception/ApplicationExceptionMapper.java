package com.rebounz.common.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Provider
public class ApplicationExceptionMapper implements ExceptionMapper<ApplicationException> {

	private static final Log LOGGER = LogFactory.getLog(ApplicationExceptionMapper.class);

	@Override
	public Response toResponse(ApplicationException ex) {
		LOGGER.error(String.format("Message : %s , Code : %d", ex.getMessage(), ex.getCode()), ex);
		return Response.status(ex.getCode())
				.entity(ex.getMessage())
				.type(MediaType.TEXT_PLAIN)
				.build();
	}

}

package com.rebounz.common.exception;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class NotFoundExceptionMapper implements ExceptionMapper<NotFoundException> {

	private static final Log LOGGER = LogFactory.getLog(NotFoundExceptionMapper.class);
	
	@Override
	public Response toResponse(NotFoundException ex) {
		LOGGER.error(String.format("Message : %s , Entity : %s", ex.getMessage(), ex.getEntityName()), ex);
		return Response.status(Status.NOT_FOUND)
				.entity(ex.getMessage())
				.type(MediaType.TEXT_PLAIN)
				.build();
	}

}

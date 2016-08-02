package com.rebounz.common.exception;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

public class ApplicationExceptionMapper implements ExceptionMapper<ApplicationException> {

	@Override
	public Response toResponse(ApplicationException ex) {
		// TODO Auto-generated method stub
		return null;
	}

}

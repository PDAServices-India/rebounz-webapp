package com.rebounz.login.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

import com.rebounz.common.exception.ApplicationException;

@Component
@Path("/login")
public class LoginResource {
	
	private static final Logger LOGGER = Logger.getLogger(LoginResource.class);
	
	@POST
	@Path("/validateLogin")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response validateLogin(
			@NotBlank(message = "{username.field.mandatory}") @FormParam("username") String username, 
			@NotBlank(message = "{password.field.mandatory}") @FormParam("password") String password)
					throws ApplicationException	{
		LOGGER.info(String.format("Validating user login for %s : ", username));
		return Response.ok().entity("SUCCESS").build();
	}
	
	@GET
	@Path("/checkUsernameExists/{username}")
	public Response checkUsernameExists(@PathParam("username") String username) {
		
		return null;
	}

}

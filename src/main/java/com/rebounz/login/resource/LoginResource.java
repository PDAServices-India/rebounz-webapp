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
import javax.ws.rs.core.Response.Status;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rebounz.common.exception.ApplicationException;
import com.rebounz.common.exception.NotFoundException;
import com.rebounz.login.beans.User;
import com.rebounz.login.beans.Account;
import com.rebounz.login.service.AccountService;
import com.rebounz.login.service.UserService;

@Component
@Path("/login")
public class LoginResource {

	private static final Log LOGGER = LogFactory.getLog(LoginResource.class);

	@Autowired
	private UserService userService;
	
	@Autowired
	private AccountService accountService;

	@POST
	@Path("/validateLogin")
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	@Produces(MediaType.APPLICATION_JSON)
	public Response validateLogin(
			@NotBlank(message = "{username.field.mandatory}") @FormParam("username") String username,
			@NotBlank(message = "{password.field.mandatory}") @FormParam("password") String password)
			throws ApplicationException, NotFoundException {
		LOGGER.info(String.format("Validating user login for %s : ", username));
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		boolean isValidLogin = userService.authenticateUser(user);
		if (!isValidLogin) {
			return Response.status(Status.UNAUTHORIZED)
					.entity("Invalid username or password.").build();
		}
		User validUser = userService.findUserByUsername(username);
		return Response.ok().entity(validUser).build();
	}

	@GET
	@Path("/checkUsernameExists/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response checkUsernameExists(@PathParam("username") String username)
			throws NotFoundException {
		User user = userService.findUserByUsername(username);
		return Response.ok().entity(user).build();
	}

	@POST
	@Path("/userRegistration")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response userRegistration(User userDetails)
			throws ApplicationException {
		userService.userRegistration(userDetails);
		return Response.ok().build();
	}
	
	@POST
	@Path("/accountDetails")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response accountDetails(Account accDetails)
			throws ApplicationException {
		accountService.updateAccDetails(accDetails);
		return Response.ok().build();
	}
	
	
	@GET
	@Path("/getaccountDetails/{username}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAccountDetails(@PathParam("username") String username)
			throws NotFoundException {
		Account accDet = accountService.getAccountDetails(username);
		return Response.ok().entity(accDet).build();
	}

	/*
	 * @GET
	 * 
	 * @Path("/forgotPassword/{username}")
	 * 
	 * @Produces(MediaType.APPLICATION_JSON) public Response
	 * forgotPassword(@PathParam("username") String username) throws
	 * NotFoundException { User user = userService.findUserByUsername(username);
	 * return Response.ok().entity(user).build(); }
	 */

}

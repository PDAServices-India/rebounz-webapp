package com.rebounz.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rebounz.login.resource.LoginResource;

public class RebounzAjaxController extends AbstractController {
	
	private static final Log LOGGER = LogFactory.getLog(RebounzAjaxController.class);

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView model = new ModelAndView("Login");
		model.addObject("msg", "Success");
		return model;	
	}

}

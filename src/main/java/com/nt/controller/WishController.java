package com.nt.controller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class WishController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Calendar calendar=null;
		int hour=0;
		String msg=null;
		//get System date and time
		calendar=calendar.getInstance();
		//get current hour of the day
		hour=calendar.get(Calendar.HOUR_OF_DAY);
		
		if(hour<=12)
			msg="Good Morning";
		else if(hour<=16)
			msg="Good Afternoon";
		else if(hour<=20)
			msg="Good Evening";
		else
			msg="Good Night";
		
		return new ModelAndView("result","wMsg",msg);
		
	}

}

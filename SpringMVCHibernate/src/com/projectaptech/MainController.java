package com.projectaptech;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.projectaptech.entities.User;
import com.projectaptech.service.UserService;

@Controller
public class MainController {
	
	UserService userservice;

	@GetMapping("/")
	public ModelAndView welcome()
	{
		ModelAndView modelAndView = new ModelAndView("welcome");
		User user = new User();
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
	//Submit Details
	@PostMapping("/submitDetails")
	public ModelAndView submitDetails(User user)
	{
		ModelAndView modelAndView = new ModelAndView("displayinfo");
		modelAndView.addObject("user",user);
		//not called service ?
		//Now done Below
		userservice = new UserService();
		userservice.addUser(user);
		return modelAndView;
	}
}

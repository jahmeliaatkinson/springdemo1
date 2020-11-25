package com.tcs.mvcdemo.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.tcs.mvcdemo.model.Registration;
import com.tcs.mvcdemo.repository.RegistrationRepository;

@Controller
@RequestMapping(path="/registration")
public class RegistrationController {

	

	@Autowired
	RegistrationRepository registrationRepository;
	@GetMapping("/registration.jsp")
	public String getRegistrationPage() {
		return "registration";
	}
	
	@PostMapping("/registration.jsp")
	public ModelAndView validateLogin(@ModelAttribute @Valid Registration registration,BindingResult result) {
		System.out.println("hello from validatelogin"+registration);
		ModelAndView modelAndView = new ModelAndView();
		if(result.hasErrors()) {
			result.getFieldErrors().forEach(e->{
				modelAndView.addObject(e.getField(), e.getDefaultMessage());
				System.out.println(e.getDefaultMessage() + " "+ e.getField());
				
			});
			modelAndView.setViewName("registration");
			return modelAndView;
		}
		
		if(registration.equals(registrationRepository.findById(registration.getUserName()).get())) {
			System.out.println("success");
		}
		else {
			System.out.println("fail");
		}
		modelAndView.setViewName("redirect:/dashboard");
		return modelAndView;
	}
	
	
	
	}

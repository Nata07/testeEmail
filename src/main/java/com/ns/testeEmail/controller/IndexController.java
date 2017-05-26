package com.ns.testeEmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.testeEmail.model.ModeloEmail;

@Controller
public class IndexController {
	
	@RequestMapping("/testeEmail")
	public ModelAndView indexController(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject(new ModeloEmail());
		return mv;
	}
	
	
	
	public ModelAndView teste(ModeloEmail email){
		ModelAndView mv = new ModelAndView("index");
		System.out.println(">>>>>>> " + email.getNome());
		mv.addObject("mensagem", "Ttitulo salvo.");
		return mv;
	}
}

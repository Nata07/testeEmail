package com.ns.testeEmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ts.testeEmail.model.Mensagem;
import com.ts.testeEmail.model.ModeloEmail;

@Controller
public class IndexController {
	
	@RequestMapping("/testeEmail")
	public ModelAndView indexController(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject(new ModeloEmail());
		return mv;
	}
	
	@RequestMapping("/testeMensagem")
	public ModelAndView mensagemController(){
		ModelAndView mv = new ModelAndView("mensagem");
		mv.addObject(new Mensagem());
		return mv;
	}
	
	
	public ModelAndView teste(ModeloEmail email){
		ModelAndView mv = new ModelAndView("index");
		System.out.println(">>>>>>> " + email.getNome());
		mv.addObject("mensagem", "Ttitulo salvo.");
		return mv;
	}
}

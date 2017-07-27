package com.ns.testeEmail.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ts.testeEmail.model.AbstractMessageSender;
import com.ts.testeEmail.model.ModeloEmail;

@Controller
public class SimpleHtmlMessageSender extends AbstractMessageSender {
	
	 //private JavaMailSender javaMailSender;

	
//	public ModelAndView sendMensagem() throws MessagingException {
//		MimeMessage msg = sender.createMimeMessage();
//		MimeMessageHelper helper = new MimeMessageHelper(msg);
//		
//		helper.setTo("nata.jc10@gmail.com");
//		helper.setFrom("nata.mw@hotmail.com");
//		helper.setSubject("assunto");
//		helper.setText("<html> <head> </head> <body> <h1> Teste email"
//				+"</h1> </body> </html>", true);
//		sender.send(msg);
//		ModelAndView mv = new ModelAndView("index");
//		mv.addObject("mensagem", "Email enviado");
//		return mv;
//	}
	 
	 
	 
	 @RequestMapping(value="/teste", method = RequestMethod.POST)
	 public ModelAndView salvar(@Validated ModeloEmail email, Errors errors) {
		 
		 ModelAndView mv = new ModelAndView("index");
		 if(errors.hasErrors()){
			 return mv; 
		 }
		 
		 System.out.println(">>>>>>>>>>>>>>>>>   passou ");
		 
		 return mv;
//		 
//		System.out.println("chegou aqui 1");
//		
//	    SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setTo("nata.jc10@gmail.com");
//		mailMessage.setSubject(email.getNome());
//		mailMessage.setText(email.getNome());
//		mailMessage.setFrom(email.getEmail());
//		javaMailSender.send(mailMessage);
//		System.out.println("chegou aqui 2");
//		mv.addObject("mensagem", "Ttitulo salvo.");
//		return mv;
//		 
//
	
	 }
}

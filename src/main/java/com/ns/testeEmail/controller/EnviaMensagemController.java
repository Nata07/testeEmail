package com.ns.testeEmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ts.testeEmail.model.Mensagem;

@Controller
public class EnviaMensagemController {
	private JavaMailSender javaMailSender;
	
	@Autowired
	public EnviaMensagemController(JavaMailSender javaMailSender) {
		this.javaMailSender = javaMailSender;
	}
	
	@RequestMapping("/enviaMensagem")
	public ModelAndView enviaMensagem(Mensagem mensagem) {
		ModelAndView mv = new ModelAndView("mensagem");
		System.out.println("Montou o html");
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(mensagem.getEmail());
		mailMessage.setSubject(mensagem.getTituloMensagem());
		mailMessage.setText(mensagem.getMensagem());
		mailMessage.setFrom(mensagem.getEmail());
		javaMailSender.send(mailMessage);
		System.out.println("E-mail enviado com sucesso");
		return mv;		
	}

}

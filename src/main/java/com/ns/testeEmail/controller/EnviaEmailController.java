package com.ns.testeEmail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ts.testeEmail.model.ModeloEmail;

@Controller
public class EnviaEmailController   {
	private JavaMailSender javaMailSender;

    @Autowired
    public EnviaEmailController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
    @RequestMapping("/enviaemail")
    public ModelAndView sendMail(ModeloEmail email) {
    	ModelAndView mv = new ModelAndView("index");
    	System.out.println("chegou aqui ");
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("natanael@adminfo.com.br");
        mailMessage.setSubject(email.getMensagem());
        mailMessage.setText(email.getMensagem());
        mailMessage.setFrom(email.getEmail());
        javaMailSender.send(mailMessage);
        System.out.println("chegou aqui 2");
        return mv;
    }
}

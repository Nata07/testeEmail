package com.ts.testeEmail.model;

import org.springframework.mail.javamail.JavaMailSender;

public abstract class AbstractMessageSender {
	
	protected String toEmail;
	protected String fromEmail;
	protected String assunto;
	protected JavaMailSender sender;
	
	public String getToEmail() {
		return toEmail;
	}
	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}
	public String getFromEmail() {
		return fromEmail;
	}
	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}
	public String getAssunto() {
		return assunto;
	}
	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}
	public JavaMailSender getSender() {
		return sender;
	}
	public void setSender(JavaMailSender sender) {
		this.sender = sender;
	}
	
	
	
}

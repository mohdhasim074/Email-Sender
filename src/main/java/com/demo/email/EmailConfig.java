package com.demo.email;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {
	@Bean
	public SimpleMailMessage emailTemplate() {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo("mohdhasim0074@gmail.com");
		message.setFrom("myjio0189@gmail.com");
		message.setSubject("spring boot email");
		message.setText("FATAL :- Application crash. Save your job !!");
		return message;
	}
}
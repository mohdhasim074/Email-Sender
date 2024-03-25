package com.demo.email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner 
{
	@Autowired
    private EmailService emailService;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
    @Override
    public void run(String... args) 
    {
    	emailService.sendMailWithAttachment("mohdhasim0074@gmail.com", "springBoot email", "I am testing this.", "git.png");
    	
    	emailService.sendPreConfiguredMail("email sending with spring boot.");
    }
}

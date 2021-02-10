package com.test.testing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.testing.SendEmail.MailSender;

@RestController
public class EmailController {
	
	@Autowired
	MailSender mail; //this is object of interface
	
	@RequestMapping("/send")
	public String sendMessage()
	{
		mail.sendMail("samshinde5299@gmail.com","demo practice", "for paraga");
		return "mail send";
	}

}

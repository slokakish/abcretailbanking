package com.hcl.retailbanking.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class MailService {
	@Autowired
	public JavaMailSender emailSender;

	public void sendOTPMail(String to) {
		try{
			sendMail(to, generateOTP());
			System.out.println("Email sent successfully...");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	private void sendMail(String to, String otp) throws Exception{
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(to);
		message.setSubject("This is OTP to verify the Payee !!!");
		message.setText(generateOTP());
		emailSender.send(message);
	}
	
	public static String generateOTP() {
	Random rnd = new Random();
	int number = rnd.nextInt(999999);
	return String.format("%06d", number);
	}
	


}

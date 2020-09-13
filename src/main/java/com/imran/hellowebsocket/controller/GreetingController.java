package com.imran.hellowebsocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.imran.hellowebsocket.message.Greeting;
import com.imran.hellowebsocket.message.HelloMessage;

@Controller
public class GreetingController {
	
	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) {
		System.out.println("Recieved message: " + message.getName());
		return new Greeting(message.getName());
	}
}

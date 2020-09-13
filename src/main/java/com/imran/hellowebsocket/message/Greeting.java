package com.imran.hellowebsocket.message;

public class Greeting {
	private String content;

	public Greeting(String name) {
		this.content = "Howdy " + name + "!!";
	}
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}

package com.ynovick.githubdemo_01;

public class MessageDisplayer {
	private String msg;
	public MessageDisplayer(String msg)
	{
		// display the message
		this.msg = msg;
	}
	public void display()
	{
		System.out.println(msg);		
	}
}

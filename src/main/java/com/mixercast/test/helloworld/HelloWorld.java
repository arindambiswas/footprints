package com.mixercast.test.helloworld;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport
{
	public static final String MESSAGE = "Struts is up and running ...";

	public String execute() throws Exception
	{
		setMessage(MESSAGE);
		return SUCCESS;
	}

	private String message;

	public void setMessage(String message)
	{
		this.message = message;
	}

	public String getMessage()
	{
		return message;
	}
}

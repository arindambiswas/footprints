package com.mixercast.footprints.vo.addressBook;

public class PersonVO
{
	private String fname;
	private String lname;
	
	public PersonVO()
	{
	}

	public void setFirstName(String fname)
	{
		this.fname = fname;
	}

	public String getFirstName()
	{
		return fname;
	}

	public void setLastName(String lname)
	{
		this.lname = lname;
	}

	public String getLastName()
	{
		return lname;
	}
	
}

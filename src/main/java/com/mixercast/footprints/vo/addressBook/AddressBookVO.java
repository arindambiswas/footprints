package com.mixercast.footprints.vo.addressBook;

import java.util.Date;
import java.util.List;

public class AddressBookVO
{

	private List<PersonVO> persons;

	public AddressBookVO()
	{
	}

	public void setPersons(List <PersonVO> persons)
	{
		this.persons = persons;
	}

	public List<PersonVO> getPersons()
	{
		return persons;
	}
}


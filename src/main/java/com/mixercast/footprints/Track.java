package com.mixercast.footprints;

import com.mixercast.footprints.serializer.AmfSerializer;
import com.mixercast.footprints.vo.CurrentDayVO;
import com.mixercast.footprints.vo.addressBook.AddressBookVO;
import com.mixercast.footprints.vo.addressBook.PersonVO;
import com.opensymphony.xwork2.ActionSupport;

public class Track extends ActionSupport
{
	public static final String MESSAGE = "Tracking is ready to commence!!!";

	public String execute() throws Exception
	{
		
		AmfSerializer amfs = new AmfSerializer();
//		CurrentDayVO currentDay  = amfs.fromAmf(getTrackData());
		
		AddressBookVO addressBook = amfs.fromAmf(getTrackData());
		for(int i=0; i<addressBook.getPersons().size(); i++)
		{
			PersonVO p = addressBook.getPersons().get(i);
			System.out.println("Hello World " + p.getFirstName());
		}
		setMessage(getTrackData());
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
	
	
	private String trackData;

	public String getTrackData()
	{
		return trackData;
	}

	public void setTrackData(String trackData)
	{
		this.trackData = trackData;
	}
	
}

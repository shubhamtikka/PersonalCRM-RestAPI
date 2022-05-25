package com.PersonalCRM.model;

import java.util.List;

public class Contact {
	
	int id;
	String name;
	String emailId;
	String phoneNumber;
	String relation;
	
	List<Note> notes;
	
	List<Reminder> reminders;

}

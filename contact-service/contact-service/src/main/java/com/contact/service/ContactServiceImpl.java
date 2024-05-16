package com.contact.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	//Fake List of conatct
	
	List<Contact> list=List.of(
			new Contact(1L,"anu@gmail.com","Anu",1111L),
			new Contact(2L,"Dhanu@gmail.com","Dhanu",2222L),
			new Contact(3L,"komal@gmail.com","Komal",3333L),
			new Contact(4L,"Arohi@gmail.com","Arohi",4444L)


			);
			
	
	@Override
	public List<Contact> getContactOfUser(Long UserID) {

		return list.stream().filter(contact->contact.getUserID().equals(UserID)).collect(Collectors.toList());
	}

}

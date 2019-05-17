package com.capgemini.hibernate.person;

import javax.persistence.*;

@Entity
public class Person {
	@Id
	int personId;
	String personName;

	public Person(int personId, String personName){
		this.personId = personId;
		this.personName = personName;
	}
	
	@Override
	public String toString(){
		return ("Id:"+personId+"Name:"+personName);
	}


}
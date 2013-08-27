package mns.service;

import mns.model.Person;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author NovaS
 */
@Service
@Scope("prototype")
public class PersonService {
	private Person person;
	
	public PersonService() {
		person = new Person();
		person.setId(1);
		person.setName("test");
		person.setAge(20);
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}

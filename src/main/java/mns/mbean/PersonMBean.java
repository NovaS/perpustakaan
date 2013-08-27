package mns.mbean;

import mns.model.Person;
import mns.service.PersonService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author NovaS
 */
@Component
@Scope("request")
public class PersonMBean {
	@Autowired
	private PersonService service;
	
	public Person getPerson() {
		return service.getPerson();
	}
	public void setPerson(Person person) {
		this.service.setPerson(person);
	}
}

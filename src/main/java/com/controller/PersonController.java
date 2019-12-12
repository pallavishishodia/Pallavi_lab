package com.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.dao.PersonDAO;
import com.model.Person;

@RestController
public class PersonController {

	@Autowired
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}

	@Transactional
	public void addPerson(Person p) {
		this.personDAO.addPerson(p);
	}


	@Transactional
	public void updatePerson(Person p) {
		this.personDAO.updatePerson(p);
	}

	
	@Transactional
	public List<Person> listPersons() {
		return this.personDAO.listPersons();
	}


	@Transactional
	public Person getPersonById(int id) {
		return this.personDAO.getPersonById(id);
	}

	
	@Transactional
	public void removePerson(int id) {
		this.personDAO.removePerson(id);
	}

}
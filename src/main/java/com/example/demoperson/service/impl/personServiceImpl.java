package com.example.demoperson.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.example.demoperson.commons.GenericServiceImpl;
import com.example.demoperson.dao.api.PersonDaoApi;
import com.example.demoperson.model.person;
import com.example.demoperson.service.api.personServiceAPI;

@Service
public class personServiceImpl extends GenericServiceImpl<person, Long> implements personServiceAPI{
	
	@Autowired
	private PersonDaoApi personDaoAPI;

	@Override
	public CrudRepository<person, Long> getDao() {
		return personDaoAPI;
	}

}

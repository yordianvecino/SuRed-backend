package com.example.demoperson.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.example.demoperson.model.person;

public interface PersonDaoApi extends CrudRepository<person, Long> {

}

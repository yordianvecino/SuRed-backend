package com.example.demoperson.commons;

import java.io.Serializable;
import java.util.List;

public interface GenericServiceAPI<T, ID extends Serializable> {
	
	T save(T entity);
	
	void delete(ID id_person);
	
	T get(ID id_person);
	
	List<T> getAll();
}
 
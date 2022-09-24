package com.example.demoperson.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id_person;
	
	@Column
	private String name;
	
	@Column
	private String appeals;
	
	@Column
	private String phone;
	
	@Column
	private String email;
	
	@Column
	private String city;
	
	@Column
	private String country;

	public Long getId_person() {
		return id_person;
	}

	public void setId_person(Long id_person) {
		this.id_person = id_person;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAppeals() {
		return appeals;
	}

	public void setAppeals(String appeals) {
		this.appeals = appeals;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}

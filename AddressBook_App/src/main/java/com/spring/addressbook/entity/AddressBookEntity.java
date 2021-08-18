package com.spring.addressbook.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.spring.addressbook.dto.AddressBookDTO;

import lombok.Data;

@Entity
@Table(name = "Address_Book")
public class AddressBookEntity 
{
	@Id
	@GeneratedValue()
	private int id;
	private String name;
	private String address;
	private String city;
	private String zip;
	private String email;
	private String phone;
	private LocalDate createdDate;
	private LocalDate updatedDate;
	
	public AddressBookEntity(AddressBookDTO dto)
	{
		this.name = dto.getName();
		this.address = dto.getAddress();
		this.city = dto.getCity();
		this.zip = dto.getZip();
		this.email = dto.getEmail();
		this.phone = dto.getPhone();
		this.createdDate = LocalDate.now();
		this.updatedDate = LocalDate.now();
	}
	
	public AddressBookEntity()
	{
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public LocalDate getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDate createdDate) {
		this.createdDate = createdDate;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	
}

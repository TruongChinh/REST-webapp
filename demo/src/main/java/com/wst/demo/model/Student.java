/**
 * 
 */
package com.wst.demo.model;

import java.util.List;

/**
 * @author TruongChinh
 *
 */
public class Student {
	private int id;
	private String firstName;
	private String lastName;
	private boolean active;
	
	private Address address;
	
	private List<String> language;

	/**
	 * 
	 */
	public Student() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the active
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(boolean active) {
		this.active = active;
	}

	/**
	 * @return the addr
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param addr the addr to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @return the languages
	 */
	public List<String> getLanguage() {
		return language;
	}

	/**
	 * @param languages the languages to set
	 */
	public void setLanguage(List<String> language) {
		this.language = language;
	}
	
	

}

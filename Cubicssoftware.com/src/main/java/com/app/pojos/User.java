package com.app.pojos;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User extends BaseEntity
{
	private String name;
	  private String fullname;
	  private String email;
	  private String password;
	  private String phonenumber;
	  private String country;
	  private String address;
	  
	  @Enumerated(EnumType.STRING)
	  private GenderType gender;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public GenderType getGender() {
		return gender;
	}

	public void setGender(GenderType gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", fullname=" + fullname + ", email=" + email + ", password=" + password
				+ ", phonenumber=" + phonenumber + ", country=" + country + ", address=" + address + ", gender="
				+ gender + "]";
	}

	public User(String name, String fullname, String email, String password, String phonenumber, String country,
			String address, GenderType gender) {
		super();
		this.name = name;
		this.fullname = fullname;
		this.email = email;
		this.password = password;
		this.phonenumber = phonenumber;
		this.country = country;
		this.address = address;
		this.gender = gender;
	}

	public User() {
		super();
	}
	  
	  
}

package com.oxbank.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer_Details")
public class CustomerDetails {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	private long mobileNumber;
	private int age;
	private String gender;
	private String maritalStatus;
	private int creditScore;

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

	public long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}

	public CustomerDetails(int id, String name, long mobileNumber, int age, String gender, String maritalStatus,
			int creditScore) {
		super();
		this.id = id;
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.age = age;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
		this.creditScore = creditScore;
	}

	public CustomerDetails() {
		super();
	}

	@Override
	public String toString() {
		return "CustomerDetails [id=" + id + ", name=" + name + ", mobileNumber=" + mobileNumber + ", age=" + age
				+ ", gender=" + gender + ", maritalStatus=" + maritalStatus + ", creditScore=" + creditScore + "]";
	}

}

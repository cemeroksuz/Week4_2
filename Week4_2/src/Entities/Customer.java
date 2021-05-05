package Entities;

import java.time.LocalDate;

public class Customer {

	public int Id;
	public String FirstName;
	public String LastName;
	public LocalDate DateOfBirth;
	public String NdtionalityId;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public String getNdtionalityId() {
		return NdtionalityId;
	}
	public void setNdtionalityId(String ndtionalityId) {
		NdtionalityId = ndtionalityId;
	}
	

	
	
}

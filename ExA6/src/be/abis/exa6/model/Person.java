package be.abis.exa6.model;

import java.time.LocalDate;

public class Person {
	
	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private Company company1;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate, Company company1) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.company1 = company1;
	}

	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}
	
	
	
	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Company getCompany1() {
		return company1;
	}

	public void setCompany1(Company company1) {
		this.company1 = company1;
	}

	
	@Override
	public String toString() {
		if (this.company1 == null) {
			return "Person [personNumber=" + personNumber + ": " + firstName + " " + lastName
					+ "(" + calculateAge(birthDate) + " years old) is not employed for the moment";
		}
		else {
			return "Person [personNumber=" + personNumber + ": " + firstName + " " + lastName
					+ "(" + calculateAge(birthDate) + " years old) works for " + company1.getName() + " in " + company1.getAdres1().getTown();
		}
	
	}
	
	
	public int calculateAge(LocalDate dateIn) {
		
		LocalDate dateNow = LocalDate.now();
		
		int ageNow = dateNow.getYear() - dateIn.getYear();
		
		return ageNow;
		
	}
	

}

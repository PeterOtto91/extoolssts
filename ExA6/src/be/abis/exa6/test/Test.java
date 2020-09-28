package be.abis.exa6.test;

import java.time.LocalDate;

import be.abis.exa6.model.Address;
import be.abis.exa6.model.Company;
import be.abis.exa6.model.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Address a1 = new Address ("Vaartdijk", "3", "1981", "Hofstade", "Belgium", "BE");
	Company c1 = new Company("BBB", a1);
	Person p1 = new Person(1, "Wim", "Vermeer", LocalDate.of(1980, 1, 8), c1);
	Person p2 = new Person(1, "Eric", "Willems", LocalDate.of(1998, 2, 3));
	
	System.out.println(p1.toString());
	System.out.println(p2.toString());
	}

}

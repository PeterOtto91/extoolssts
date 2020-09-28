package be.abis.courseadmin.test;

import java.lang.NumberFormatException;
import java.util.ArrayList;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

import java.io.IOException;

public class Test {
	
	
	public static void main(String[] args) {
		
		try {
		
			ArrayList<String> inst = new ArrayList<String>();
	
			Course nC1 = new Course("Java", 5, 201.5, true, inst);
			
			Instructor nI1 = new Instructor("Wim", "Gerets", 25, 2000);
			nI1.printSalaryHistory(50);
			nI1.printInfo();
			
			Instructor nI2 = new Instructor("Eric", "Goossens", 32, 2150);
			nI2.printSalaryHistory(45);
			nI2.printInfo();
			
			nC1.addInstructor(nI1);
			nC1.addInstructor(nI2);
			nC1.printInfo();
			
			
		}

		catch(NumberFormatException e) {
		
			System.out.println ("Not Numeric, please run again with correct value.");
		
		}

		catch(IOException e) {
			System.out.println ("IO error");
			
		}	
	
	
	}
		
	
}
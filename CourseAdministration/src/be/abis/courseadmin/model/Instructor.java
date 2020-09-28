package be.abis.courseadmin.model;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class Instructor {

	private String firstName;
	private String lastName;
	private int startDate;
	private double startWage;


	public Instructor (String firstName, String lastName, int startDate, double startWage) throws NumberFormatException{
		this.firstName = firstName;
		this.lastName = lastName;
		this.startDate = startDate;
		this.startWage = startWage;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public void setfirstName(String fname){
		this.firstName = fname;
	}

	public String getLasName(){
		return this.lastName;
	}
	
	public void setLastName(String lName){
		this.lastName = lName;
	}
	
	public int getStartDate(){
		return this.startDate;
	}
	
	public void setStartDate(int sDate) throws NumberFormatException{
		this.startDate = sDate;
	}
	
	public double getStartWage(){
		return this.startWage;
	}
	
	public void setStartWage(double sWage) throws NumberFormatException{
		this.startWage = sWage;
	}
	
	public void printSalaryHistory(int ageIn) throws IOException {
		
		int limitI = ageIn;
		double salaryUp = this.startWage; 
		
		BufferedWriter bw = null;
		File outputFile = new File("salaryhistory.txt");
		FileWriter myWriter = new FileWriter("salaryhistory.txt");
		bw = new BufferedWriter(myWriter);
		
		for (int i=this.startDate; i < limitI; i+=5) {
			
			salaryUp = salaryUp * 1.03;
			
			bw.write ("Salary of " + this.firstName + " at " + i + " is " + salaryUp);
			bw.newLine();
			
			if (i > (this.startDate +35)) {
				bw.write ("Maximum Salary Reached");
				break;
			}
		}
			
		
		bw.close();
		myWriter.close();
		
	}
	
	
	public void printInfo() {
		
		System.out.println ("Instructor Info");
		System.out.println ("---------------");
		System.out.println ("Firs tName:   " + this.firstName);
		System.out.println ("Last Name:    " + this.lastName);
		System.out.println ("Start Age:    " + this.startDate);
		System.out.println ("Start Salary: " + this.startWage);
		System.out.println (" ");
		
	}
	
	
	
	
}








package be.abis.courseadmin.model;

import java.util.ArrayList;

public class Course {

	private String courseTitle;
	private int courseNumberDays;
	private double coursePriceDay;
	private boolean courseKnowledge = false;
	private ArrayList<String> courseInstructors = new ArrayList<String>();


	public Course (String courseTitle, int courseNumberDays, double coursePriceDay, boolean courseKnowledge, ArrayList courseInstructors) throws NumberFormatException {
		this.courseTitle = courseTitle;
		this.courseNumberDays = courseNumberDays;
		this.coursePriceDay = coursePriceDay;
		this.courseKnowledge = courseKnowledge;
		this.courseInstructors = courseInstructors;
	}
	
	public String getCourseTitle(){
		return this.courseTitle;
	}
	
	public void setCourseTitle(String title){
		this.courseTitle = title;
	}

	public int getCourseNumberDays(){
		return this.courseNumberDays;
	}
	
	public void setCourseTitle(int days) throws NumberFormatException{
		this.courseNumberDays = days;
	}
	
	public double getCoursePriceDay(){
		return this.coursePriceDay;
	}
	
	public void setCoursePriceDay(double price) throws NumberFormatException{
		this.coursePriceDay = price;
	}
	
	public boolean getCourseKnowledge(){
		return this.courseKnowledge;
	}
	
	public void setCourseKnowledge(boolean knowledge){
		this.courseKnowledge = knowledge;
	}
	
	public ArrayList getCourseInstructors(){
		return this.courseInstructors;
	}
	
	public void setCourseInstructors(ArrayList instructors){
		this.courseInstructors = instructors;
	}
	
	
	
	public void addInstructor(String newInstructor){
		this.courseInstructors.add(newInstructor);
		
	}
	
	public void removeInstructor(String rInstructor){
		this.courseInstructors.remove(rInstructor);
	}
	
	
	
	public void printInfo() {
		
		System.out.println ("Course Info");
		System.out.println ("-----------");
		System.out.println ("Title:                    " + this.courseTitle);
		System.out.println ("Number of Days:           " + this.courseNumberDays);
		System.out.println ("Price per Day:            " + this.coursePriceDay);
		System.out.println ("Preliminary Requirements? " + this.courseKnowledge);
		System.out.println ("Number of instructors =   " + this.courseInstructors.size());
		System.out.println (" ");
		
		
		int nItem = 0;
		for(int i = 0; i < courseInstructors.size(); i++) {
			
			nItem++;
			System.out.println ("Instructor " + nItem + " = " + this.courseInstructors.get(i));
			
		}	
		
	}
	
	
	public double calculateTotalPrice () {
	
		double priceOfCourse = this.courseNumberDays * this.coursePriceDay;
		double totalPriceOfCourse = 0;
		
		if ((this.courseNumberDays > 3) && (this.courseKnowledge)) {
			totalPriceOfCourse = priceOfCourse;
		}
		else {
			totalPriceOfCourse = priceOfCourse + (priceOfCourse / 100 * 21);
		}
		
		return totalPriceOfCourse;
	
	}
	
	
}








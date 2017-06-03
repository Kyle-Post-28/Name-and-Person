/*
Filename: Name.java
Author: Kyle Post
Date: January 5, 2017
Purpose: This is to practice creating
and editing classes and objects. Then
testing them to make sure they work
*/

import java.util.*;
//Name.java
public class Name {
	private String firstName,lastName;
	//Default constructor with no arguments
	public Name() {
		firstName = "";
		lastName = "";
	}
	//Constructor with the arguments of firstName and lastName
	//both String data types
	public Name (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;	
	}
	//Create a toString method for output
	public String toString() {
		return "\n\tName: " + lastName + ", " + firstName;
	}
	//Read a name from the supplied input 
   public void input(Scanner in) { 
      if (in.hasNext()) firstName = in.next();
      if (in.hasNext()) lastName = in.next();
	}   
}

//Person.java
class Person {
   //Instance variables
   private Name name;     
   private int id;        
      //Constructor initializing instance variables with supplied names
   public Person(String firstName, String lastName) {
      name = new Name(firstName, lastName);     
      id =  (int )(Math.random() * 200 + 100);;       
   }
   //Present a Person object as a string
   public String toString() {    
      return "\n\tId: " + id + name;
   }
   //Display the data of a Person object
   public void display() {
      System.out.println("<<Person>>>" + this);    
   }
}

//Student.java
class Student extends Person {
   private double gpa;
   public Student(String firstName, String lastName, double gpa) {
      super(firstName, lastName);    
      this.gpa = gpa;
   }
   public String toString() {
      return super.toString() + "\n\tGPA: " + gpa;
   }
   public void display() {
      System.out.println("<<Student>>" + this);
   }
}

class Employee extends Person {
   private int salary;
   public Employee (String firstName, String lastName, int salary) {
     super(firstName, lastName);
     this.salary = salary;
   }
   public String toString() {
      return super.toString() + "\n\tSalary: " + salary;
   }
   public void display() {
      System.out.println("<<Employee>>" + this);
   }
} 
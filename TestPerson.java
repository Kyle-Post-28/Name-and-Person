/*
Filename: TestPerson.java
Author: Kyle Post
Date: January 5, 2017
Purpose: This program will test
the person class already created
and run it's methods.
*/

public class TestPerson {
	public static void main(String[] args) {

	//Create additional Name objects with different parameters
	Person person1 = new Person("Henry", "Devlin");
	Person person2 = new Person("Jose", "Coolio");
	Person person3 = new Person("Mary", "Wisp");
	Student student1 = new Student("John", "Smith", 3.76);
    Employee employee1 = new Employee("George", "Brown", 40000);              
     
	//Display names using toString method
	person1.display();
	person2.display();
	person3.display();
	student1.display();
	employee1.display();	
	}
}
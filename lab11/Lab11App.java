package lab10;

import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;

public class Lab11App {

	public static void main(String[] args) throws Exception
	{

		// instantiating a course object
		Course cObject = new Course();

		// instantiating a scanner object
		Scanner fileScan = new Scanner(new File("courseData.txt"));
		int numItems;
		String id, last, first;
		double[] grades = new double[4];
		Student blahblah = new Student();

		numItems = fileScan.nextInt();
		for (int i=0; i<numItems; i++)
		{
			id = fileScan.next();
			last = fileScan.next();
			first = fileScan.next();

			for (int j=0; j<grades.length; j++)
			{
				grades[j] = fileScan.nextDouble();
			}

			// creating a new student object
			blahblah = new Student(id, first, last, grades);

			// inserting a student object into the Course
			cObject.insertStudent(blahblah);
		}

		// calling the close method
		fileScan.close();

		// displaying the students
		JOptionPane.showMessageDialog(null, cObject.toString(), "The Course",
				JOptionPane.INFORMATION_MESSAGE);
		
		// creating students to test the findStudent object
		Student student1 = new Student("123-45-6789", "Uriah", "Pissalidis", grades);
		Student student2 = new Student("765-43-2100", "Uriah", "Pissalidis", grades);
		Student student3 = new Student("999-99-9999", "Uriah", "Pissalidis", grades);
		Student student4 = new Student("666-66-6666", "Uriah", "Pissalidis", grades);
		
		
		// testing the findStudent method
		System.out.println("Position of the students with id " + "'123-45-6789' " + "in the array: " + cObject.findStudent(student1));
		System.out.println("Position of the students with id " + "'765-43-2100' " + "in the array: " + cObject.findStudent(student2));
		System.out.println("Position of the students with id " + "'999-99-9999' " + "in the array: " + cObject.findStudent(student3));
		System.out.println("Position of the students with id " + "'666-66-6666' " + "in the array: " + cObject.findStudent(student4));
		
		// creating more dummy students
		Student student5 = new Student("765-43-2100", "Uriah", "Pissalidis", grades);
		Student student6 = new Student("999-99-9999", "Uriah", "Pissalidis", grades);
		Student student7 = new Student("123-45-6789", "Uriah", "Pissalidis", grades);
		Student student8 = new Student("666-66-6666", "Uriah", "Pissalidis", grades);
		
		// testing the deleteStudent method
		System.out.println("\n" + "The number of students in the course is " + cObject.getNumStudents());
		cObject.deleteStudent(student5);
		System.out.println("The number of students in the course is " + cObject.getNumStudents());
		cObject.deleteStudent(student6); 
		System.out.println("The number of students in the course is " + cObject.getNumStudents());
		cObject.deleteStudent(student7);
		System.out.println("The number of students in the course is " + cObject.getNumStudents());
		cObject.deleteStudent(student8);
		System.out.println("The number of students in the course is " + cObject.getNumStudents());
		
		// display the students after using the deleteStudent method
		JOptionPane.showMessageDialog(null, cObject.toString(), "The Course",
				JOptionPane.INFORMATION_MESSAGE);
		
		
		
	}

	
	

}

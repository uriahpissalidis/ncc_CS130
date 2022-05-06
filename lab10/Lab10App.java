package lab10;

import javax.swing.JOptionPane;

/**
 * <p>Title: The Student Class</p>
 *
 * <p>Description: This class models a student object with an id, 
 * first name, last name, and exams.  In addition to setting and 
 * retrieving these values, it can calculate the average.</p>
 *
 * @authors Uriah Pissalidis and Chris Saitta
 */

public class Lab10App {

	public static void main(String[] args)
	{

		// creating a Course object
		Course cObject = new Course();

		// testing the getNumStudents
		System.out.println("Testing getNumStudents: " + cObject.getNumStudents());

		// instance variables
		double[] grades = {78.0, 93.5, 91.0, 88.5};

		// instantiating a student object with the parameterized constructor
		Student student1 = new Student("1234", "Uriah", "Pissalidis", grades);

		// calling the insert student method
		cObject.insertStudent(student1);

		// instantiating a second student object with the parameterized constructor
		double[] grades2 = {82.0, 67.5, 90.0, 85.00};
		Student student2 = new Student("2345", "Chris", "Saitta", grades2);

		// calling the insert student method to place student2 in the class
		cObject.insertStudent(student2);

		// calling the accessor method getNumStudents
		System.out.println("Testing getNumStudents: " + cObject.getNumStudents());

		// the cOjbect now outputs the student info because the toString
		// converts an object in memory into outputtable information
		System.out.println("\n" + "Printing the student's information: " + "\n" + cObject);

		// calling the calcExamAverage method
		System.out.println("Calling the calcExamAverage: " + cObject.calcExamAverage(1) + "\n");

		// adding a third student to the course
		double[] grades3 = new double[4];
		for (int i=0; i<grades3.length; i++)
		{

			grades3[i] = Double.parseDouble(JOptionPane.showInputDialog("Please enter a grade"));

			while(grades3[i] < 1 || grades3[i] > 100)
				grades3[i] = Double.parseDouble(JOptionPane.showInputDialog("Please enter a grade between 1-100"));

		}
		Student student3 = new Student("2345", "Super", "Duder", grades3);
		System.out.println("Student 3: " + "\n" + student3);
		cObject.insertStudent(student3);

		// calling the calcExamAverage method with the number 1
		System.out.println("Calling the calcExamAverage: " + cObject.calcExamAverage(1));
		
		// testing the findLowestExam method with the number 2
		System.out.println("\n" + "The index of the student with lowest grade is: " + cObject.findLowestExam(4));



	}

}

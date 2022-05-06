package lab8;

public class Student {

	// instance variables
	private int id;
	private String first, last;
	private double[] grades = new double[4];


	/** 
	 * default constructor
	 * the id, first and last names are initialized to "none"
	 * the array is created with 4 elements - each element is
	 * initialized to 0
	 */
	public Student()
	{
		this.id = 0;
		this.first = "none";
		this.last = "none";
		for (int i=0; i>grades.length; i++)
		{
			grades[i] = 0;
		}
	}


	/** 
	 * parameterized constructor
	 * stores the parameters into the appropriate instance variables
	 * @param sId the value to be stored in the instance variable id
	 * @param sFirstName the value to be stored in the instance variable first name
	 * @param sLastName the value to be stored in the instance variable last name
	 * @param sExams the value to be stored in the instance variable exams
	 */

	public Student(int id, String first, String last, double[] exams)
	{
		this.id = id;
		this.first = first;
		this.last = last;
		this.grades = exams;
	}


	/**
	 * mutator method for id
	 * stores the parameter into the instance variable
	 * @param sId the value to be stored in the instance variable id
	 */
	public void setStudentId(int num)
	{
		this.id = num;
	}


	/**
	 * mutator method for exams
	 * stores the parameter into the instance variable
	 * @param sExams the address of the array whose values will be copied into the instance variable exams
	 */

	public void setStudentExams(double[] exams2)
	{
		this.grades = exams2;
	}


	/**
	 * accessor method for id
	 * @return a reference to the instance variable id
	 */

	public int getStudentId()
	{
		return this.id;
	}


	/**
	 * accessor method for exams
	 * @return a reference to the instance variable exams
	 */

	public double[] getStudentExams()
	{ 
		return grades;
	}


	/**
	 * findLowestExam method
	 * find the lowest exam score in the array and returns its location 
	 * in the array
	 * @return the position of the lowest exam grade in the array
	 */

	public int findLowestExam()
	{
		double low = grades[0];
		int lowest = 0;
		for (int i=0; i<grades.length; i++)
		{
			if (grades[i] < lowest)
				low = grades[i];
				lowest = i;
		}
		return lowest;
	}


	/**
	 * calcExamAverage method
	 * calculates the average of the exams in one of two ways 
	 * if the parameter is true, the lowest exam score is dropped in 
	 * calculating the average
	 * if the parameter is false, no exams are dropped in the calculating
	 * the average
	 * @param drop a boolean variable to specify whether or not to drop the lowest score
	 * @return the average of the exams
	 */


	/**
	 * toString method
	 * @return a reference to a String containing the id, first and last names
	 * and the exam grades
	 */
	public String toString()
	{	
		String str = ("Id: " + this.id + "\n" + "Name: " + this.last + ", " + this.first + "\n" + "Grades: " + this.grades[0] + " " + this.grades[1] + " " + this.grades[2] + " " + this.grades[3]);
		return str;
	}
}

package lab10;

/**
 * <p>Title: The Course Class</p>
 * 
 * <p>Description: This class models a Course and is capable of storing references 
 * to Student objects. Students can be inserted in the course and the number of students
 * in the course can be determined. The average for a given exam can be calculated, the 
 * position of the Student with the lowest score for a given exam can be determined and 
 * the students at a given position can be returned.</p>
 *
 * @authors Uriah Pissalidis and Chris Saitta
 *
 */
public class Course 
{
	//instance variables
	private Student[] students;
	private int numStudents;


	/**
	 * Default constructor --
	 * Creates storage for at most 30 students and sets the number of
	 * students in the course to 0.
	 */

	public Course()
	{
		this.students = new Student[30];
		numStudents = 0;
	}



	/**
	 * getNumStudents --
	 * Returns the number of students currently in the course.
	 * @return numStudents
	 */

	public int getNumStudents()
	{
		return numStudents;
	}


	/**
	 * insertStudent --
	 * Adds a student to the course if there's room.  If the course is full, 
	 * it doesn't do anything.
	 * @param a reference to the student to be added 
	 */

	public void insertStudent(Student newStudent)
	{

		if(numStudents < students.length)
		{
			students[numStudents] = newStudent;
			numStudents++;
		}

	}


	/**
	 * calcExamAverage --
	 * Calculates the average for a particular exam.
	 * @param the exam number to calculate the average for
	 * @return the average for the specified exam
	 */

	public double calcExamAverage(int numExams)
	{
		double sum = 0;
		double average;
		if(numExams<=4 && numExams>=1)
		{
			for (int i=0; i<numStudents; i++)
			{
				sum += students[i].getExams()[numExams-1];
			}

			average = sum / numStudents;
			return average;
		}
		else 
			return -1;
	}


	/**
	 * findLowestExam --
	 * Determines the index of the student with the lowest score for a 
	 * particular exam. 
	 * 
	 * @param an integer representing the exam number to find the lowest 
	 * exam score for 
	 * @return the index of the student with the lowest exam score for the 
	 * specified exam
	 */

	public double findLowestExam(int lowExam)
	{

		double low = 100;
		int index = 0;
		if(lowExam<=4 && lowExam>=1)
		{
			for (int i = 0; i<numStudents; i++)
			{
				if(students[i].getExams()[lowExam -1] < low)
				{
					low = students[i].getExams()[lowExam - 1];
					index = i;
				}
			}
		}
		else
			index = -1;
		return index;

	}


	/**
	 * toString method -- 
	 * Returns a String representing the state of the Course.
	 * @return a reference to a string containing all the students in
	 * the course
	 */

	public String toString()
	{
		String str = new String();
		for (int i=0; i<numStudents; i++)
			str = str + this.students[i].toString() + "\n";
		return str;

	}

	
	/** findStudent method--
	 * the findStudent method compares two student objects to see if they are equal
	 * @param a student object called smiley
	 * @return the method returns the student position in the array if found else it will return negative one
	 */
	public int findStudent(Student smiley)
	{
		int studentPosition = -1;
		for (int i=0; i<numStudents; i++)
		{
			if (students[i].compareTo(smiley)==0)
			{
				return  i;
			}
		}
		return studentPosition;
	}
	
	
	/** deleteStudent method--
	 * method finds a student and deletes the student object from the array
	 * and moves all other positions to the right, there is also a check to
	 * insure that the array doesn't go out of bounds
	 * @param a student object called xDV
	 * @return false if the student object isn't found and true when the student object and deleted
	 */
	public boolean deleteStudent(Student xDV)
	{
		int pos = this.findStudent(xDV);
		if(pos == -1)
		{
			return false;
		}
		else
		{
			for (int i=pos; i<numStudents-1; i++)
			{
				students[i] = students[i+1];
			}
			students[numStudents-1] = null;
			numStudents--;
		}
		return true;

	}

}

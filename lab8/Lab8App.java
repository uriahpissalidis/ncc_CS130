package lab8;

public class Lab8App {

	public static void main(String[] args)
	{
		Student nnn = new Student();
		nnn.setStudentId(02562562);
		double[] superGrades = {98.2, 64.8, 88.8, 45.9};
		nnn.setStudentExams(superGrades);
		
		System.out.println(nnn.toString());
		System.out.println(nnn.findLowestExam());
	}
}
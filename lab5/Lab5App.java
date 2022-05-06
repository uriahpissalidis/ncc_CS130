package lab5;

public class Lab5App {

	public static void main(String[] args)
	{
		Dice theDice = new Dice();
		
		String str = theDice.toString();
		System.out.println("After Instantiation: " + str + "\n");
		
		
		int valOfDieOne = theDice.getDieOne();
		System.out.println("Value of dieOne is: " + valOfDieOne);

		int valOfDieTwo = theDice.getDieTwo();
		System.out.println("Value of dieTwo is: " + valOfDieTwo);
		
		int valOfDieThree = theDice.getDieThree();
		System.out.println("Value of dieThree is: " + valOfDieThree + "\n");
		
		

		theDice.roll();
		
		System.out.println("After rolling the dice: " + theDice.toString() + "\n");
		
		int total = theDice.calcTotalRoll();
		System.out.println("The roll total is: " + total + "\n");
		
		int highestValue = theDice.findHighestDie();
		System.out.println("The highest value of the three die is: " + highestValue + "\n");
		
		theDice.rollOneDie(1);
		System.out.println("Rolling die one only: " + theDice.toString());
		
		theDice.rollOneDie(2);
		System.out.println("Rolling die two only: " + theDice.toString());
		
		theDice.rollOneDie(3);
		System.out.println("Rolling die three only: " + theDice.toString());
		
		
	}
}

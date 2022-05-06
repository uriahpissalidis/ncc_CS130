package lab5;

public class Dice {

	// instance variables
	private int dieOne;
	private int dieTwo;
	private int dieThree;

	/**
	 * <p>Method Name: Dice()</p>
	 * 
	 * <p>Method Description: Declares values for the variables of dice</p>
	 * 
	 */
	
	public Dice()
	{
		this.dieOne = 0;
		this.dieTwo = 0;
		this.dieThree = 0;
	}
	
	/**
	 * <p>Method Name: toString</p>
	 * 
	 * 
	 * <p>Method Description: Shows the state of the three instance variables</p>
	 * 
	 * <p>Parameters: none
	 * 
	 * <p>@return: str
	 * 
	 */
	
	public String toString()
	{
		
		String str = new String(dieOne + " " + dieTwo + " " + dieThree);
		
		return str;
		
	}
	
	/**
	 * <p>Method Name: getDieOne()</p>
	 * 
	 * <p>Method Description: Shows the state of the variable dieOne</p>
	 * 
	 * <p>Parameters: None
	 * 
	 * <p>@return: dieOne
	 * 
	 */	
	
	public int getDieOne()
	{
		return dieOne;
	}
	
	
	/**
	 * <p>Method Name: getDieTwo()</p>
	 * 
	 * <p>Method Description: Shows the state of the variable dieTwo</p>
	 * 
	 * <p>Parameters: None
	 * 
	 * <p>@return: dieTwo
	 * 
	 */	
	
	public int getDieTwo()
	{
		return dieTwo;
	}
	
	
	/**
	 * <p>Method Name: getDieThree()</p>
	 * 
	 * <p>Method Description: Shows the state of the variable dieThree</p>
	 * 
	 * <p>Parameters: None</p>
	 * 
	 * <p>@return: dieOne</p>
	 * 
	 */	
	
	public int getDieThree()
	{
		return dieThree;
	}

	/**
	 * <p>Method Name: roll()</p>
	 * 
	 * <p>Method Description: Generates values between 1 and 6. Assigns the values to the dice</p>
	 * 
	 */	
	
	public void roll()
	{
		dieOne = (int)(Math.random()*6+1);
		dieTwo = (int)(Math.random()*6+1);
		dieThree = (int)(Math.random()*6+1);
	}
	
	
	/**
	 * <p> Method Name: calcTotalRoll method </p>
	 * 
	 * <p> Method Description: Method will calculate the total of the three die</p>
	 * @return the sum of the dice
	 */
	
	public int calcTotalRoll()
	{
		int total = (dieOne + dieTwo + dieThree);
		return total;

	}
	
	/**
	 * <p>Method Name: findHighestDie method</p>
	 * 
	 * <p>Method Description: Method will determine which of the three die have the
	 * highest die </p>
	 */

	public int findHighestDie()
	{
		int highestValue;

		if(dieOne > dieTwo && dieOne > dieThree)
		{
			highestValue = dieOne;
		}
			else if(dieTwo > dieOne && dieTwo > dieThree)
			{
				highestValue = dieTwo;
			}
				else
				{
					highestValue = dieThree;
				}
					return highestValue;
	}
	
	/**
	 * <p>Method Name: rollOneDie method</p>
	 * 
	 * <p>Method Description: Method will roll one die </p>
	 */
	
	public void rollOneDie(int num)
	{
			
		if(num == 1)
		{
			dieOne = (int)(Math.random()*6+1);
		}
		else if(num == 2)
		{
			dieTwo = (int)(Math.random()*6+1);
		}	
		else if(num == 3)
		{					
			dieThree = (int)(Math.random()*6+1);
		}
			
	}
	
}

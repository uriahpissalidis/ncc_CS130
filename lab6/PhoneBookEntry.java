package lab6;

public class PhoneBookEntry {

	//declaring instance variables
	String firstName;
	String lastName;
	String phoneNumber;
	String birthDate;
	char relationship;
	
	//default constructor
	public PhoneBookEntry() 
	{
		this.firstName = new String("None");
		this.lastName = new String("None");
		this.phoneNumber = new String("516-555-5555");
		this.birthDate = new String("01-01-0011");
		this.relationship = 'X';
		
	}
	
	//toString method
	public String toString()
	{
		{
			String str = new String();
			if(relationship == 'F')
			{
				str = "Friend";
			}
			else if (relationship == 'M')
			{
				str = "Family Member";
			}
			else if (relationship == 'B')
			{	
				str = "Business Associate";
			}
			else
			{
				str = "Not specified";
		
			}
			return lastName + ", " + firstName + "\n" + str + "\n" + phoneNumber + "\n" + birthDate;
		}
		
	}
	
	
	
}

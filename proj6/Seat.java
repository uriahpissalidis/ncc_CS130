package proj6;

public class Seat {

	// instance variables
	private int seat;
	private String type;
	private String status;

	// parameterized constructor
	public Seat(int seat, String type)
	{
		this.seat = seat;
		this.type = type;
		status = "Empty";
	}

	// writing the getSeatNumber method
	public int getSeatNumber()
	{
		return this.seat;
	}

	// writing the getSeatType method
	public String getSeatType()
	{
		if(type == "First Class")
		{
			return type = "First Class";
		}
		else
		{
			return type = "Coach";
		}
	}

	// writing the seatEmpty method
	public boolean seatEmpty()
	{
		if(status == "Empty")
		{
			return true;
		}
		else
		{
			status = "Occupied";
			return false;
		}

	}

	// writing the reserveSeat method
	public String reserveSeat()
	{
		return status = "Occupied";
	}

	// writing the cancellation method
	public String cancellation()
	{
		return status = "Empty";
	}

	// writing the toString method
	public String toString()
	{
		String str;
		str = "The seat number: " + (seat) + "\nThe type of seat: " + type
				+ "\nThe seat is: " + status + "\n";
		return str;
	}





}




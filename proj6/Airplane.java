package proj6;

/**
 * <p>Title: The Airplane class</p>
 *
 * <p>Description: Default constructor creates a airplane object, assign assigns a seat as occupied based upon what
 * class the user would like their seat to be. Cancel sets a seat to empty based upon the seat number, toString displays
 * the status of the plane and its seats.
 *
 * @author 
 */

public class Airplane {

	// instance variables
	private Seat[] plane;
	private int firstReserved, coachReserved;

	public Airplane(){
		firstReserved = 0;
		coachReserved = 0;
		plane = new Seat[10];
		for (int i=0;i<10;i++){
			if (i<4)
				plane[i] = new Seat(i+1, "first");
			else
				plane[i] = new Seat(i+1, "coach");
		}
	}

	/**
	 * reserve method --
	 * reserves the user to a seat depending on whether they want coach or first class
	 * @param int, num representing which class the user would like, 0 for first class, 1 for coach.
	 * @return returns the seat number that was reserved
	 */
	public int reserve(int num)
	{
		if ((num == 0)&&(firstReserved<4))
		{
			for(int i=0;i<4;i++)
			{
				if (plane[i].seatEmpty()==true)
				{
					plane[i].reserveSeat();
					firstReserved++;
					return plane[i].getSeatNumber();
				}
			}
		}
		else if ((num==1)&&(coachReserved<6))
		{
			for(int i=4;i<10;i++)
			{
				if (plane[i].seatEmpty()==true)
				{
					plane[i].reserveSeat();
					coachReserved++;
					return plane[i].getSeatNumber();
				}
			}
		}
		return 0;

	}

	/**
	 * cancel method --
	 * Cancels a seat by setting its status to empty and decriments the number of seats reserved within each class.
	 * @param int, num the seatNumber being removed.
	 * @return returns true if cancellation was successful, false if it was not.
	 */
	public boolean cancel(int num)
	{
		if ((num > 0 && num < 11)&&(plane[num-1].seatEmpty()==false))
		{
			if (num >4)
			{
				plane[num-1].cancellation();
				coachReserved--;
			}
			else
			{
				plane[num-1].cancellation();
				firstReserved--;
			}                      
			return true;
		}
		else
			return false;
	}

	/**
	 * toString method --
	 * creates and returns a reference to a String which displays the status of each seat on the airplane.
	 * @return a reference to a String containing the state of the Seat array.
	 */
	public String toString()
	{
		String tmp = new String();
		for(int i=0; i<10; i++)
		{
			tmp = tmp+ plane[i].toString()+ "\n";
		}
		return tmp;
	}
}


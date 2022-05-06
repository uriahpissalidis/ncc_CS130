package proj6;

import javax.swing.JOptionPane;

public class Project6 {
	public static void main(String[] args)
	{

		/**
		// creating a seat object called zeDoctor
		Seat zeDoctor = new Seat(3, "First Class");

		// testing the getSeatNumber method
		System.out.println(zeDoctor.getSeatNumber());

		// testing the getSeatType method
		System.out.println(zeDoctor.getSeatType());

		// testing the seatEmpty method
		System.out.println(zeDoctor.seatEmpty());

		// testing the reserveSeat method
		System.out.println(zeDoctor.reserveSeat());

		// testing the cancellation method
		System.out.println(zeDoctor.cancellation());

		// testing the toString method
		System.out.println(zeDoctor.toString());
		 */

		/**
		Airplane plane = new Airplane();
		plane.reserve(0); 
		plane.reserve(0); 
		plane.reserve(1); 
		plane.cancel(1);
		System.out.println(plane.toString());
		 */


		Airplane plane = new Airplane();
		int choice;
		int firstClass;
		int coach;

		do
		{

			String[] choices = {"Reserve a seat", "Cancel a Seat", "Seating Chart", 
			"Cancel"};

			choice = JOptionPane.showOptionDialog(
					null,
					"Enter your choice...", //text displayed in the window
					"Main Menu", //text displayed in the window's title bar
					JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,
					choices, //text to be displayed in each button
					choices[0]); //default button

			if (choice == 0)
			{ 
				String[] firstCoach = { "First Class", "Coach" };
				int choice2 = JOptionPane.showOptionDialog(
						null, 
						"Which seat would you like to book?", //text displayed in the window
						"Which seat would you like to book?", //text displayed in the window's title bar
						JOptionPane.DEFAULT_OPTION,
						JOptionPane.QUESTION_MESSAGE,
						null,
						firstCoach,
						firstCoach[0]);

				if (choice2 == 0)
				{
					firstClass = plane.reserve(0);
					if(firstClass != 0)
					{
						JOptionPane.showMessageDialog(
								null, 
								"You got a seat in first class" + "\n" + "Seat Number: " + firstClass,
								"First class ticket confirmed",
								JOptionPane.INFORMATION_MESSAGE);
					}

					else
					{
						JOptionPane.showMessageDialog(
								null, 
								"No more first class seats available",
								"First class ticket confirmed",
								JOptionPane.INFORMATION_MESSAGE);
					}


				}

				if (choice2 == 1)
				{
					coach = plane.reserve(1);
					if(coach != 0)
					{
						JOptionPane.showMessageDialog(
								null, 
								"You got a seat in coach" + "\n" + "Seat Number: " + coach,
								"First class ticket confirmed",
								JOptionPane.INFORMATION_MESSAGE);
					}

					else
					{
						JOptionPane.showMessageDialog(
								null, 
								"No more coach seats available",
								"First class ticket confirmed",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}


			// cancellation choice
			if (choice == 1)
			{
				int cancelSeat = 0;

				while (cancelSeat<1 || cancelSeat>10)
				{
					cancelSeat = Integer.parseInt(JOptionPane.showInputDialog("Which seat would you like to cancel?"));
					if (cancelSeat<1 || cancelSeat>10)
						JOptionPane.showMessageDialog(null, "You have chosen a nonexistent seat");
				}

				if(plane.cancel(cancelSeat))
				{
					JOptionPane.showMessageDialog(null, "The reservation for seat: " + cancelSeat + " has been cancelled");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "The reservation for seat " + cancelSeat + " is already empty");
				}
			}

			// seating chart
			if (choice == 2)
			{
				JOptionPane.showMessageDialog(null, plane.toString());
			}





		}
		while(choice != 3);
	}
}

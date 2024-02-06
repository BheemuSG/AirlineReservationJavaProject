package Pages;

import java.util.Scanner;

import Master.*;

public class DataProcess extends SeatSelection implements LogIn, Booking
{
	Scanner reader=new Scanner(System.in);

	private String userName, passwd, from, to, date, bookingINFO;

	@Override
	public void LogIn_Cred() 
	{
		Scanner reader=new Scanner(System.in);

		System.out.println("===== Welcome To Shivanandi Online Airline Ticket Booking ===== ");
		System.out.println("Enter Login user Name: ");
		userName=reader.nextLine();
		System.out.println("Enter Login Password: ");
		passwd=reader.nextLine();
		

	}
	public void userVerification()
	{
		if (userName.equals("Bheema") && passwd.equals("@123"))
			Book_Ticket();
		else if (userName.equals("Renuka") && passwd.equals("#123"))
			Book_Ticket();
		else if (userName.equals("Siddu") && passwd.equals("$123"))
			Book_Ticket();
		else
			System.out.println("!!!You are not registered, please register with Shivanandi Online Airline Ticket Booking!!!");
	}

	@Override
	public void Book_Ticket()
	{
		System.out.println("Enter an origin: ");
		from=reader.nextLine();
		System.out.println("Enter a destination: ");
		to=reader.nextLine();
		System.out.println("Enter your departure date (MM/DD/YYYY): ");
		date=reader.nextLine();
		Reserve_Ticket();
	}

	@Override
	public void Reserve_Ticket()
	{
		final String t1="05:05", t2="07:35", t3="16:00",
			   t4="04:30", t5="07:00", t6="16:40", 
			   t7="02:50", t8="05:30", t9="12:30";
		
		bookingINFO=AirBusDetails(from, to);
		int seat=selectSeat();
		
		switch (bookingINFO)
		{
		case t1:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t2:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t3:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t4:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t5:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t6:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t7:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t8:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. "
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. "
							+ "Wishing you happy journey");
			break;
		case t9:
			System.out.println("Dear " +userName+ ", Thank you for booking with Gowda Airline Booking. \n"
					+ "We are pleased to inform the booking " +from+ " to " +to+ " on "+date+" confirmed. \n"
							+ "Seat number is "+seat+" Wishing you happy journey");
			break;
		default:
			System.out.println(bookingINFO);
		}
	}

	@Override
	public void Forgot_Login() 
	{
		// TODO Auto-generated method stub
	}
}

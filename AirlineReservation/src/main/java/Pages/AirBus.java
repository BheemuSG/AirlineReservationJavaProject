package Pages;

import java.util.Scanner;

public class AirBus 
{
	String AirBusDetails(String from, String to)
	{
		Scanner reader=new Scanner(System.in);
		String message;

		if(from.equals("Bengalore") && to.equals("Chennai"))
		{
			System.out.println("********AirBus Details********");
			System.out.println("From\t\tTo\t\tDeparture\tArrival ");
			System.out.println("Bengalore\tChennai\t\t05:05\t\t06:00");
			System.out.println("Bengalore\tChennai\t\t07:35\t\t08:35");
			System.out.println("Bengalore\tChennai\t\t16:00\t\t17:10");

			String t1="05:05", t2="07:35", t3="16:00";

			System.out.println("Select the departure timing of your Flight ");
			String departureTime=reader.nextLine();

			if(departureTime.equals(t1))
			{
				message=departureTime;
			}
			
			else if(departureTime.equals(t2))
			{
				message=departureTime;
			}
			else if(departureTime.equals(t3))
			{
				message=departureTime;
			}
			else 
			{
				message=("Service is not available for selected timing.");			
			}
		}

		else if(from.equals("Bengalore") && to.equals("Delhi"))
		{
			System.out.println("********AirBus Details********");
			System.out.println("From\t\tTo\t\tDeparture\tArrival ");
			System.out.println("Bengalore\tDelhi\t\t04:30\t\t07:10");
			System.out.println("Bengalore\tDelhi\t\t07:00\t\t09:50");
			System.out.println("Bengalore\tDelhi\t\t16:40\t\t19:30");

			String t1="04:30", t2="07:00", t3="16:40";

			System.out.println("Select the departure timing of your Flight ");
			String departureTime=reader.nextLine();

			if(departureTime.equals(t1))
			{
				message=departureTime;				
			}
			else if(departureTime.equals(t2))
			{
				message=departureTime;			
			}
			else if(departureTime.equals(t3))
			{
				message=departureTime;			
			}
			else 
			{
				message=("Service is not available for selected timing.");				
			}
		}

		else if(from.equals("Bengalore") && to.equals("Mumbai"))
		{
			System.out.println("********AirBus Details********");
			System.out.println("From\t\tTo\t\tDeparture\tArrival ");
			System.out.println("Bengalore\tMumbai\t\t02:50\t\t04:45");
			System.out.println("Bengalore\tMumbai\t\t05:30\t\t07:10");
			System.out.println("Bengalore\tMumbai\t\t12:30\t\t14:35");

			String t1="02:50", t2="05:30", t3="12:30";

			System.out.println("Select the departure timing of your Flight ");
			String departureTime=reader.nextLine();

			if(departureTime.equals(t1))
			{
				message=departureTime;						
			}
			else if(departureTime.equals(t2))
			{
				message=departureTime;					
			}
			else if(departureTime.equals(t3))
			{
				message=departureTime;					
			}
			else 
			{
				message=("Service is not available for selected timing.");				
			}
		}
		else
		{
			message=("Service not available between " + from + " to "+ to);
		}
		reader.close();
		return message;
	}

}



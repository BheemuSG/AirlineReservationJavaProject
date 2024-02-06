package AirlineReservation;

import Pages.DataProcess;

public class AirlineReservation extends DataProcess
{

	public static void main(String[] args) 
	{
		AirlineReservation AR=new AirlineReservation();

		AR.LogIn_Cred();
		AR.userVerification();
	}

}

package Pages;

import java.util.Random;

public class SeatSelection extends AirBus
{
	public int selectSeat() 
    {
    	Random rand = new Random();
    	   
        // Generate random integers in range 0 to 99
        int seatNumber = rand.nextInt(100);
        return seatNumber;
    }
}

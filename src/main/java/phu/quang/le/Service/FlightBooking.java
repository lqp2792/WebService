package phu.quang.le.Service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import phu.quang.le.DataBinding.Flight;

@WebService
public interface FlightBooking {
	@WebMethod	
	public String authUser (String username, String password);
	
	@WebMethod
	public ArrayList<Flight> checkItinerary (String depCity, String desCity, String token);

	@WebMethod
	public String checkAvailable (Flight[] itinerary, String date, String token);

	@WebMethod
	public String bookTicket (Flight[] itinerary, String date, String creditCard,
			String token);
}

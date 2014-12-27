package phu.quang.le.ServiceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import phu.quang.le.DataBinding.Flight;
import phu.quang.le.Service.FlightBooking;
import phu.quang.le.Util.CityAvailable;
import phu.quang.le.Util.DBUtility;
import phu.quang.le.Util.FlightBookingUtil;
import phu.quang.le.Util.RandomString;

public class FlightBookingImpl implements FlightBooking {
	private PreparedStatement pst = null;
	private ResultSet rs = null;
	private String sql = null;

	@Override
	public String authUser (String username, String password) {
		if (username == null || password == null) {
			return null;
		}
		Connection conn = DBUtility.getConnection ();
		sql = "Select * from user where username = ? and password = ?";
		try {
			pst = conn.prepareStatement (sql);
			pst.setString (1, username);
			pst.setString (2, password);
			rs = pst.executeQuery ();
			if (rs != null) {
				return RandomString.getString ();
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.err.println (e);
		}
		return null;
	}

	@Override
	public ArrayList<Flight> checkItinerary (String depCity, String desCity,
			String token) {
		ArrayList<Flight> flights = new ArrayList<> ();
		if (token == null) {
			return null;
		} else if (depCity == null || desCity == null) {
			return null;
		} else if (!CityAvailable.isCityNameValid (depCity)
				|| !CityAvailable.isCityNameValid (desCity)) {
			return null;
		}
		Flight f = new Flight ();
		f.setDepartureCity (depCity);
		f.setDestinationCity (desCity);
		flights.add (f);
		f = new Flight ();
		f.setDepartureCity (desCity);
		f.setDestinationCity (depCity);
		flights.add (f);
		return flights;
	}

	@Override
	public String checkAvailable (Flight[] itinerary, String date, String token) {
		if (!FlightBookingUtil.isTokenValid (token)) {
			return null;
		}
		return "1.000.000";
	}

	@Override
	public String bookTicket (Flight[] itinerary, String date, String creditCard,
			String token) {
		if (!FlightBookingUtil.isTokenValid (token)) {
			return null;
		}
		return "568432";
	}

	public static void main (String[] args) {
		FlightBookingImpl f = new FlightBookingImpl ();
		System.out.println (f.authUser ("phu", "848353"));
		ArrayList<Flight> flights = f.checkItinerary ("Ha Noi", "Hai Phong",
				f.authUser ("phu", "848353"));
		for (int i = 0 ; i < flights.size () ; i++) {
			System.out.println (flights.get (i).toString ());
		}
	}
}

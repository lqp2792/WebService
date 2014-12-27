package phu.quang.le.Service;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebMethod;
import javax.jws.WebService;

import phu.quang.le.DataBinding.Hotel;

@WebService
public interface HotelBooking {
	@WebMethod
	public ArrayList<Hotel> hotelSearch (Date checkIn, Date checkOut,
			int nightCount, String city);

	public String HotelInfo (int hotelId);
}

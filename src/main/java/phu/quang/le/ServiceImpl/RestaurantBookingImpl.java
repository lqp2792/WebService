package phu.quang.le.ServiceImpl;

import java.util.ArrayList;

import phu.quang.le.DataBinding.BookRecipe;
import phu.quang.le.DataBinding.Restaurant;
import phu.quang.le.HashDB.HashDB;
import phu.quang.le.Service.RestaurantBooking;

public class RestaurantBookingImpl implements RestaurantBooking {
	@Override
	public ArrayList<String> getRestaurentList () {
		return HashDB.restaurentNameList ();
	}

	@Override
	public Restaurant getRestaurentInfo (String restaurentName) {
		return HashDB.getRestaurent (restaurentName);
	}

	@Override
	public ArrayList<String> tableSearch (Restaurant restaurent, int customerNumber,
			String date, String time) {
		ArrayList<String> timeList = new ArrayList<String> ();
		if (restaurent.getDate ().equals (date)) {
			if (restaurent.getCustomerAmount ()
					- restaurent.getCurrentCustomerAmount () > customerNumber) {
				if (restaurent.getTableList ().get (time) == 0) {
					timeList.add (time);
					restaurent.setCurrentCustomerAmount (restaurent
							.getCurrentCustomerAmount () + customerNumber);
				}
			}
		}
		return timeList;
	}

	@Override
	public BookRecipe customerConfirm (String name, String phoneNumber,
			String idNumber, String email, String restaurentName, String location,
			int customerNumber, String otherDemand) {
		BookRecipe restaurentBook = new BookRecipe ();
		restaurentBook.printRestaurentBookRecipe (name, phoneNumber, idNumber,
				email, restaurentName, location, customerNumber, otherDemand);
		return restaurentBook;
	}
}

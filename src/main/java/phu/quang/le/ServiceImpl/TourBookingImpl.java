package phu.quang.le.ServiceImpl;

import java.util.ArrayList;

import phu.quang.le.DataBinding.BookRecipe;
import phu.quang.le.DataBinding.Tour;
import phu.quang.le.HashDB.HashDB;
import phu.quang.le.Service.TourBooking;

public class TourBookingImpl implements TourBooking {

	@Override
	public ArrayList<String> getTourList() {
		return HashDB.tourNameList();
	}

	@Override
	public Tour getTourInfo(String tourName) {
		return HashDB.getTour(tourName);
	}

	@Override
	public BookRecipe customerConfirm(String name, String phoneNumber,
			String idNumber, String email, String tourName,
			String customerNumber, String gatherLocation, String startTime,
			String endTime, int price) {
		
		BookRecipe tourRecipe = new BookRecipe();
		tourRecipe.printTourBookRecipe(name, phoneNumber, idNumber, email, tourName, customerNumber, gatherLocation, startTime, endTime, price);
		return tourRecipe;
	}
	
}

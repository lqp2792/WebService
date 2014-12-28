package phu.quang.le.Service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import phu.quang.le.DataBinding.BookRecipe;
import phu.quang.le.DataBinding.Tour;

@WebService
public interface TourBooking {
	@WebMethod
	public ArrayList<String> getTourList ();

	@WebMethod
	public Tour getTourInfo (String tourName);

	@WebMethod
	public BookRecipe customerConfirm (String name, String phoneNumber,
			String idNumber, String email, String tourName, String customerNumber,
			String gatherLocation, String startTime, String endTime, int price);
}

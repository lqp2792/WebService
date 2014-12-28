package phu.quang.le.Service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebService;

import phu.quang.le.DataBinding.BookRecipe;
import phu.quang.le.DataBinding.Restaurant;

@WebService
public interface RestaurantBooking {
	@WebMethod
	public ArrayList<String> getRestaurentList();
	
	@WebMethod
	public Restaurant getRestaurentInfo(String restaurentName);
	
	@WebMethod
	public ArrayList<String> tableSearch (Restaurant restaurent, int customerNumber, String date, String time);
	
	@WebMethod
	public BookRecipe customerConfirm (String name, String phoneNumber, String idNumber, String email, String restaurentName, 
			String location,int customerNumber, String otherDemand);
}

package phu.quang.le.HashDB;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import phu.quang.le.DataBinding.Restaurant;
import phu.quang.le.DataBinding.Tour;

public class HashDB {
	public static HashMap<String, Restaurant> restaurentList = new HashMap<String, Restaurant>();
	public static HashMap<String, Tour> tourList = new HashMap<String, Tour>();
	
	public static Restaurant getRestaurent(String restaurentName) {
		return HashDB.restaurentList.get(restaurentName);
	}
	
	public static ArrayList<String> restaurentNameList () {

		ArrayList<String> restaurentNameList = new ArrayList<String>();
		
		for(Map.Entry entry : restaurentList.entrySet()) {
			restaurentNameList.add(entry.getKey().toString());
		}
		
		return restaurentNameList;
	}
	
	public static ArrayList<String> tourNameList() {
		ArrayList<String> tourNameList = new ArrayList<String>();
		
		for(Map.Entry entry : tourList.entrySet()) {
			restaurentNameList().add(entry.getKey().toString());
		}
		return tourNameList;
	}
	
	public static Tour getTour(String tourName) {
		return HashDB.tourList.get(tourName);
	}
}

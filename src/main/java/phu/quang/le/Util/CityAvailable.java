package phu.quang.le.Util;

public class CityAvailable {
	public static String[] possibleCities = { "Ha Noi", "Ba Ria Vung Tau",
			"Binh Dinh", "Ca Mau", "Can Tho", "Dak Lak", "Da Nang", "Dien Bien",
			"Gia Lai", "Hai Phong", "Ho Chi Minh", "Khanh Hoa", "Kien Giang",
			"Nghe An", "Phu Yen", "Quang Binh", "Quang Nam", "Thanh Hoa",
			"Thua Thien Hue" };

	public static boolean isCityNameValid (String cityName) {
		for (String city : possibleCities) {
			if (city.equals (cityName)) {
				return true;
			}
		}
		return false;
	}
}

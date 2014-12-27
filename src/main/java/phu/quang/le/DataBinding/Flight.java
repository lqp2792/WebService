package phu.quang.le.DataBinding;

public class Flight {
	private String departureCity;
	private String destinationCity;
	private String departTime;
	private String arriveTime;

	public String getDepartureCity () {
		return departureCity;
	}

	public String getDestinationCity () {
		return destinationCity;
	}

	public void setDepartureCity (String departureCity) {
		this.departureCity = departureCity;
	}

	public void setDestinationCity (String destinationCity) {
		this.destinationCity = destinationCity;
	}

	public String getDepartTime () {
		return departTime;
	}

	public String getArriveTime () {
		return arriveTime;
	}

	public void setArriveTime (String arriveTime) {
		this.arriveTime = arriveTime;
	}

	public void setDepartTime (String departTime) {
		this.departTime = departTime;
	}

	@Override
	public String toString () {
		return "Departure City: " + departureCity + " Destination City: "
				+ destinationCity;
	}
}

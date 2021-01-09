package org.com.anshul.ticketingapp.pojo;

public class UserInput {

	private Station source;
	private Station destination;
	private int noOfTravellers;
	private long distance;
	private double fare;

	public long getDistance() {
		return distance;
	}

	public void setDistance(long distance) {
		this.distance = distance;
	}

	public double getFare() {
		return fare;
	}

	public void setFare(double fare) {
		this.fare = fare;
	}

	public Station getSource() {
		return source;
	}

	public void setSource(Station source) {
		this.source = source;
	}

	public Station getDestination() {
		return destination;
	}

	public void setDestination(Station destination) {
		this.destination = destination;
	}

	public int getNoOfTravellers() {
		return noOfTravellers;
	}

	public void setNoOfTravellers(int noOfTravellers) {
		this.noOfTravellers = noOfTravellers;
	}
}

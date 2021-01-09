package org.com.anshul.ticketingapp.pojo;

/** This class is used to define route information */
public class Route {

	public static String[][] routes = { { Station.PUNE.getValue(), Station.MUMBAI.getValue(), "120" },
			{ Station.PUNE.getValue(), Station.NASIK.getValue(), "200" },
			{ Station.MUMBAI.getValue(), Station.GOA.getValue(), "350" },
			{ Station.MUMBAI.getValue(), Station.NASIK.getValue(), "180" } };
}

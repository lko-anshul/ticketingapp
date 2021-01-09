package org.com.anshul.ticketingapp.service;

import org.com.anshul.ticketingapp.pojo.Route;
import org.com.anshul.ticketingapp.pojo.UserInput;

/** This class is used for calculation */
public class CalculationService {

	/** This method is used for fare calculation */
	public void calculateFare(UserInput input) throws Exception {
		double fare = 0;
		calculateDistance(input);
		long excessDist = input.getDistance() - 100;
		fare = 750 + (excessDist * 5);
		input.setFare(fare * input.getNoOfTravellers());
	}

	/** This method is used for distance calculation */
	public void calculateDistance(UserInput input) throws Exception {
		for (String[] r : Route.routes) {
			if (((r[0].equals(input.getSource().getValue())) && r[1].equals(input.getDestination().getValue()))
					|| ((r[1].equals(input.getSource().getValue()))
							&& r[0].equals(input.getDestination().getValue()))) {
				input.setDistance(Long.parseLong(r[2]));
				return;
			}
		}
		throw new Exception("This route is not supported !!!");
	}
}

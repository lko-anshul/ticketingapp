package org.com.anshul.ticketingapp.service;

import java.util.Scanner;

import org.com.anshul.ticketingapp.pojo.Station;
import org.com.anshul.ticketingapp.pojo.UserInput;

/** This class is used to take input from user and validate */
public class UserInputService {

	/** This method is used to take input from user */
	public UserInput getInitialUserInput() throws Exception {
		UserInput input = new UserInput();
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter source :");
		String source = myObj.nextLine();
		validateSourceDestination(source, input, "source");

		System.out.println("Enter destination :");
		String destination = myObj.nextLine();
		validateSourceDestination(destination, input, "destination");

		System.out.println("Enter number of travellers :");
		String noOfTravellers = myObj.nextLine();
		validateNoOfTravellers(noOfTravellers, input);
		myObj.close();
		return input;
	}

	/** This method is used to validate source and destination input */
	public void validateSourceDestination(String name, UserInput input, String type) throws Exception {
		boolean isValid = false;
		for (Station s : Station.values()) {
			if (s.getValue().equalsIgnoreCase(name)) {
				if ("source".equalsIgnoreCase(type))
					input.setSource(s);
				else
					input.setDestination(s);

				isValid = true;
			}
		}
		if (!isValid) {
			throw new Exception("Entered " + type + " does not exists !!!");
		}
	}

	/** This method is used to validate number of traveller's input */
	public void validateNoOfTravellers(String travellers, UserInput input) throws Exception {
		try {
			input.setNoOfTravellers(Integer.parseInt(travellers));
		} catch (NumberFormatException e) {
			throw new Exception("Please enter valid number of travellers !!!");
		}
		if (input.getNoOfTravellers() <= 0)
			throw new Exception("Number of travellers should be more than 0 !!!");
	}

	/** This method is used to validate route */
	public void validateValidRoute(UserInput input) throws Exception {

		if (input.getSource() == input.getDestination()) {
			throw new Exception("Source and Destination cannot be same !!!");
		}
	}
}

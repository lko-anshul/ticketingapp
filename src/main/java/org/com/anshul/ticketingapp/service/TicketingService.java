package org.com.anshul.ticketingapp.service;

import org.com.anshul.ticketingapp.pojo.UserInput;

/** This class is used for Ticket apis */
public class TicketingService {

	/** This method is used for creating ticket format */
	public StringBuilder createTicketFormat(UserInput input) {
		StringBuilder sb = new StringBuilder();
		sb.append("Taxi Ticket").append("\n");
		sb.append("-----------").append("\n");
		sb.append("Source: "+input.getSource().getValue()).append("\n");
		sb.append("Destination: "+input.getDestination().getValue()).append("\n");
		sb.append("Kms: "+input.getDistance()).append("\n");
		sb.append("No. of travellers = "+input.getNoOfTravellers()).append("\n");
		sb.append("Total = "+input.getFare()+" INR").append("\n");
		return sb;
	}
}

package org.com.anshul.ticketingapp;

import org.com.anshul.ticketingapp.pojo.UserInput;
import org.com.anshul.ticketingapp.service.CalculationService;
import org.com.anshul.ticketingapp.service.TicketingService;
import org.com.anshul.ticketingapp.service.UserInputService;

public class App {
	UserInputService uis = new UserInputService();
	CalculationService cs = new CalculationService();
	TicketingService ts = new TicketingService();

	public static void main(String[] args) {
		try {
			new App().processRequest();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void processRequest() throws Exception {
		UserInput input = uis.getInitialUserInput();
		cs.calculateFare(input);
		StringBuilder ticket = ts.createTicketFormat(input);
		System.out.println(ticket.toString());
	}
}

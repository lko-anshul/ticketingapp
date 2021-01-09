package org.com.anshul.ticketingapp.pojo;

/** ENUM for allowed stations */
public enum Station {
	PUNE("PUNE"), MUMBAI("MUMBAI"), NASIK("NASIK"), GOA("GOA");

	private String value;

	Station(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}

package com.aurionpro.Flight.model;

public class Flight {
	String airline;
	double fare;
	
	public Flight(String airline, double fare) {
		this.airline=airline;
		this.fare = fare;
	}
	
	public String getAirline() {
		return airline;
	}
	
	public double getFare() {
		return fare;
	}
	
	@Override
	public String toString() {
		return "Flight [airline=" + airline + ", fare=" + fare + "]";
	}
	
}

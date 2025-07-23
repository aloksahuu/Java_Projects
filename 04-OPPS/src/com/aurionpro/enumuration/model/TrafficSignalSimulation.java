package com.aurionpro.enumuration.model;

public class TrafficSignalSimulation {
	
	public static String getAction(TrafficSignal signal) {
        switch (signal) {
            case RED:
                return "Stop";
		case YELLOW:
                return "Get Ready";
            case GREEN:
                return "Go";
            default:
                return "Invalid Signal";
        }
    }
	
	public static void main(String[] args) {
		for(TrafficSignal sign :TrafficSignal.values()) {
			System.out.println("Signal: "+sign+" Action: "+getAction(sign));
		}
	}
	
}

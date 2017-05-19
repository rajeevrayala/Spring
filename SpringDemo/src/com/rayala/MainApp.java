package com.rayala;

public class MainApp {

	public static void main(String[] args) {
		//create Object
		Coach theCoach = new TrackCoach();
		//using object
		System.out.println(theCoach.getDailyWorkout());
	}
}

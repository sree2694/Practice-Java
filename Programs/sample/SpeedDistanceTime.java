package sample;

import java.util.Scanner;

public class SpeedDistanceTime {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Distance in meters:");
		double distance = scan.nextFloat();
		System.out.println("Hours: ");
		double hr = scan.nextFloat();
		System.out.println("Minutes: ");
		double min = scan.nextFloat();
		System.out.println("Seconds: ");
		double sec = scan.nextFloat();
		double timeseconds = 0;
		System.out.println("Speed in meters/second is " + mps(distance, hr, min, sec));
		System.out.println("Speed in km/h is " + kph(distance, hr, min, sec));
		System.out.println("Speed in miles/h is " + mph(distance, hr, min, sec));
	}

	private static double mph(double distance, double hr, double min, double sec) {
		double timeSeconds = (hr * 3600) + (min * 60) + sec;
		double kph = (distance / 1000) / (timeSeconds / 3600);
		return (kph / 1.609);
	}

	private static double kph(double distance, double hr, double min, double sec) {
		double timeSeconds = (hr * 3600) + (min * 60) + sec;
		return (distance / 1000) / (timeSeconds / 3600);
	}

	private static double mps(double distance, double hr, double min, double sec) {

		double timeSeconds = (hr * 3600) + (min * 60) + sec;
		return (distance / timeSeconds);
	}

}

/*
 * timeSeconds = (hr * 3600) + (min * 60) + sec; mps = distance / timeSeconds;
 * kph = (distance / 1000.0f) / (timeSeconds / 3600.0f); mph = kph / 1.609;
 * 
 */

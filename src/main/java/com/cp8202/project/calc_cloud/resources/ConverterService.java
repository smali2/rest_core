package com.cp8202.project.calc_cloud.resources;

import com.cp8202.project.calc_cloud.model.Calculator;
import com.cp8202.project.calc_cloud.model.Myconversion;

public class ConverterService {

	public String executeConverter() {
		double param1 = 15;

		StringBuilder response = new StringBuilder();
		response.append("You are testing the standard GET request for ConverterService. Response is as follows: \r\n");
		response.append("15 F to C: "+FahrenheitToCelsius(param1)+"\r\n");
		response.append("15 C to F: "+CelsiusToFahrenheit(param1)+"\r\n");
		response.append("15 Metre to Feet: "+MetreToFeet(param1)+"\r\n");
		response.append("15 Feet to Metre: "+FeetToMetre(param1)+"\r\n");
		response.append("15 Metre to Feet: "+MetreToFeet(param1)+"\r\n");
		response.append("15 Metre To Yard: "+MetreToYard(param1)+"\r\n");
		response.append("15 Yard To Metre: "+YardToMetre(param1)+"\r\n");
		response.append("15 Kilometre To Mile: "+KilometreToMile(param1)+"\r\n");
		response.append("15 Mile To Kilometre: "+MileToKilometre(param1)+"\r\n");
		response.append("15 Kilogram to Pound: "+KilogramtoPound(param1)+"\r\n");
		response.append("15 Pound To Kilogram: "+PoundToKilogram(param1)+"\r\n");
		return response.toString();
	}
	
	public double FahrenheitToCelsius(double param1) {
		return (param1 - 32.00) / 1.8d;
	}
	
	public double CelsiusToFahrenheit(double param1) {
		return param1 * 1.8d + 32.00d;
	}
	
	public double MetreToFeet(double param1) {
		return 3.2808399d * param1;
	}
	
	public double FeetToMetre(double param1) {
		return 0.3048d * param1;
	}
	
	public double MetreToYard(double param1) {
		return 1.0936133d * param1;
	}
	
	public double YardToMetre(double param1) {
		return 0.9144d * param1;
	}
	
	public double KilometreToMile(double param1) {
		return 0.62137119d * param1;
	}
	
	public double MileToKilometre(double param1) {
		return 1.609344d * param1;
	}
	
	public double KilogramtoPound(double param1) {
		return 2.2046229d * param1;
	}
	
	public double PoundToKilogram(double param1) {
		return 0.45359231d * param1;
	}
	
}

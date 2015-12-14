package com.cp8202.project.calc_cloud.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cp8202.project.calc_cloud.model.Calculator;


public class CalculatorService {
 
	public String executeCalculator() {
		double param1 = 15;
		double param2 = 3;
		
		StringBuilder response = new StringBuilder();
		response.append("You are testing the standard GET request for CalculatorService. Response is as follows: \r\n");
		response.append("15 + 3 is: "+add(param1, param2)+"\r\n");
		response.append("15 - 3 is: "+subtractNumbers(param1, param2)+"\r\n");
		response.append("15 * 3 is: "+multiplyNumbers(param1, param2)+"\r\n");
		response.append("15 / 3 is: "+divideNumbers(param1, param2)+"\r\n");
		
		return response.toString();
	}
	
	
    public double add(double param1, double param2) {

        return param1 + param2;
    }
    
	
    public double subtractNumbers(double param1, double param2) {
    	
		return param1 - param2;
	}
	
	
	public double multiplyNumbers(double param1, double param2) {

		return param1 * param2;
	}
	
	
	public double divideNumbers(double param1, double param2) {

		return param1 / param2;
	}
	
	
}
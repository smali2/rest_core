package com.cp8202.project.calc_cloud.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cp8202.project.calc_cloud.model.Calculator;
import com.cp8202.project.calc_cloud.service.CalculatorService;

@Path("/calculator")
public class CalculatorResource {

	CalculatorService calc = new CalculatorService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getCalculator() {
		return calc.executeCalculator();
	}
	
	// Test that JSON works with GET requests.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/testJSON")
	public Calculator getCalculator2() {
		Calculator calc1 = new Calculator(2,3);
		calc1.setOperation("add");
		return calc1;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{operation}")
	public String noOperation() {
		return "Please enter an operation and two paramaters in your browser like this: \r\n http://server/calc/webapi/calculator/{one of: add, subtract, multiply, divide}/param1/param2";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{operation}/{param1}")
	public String noOperation1() {
		return "Please enter an operation and two paramaters in your browser like this: \r\n http://server/calc/webapi/calculator/{one of: add, subtract, multiply, divide}/param1/param2";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{operation}/{param1}/{param2}")
	public double operate(@PathParam("operation") String op, @PathParam("param1") double param1, @PathParam("param2") double param2) {  
		if (op.equals("add")) {
			return calc.add(param1, param2);
		} else if (op.equals("subtract")) {
			return calc.subtractNumbers(param1, param2);
		} else if (op.equals("multiply")) {
			return calc.multiplyNumbers(param1, param2);
		} else {
			return calc.divideNumbers(param1, param2);
		}
		
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public double operatePost(Calculator op) {  
		if (op.getOperation().equals("add")) {
			return calc.add(op.getParam1(), op.getParam2());
		} else if (op.getOperation().equals("subtract")) {
			return calc.subtractNumbers(op.getParam1(), op.getParam2());
		} else if (op.getOperation().equals("multiply")) {
			return calc.multiplyNumbers(op.getParam1(), op.getParam2());
		} else if (op.getOperation().equals("divide")) {
			return calc.divideNumbers(op.getParam1(), op.getParam2());
		} else {
			return 000000.0000;
		}
		
		
		
	}
}

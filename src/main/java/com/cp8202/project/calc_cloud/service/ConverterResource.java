package com.cp8202.project.calc_cloud.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.cp8202.calculator.calc_cloud.ConverterService;
import com.cp8202.project.calc_cloud.model.Myconversion;

@Path("/converter")
public class ConverterResource {

	ConverterService conv = new ConverterService();
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getConverter() {
		return conv.executeConverter();
	}
	
	// Test that JSON works with GET requests.
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/testJSON")
	public Myconversion getConverter2() {
		Myconversion calc1 = new Myconversion(15D, "FahrenheitToCelsius");
		return calc1;
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{operation}")
	public String noOperation() {
		return "Please enter an operation and one paramater in your browser like this: \r\n http://server/calc/webapi/converter/{one of: 'FahrenheitToCelsius', 'CelsiusToFahrenheit', 'MetreToFeet', 'FeetToMetre'}/param1";
		
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/{operation}/{param1}")
	public double operate(@PathParam("operation") String op, @PathParam("param1") double param1) {
		if (op.equals("FahrenheitToCelsius")) {
			return conv.FahrenheitToCelsius(param1);
		} else if (op.equals("CelsiusToFahrenheit")) {
			return conv.CelsiusToFahrenheit(param1);
		} else if (op.equals("MetreToFeet")) {
			return conv.MetreToFeet(param1);
		} else if (op.equals("FeetToMetre")) {
			return conv.FeetToMetre(param1);
		} else if (op.equals("MetreToYard")) {
			return conv.MetreToYard(param1);
		} else if (op.equals("YardToMetre")) {
			return conv.YardToMetre(param1);
		} else if (op.equals("KilometreToMile")) {
			return conv.KilometreToMile(param1);
		} else if (op.equals("MileToKilometre")) {
			return conv.MileToKilometre(param1);
		} else if (op.equals("KilogramtoPound")) {
			return conv.KilogramtoPound(param1);
		} else if (op.equals("PoundToKilogram")) {
			return conv.PoundToKilogram(param1);
		} else {
			return 0000.00000;
		}
		
	}
	
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Consumes(MediaType.APPLICATION_JSON)
	public double operatePost(Myconversion op) {  
		if (op.getOperation().equals("FahrenheitToCelsius")) {
			return conv.FahrenheitToCelsius(op.getParam1());
		} else if (op.getOperation().equals("CelsiusToFahrenheit")) {
			return conv.CelsiusToFahrenheit(op.getParam1());
		} else if (op.getOperation().equals("MetreToFeet")) {
			return conv.MetreToFeet(op.getParam1());
		} else if (op.getOperation().equals("FeetToMetre")) {
			return conv.FeetToMetre(op.getParam1());
		} else if (op.getOperation().equals("MetreToYard")) {
			return conv.MetreToYard(op.getParam1());
		} else if (op.getOperation().equals("YardToMetre")) {
			return conv.YardToMetre(op.getParam1());
		} else if (op.getOperation().equals("KilometreToMile")) {
			return conv.KilometreToMile(op.getParam1());
		} else if (op.getOperation().equals("MileToKilometre")) {
			return conv.MileToKilometre(op.getParam1());
		} else if (op.getOperation().equals("KilogramtoPound")) {
			return conv.KilogramtoPound(op.getParam1());
		} else if (op.getOperation().equals("PoundToKilogram")) {
			return conv.PoundToKilogram(op.getParam1());
		} else {
			return 0000.00000;
		}
		
	}
}

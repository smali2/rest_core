package com.cp8202.project.calc_cloud.model;

public class Myconversion {

	// The two input numbers to work with.
			private double param1;
			private String operation;

			
			public Myconversion() {
				
			}
			
			public Myconversion(double param1, String operation) {
				this.param1 = param1;
				this.operation = operation;
			}
			
			public double getParam1() {
				return param1;
			}
			public void setParam1(double param1) {
				this.param1 = param1;
			}

			public String getOperation() {
				return operation;
			}

			public void setOperation(String operation) {
				this.operation = operation;
			}
			
}

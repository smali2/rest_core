package com.cp8202.project.calc_cloud.model;


public class Calculator {

		// The two input numbers to work with.
		private double param1;
		private double param2;
		private String operation;

		
		public Calculator() {
			
		}
		
		public Calculator(double param1, double param2) {
			this.param1 = param1;
			this.param2 = param2;
		}
		
		public double getParam1() {
			return param1;
		}
		public void setParam1(double param1) {
			this.param1 = param1;
		}
		public double getParam2() {
			return param2;
		}
		public void setParam2(double param2) {
			this.param2 = param2;
		}

		public String getOperation() {
			return operation;
		}

		public void setOperation(String operation) {
			this.operation = operation;
		}
		


		
		
		
		
}

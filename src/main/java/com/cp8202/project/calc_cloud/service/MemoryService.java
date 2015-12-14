package com.cp8202.project.calc_cloud.service;

import java.util.ArrayList;

import com.cp8202.project.calc_cloud.model.Memory;

public class MemoryService {

	
	private ArrayList<Double> mesave = Memory.getSaved(); 
	
	public MemoryService () {
		mesave.add(0, 100D);
	}
	
	
	public String executeMemory() {
		double saved = 15;
		
		//Memory mem = new Memory();
		StringBuilder response = new StringBuilder();
		response.append("You are testing the standard GET request for MemoryService. Response is as follows: \r\n");
		response.append("Saving 15 to memory.\r\n");
		mesave.clear();
		mesave.add(0, saved);
		response.append("Retrieving from memory: "+mesave.get(0)+"\r\n");
		response.append("Clearing memory.\r\n");
		mesave.clear();
		mesave.add(0, 0D);
		response.append("Memory should now be zero: "+mesave.get(0)+"\r\n");
		
		return response.toString();
	}
	
	public double save(double saved) {
		mesave.clear();
		mesave.add(saved);
		return mesave.get(mesave.size()-1);
    }
	
	public String clear() {
		mesave.clear();
		mesave.add(0, 0D);
		return "Memory is now cleared";
    }
	
	public double retrieve() {
		return mesave.get(mesave.size()-1);
    }
}

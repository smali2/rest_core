package com.cp8202.calculator.calc_cloud;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.cp8202.project.calc_cloud.model.Memory;
import com.cp8202.project.calc_cloud.service.MemoryService;

@Path("/memory")
@Produces(MediaType.TEXT_PLAIN)
public class MemoryResource {

	MemoryService ms = new MemoryService();
	
	@GET
	public String getMemory() {
		return ms.executeMemory();
		
	}
	
	@GET
	@Path("/{operation}")
	public String noOperation() {
		return "Invalid subresource. Please provide one of: /clear or /retrieve. If you want to save, you need to do a POST with a plaintext number.";
		
	}
	
	@GET
	@Path("/clear")
	public String clear() {
		return ms.clear();
		
		
	}
	
	@GET
	@Path("/retrieve")
	public double retrieve() {
		return ms.retrieve();
		
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public double save(double param1) {
		return ms.save(param1);
		
	}
	
	// For client testing purposes
	@GET
	@Path("/client/save")
	@Consumes(MediaType.TEXT_PLAIN)
	public double save2(@QueryParam("value1") double param1) {
		return ms.save(param1);
		
	}

}

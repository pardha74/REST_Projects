package com.example.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/hello")

public class RestOne {
	
	@Path("/say")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public Response sayHello(){
		return Response.ok("Hello REST World").type("text/plain").build();
	}
}

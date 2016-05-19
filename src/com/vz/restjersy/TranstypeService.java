package com.vz.restjersy;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import org.json.JSONException;
import org.json.JSONObject;

@Path("/transtypeservice")
public class TranstypeService {

	@Path("{eventId}")
	 @GET
	  @Produces("application/json")
	  public Response getTranstypeByEventId(@PathParam("eventId") float eventId) throws JSONException {

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("Event Id", eventId); 
		jsonObject.put("Transtype", "ACCInfo");

		String result = "@Produces(\"application/json\") Output: \n\nF to C Converter Output: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();
	  }
	 
}

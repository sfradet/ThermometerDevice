/*
 * Group Project
 * Shawn Fradet, Hiram Viezca
 * ThermometerDeviceRestService Version 1
 * CST-326
 * 10/31/2021
 * This class is used for sending data via a REST service.
 */
package rest;


import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class ThermometerDeviceRestService {

	public void sendTempRest(String jsonModel, String username, String password, String url)
	{
		HttpAuthenticationFeature feature = HttpAuthenticationFeature.basic(username, password);
		
		Client client = ClientBuilder.newClient().register(feature);		
						
		try {
			client.target(url)
	         .request(MediaType.APPLICATION_JSON)
	         .accept(MediaType.APPLICATION_JSON)
	         .post(Entity.json(jsonModel),
	            String.class);	
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}		
	}	            
}

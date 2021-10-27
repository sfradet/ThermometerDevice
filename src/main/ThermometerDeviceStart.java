package main;

import device.ThermometerDevice;

public class ThermometerDeviceStart {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String device_name = "Meat Probe";
		String username ="shawn";
		String password ="1234";
		String restURL = "http://localhost:8080/ThermometerProject/rest/rest/posttemps";
		
		ThermometerDevice thermo = new ThermometerDevice(device_name, username, password, restURL);
	}

}

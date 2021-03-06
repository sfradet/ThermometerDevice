/*
 * Group Project
 * Shawn Fradet, Hiram Viezca
 * ThermometerDeviceStart Version 1
 * CST-326
 * 10/31/2021
 * This class is used for starting the simulated thermometer device.
 */

package main;

import device.ThermometerDevice;

public class ThermometerDeviceStart {

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		String device_name = "newdevice"; // Name of registered device
		String username ="sfradet"; // Registered username
		String password ="1234"; // Registered password
		String restURL = "http://localhost:8080/ThermometerProject/rest/rest/posttemps"; // Current REST website
		
		ThermometerDevice thermo = new ThermometerDevice(device_name, username, password, restURL);
	}

}

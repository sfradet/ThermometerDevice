package models;
/*

 * Group Project
 * Shawn Fradet, Hiram Viezca
 * TempModel Version 1
 * CST-326
 * 10/23/2021
 * This is a model for that represents a temperature indication from a thermometer.
 */


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class TempModel {
	
	@XmlElement
	public int temp; // Temperature
	
	@XmlElement
	public String timestamp;
	
	@XmlElement
	public String device_name;
	
	public int device_id;
	
public TempModel() {}
	
	public TempModel(int temp, String timestamp, String device_name)
	{
		this.temp = temp;
		this.timestamp = timestamp;
		this.device_name = device_name;
		this.device_id = 0;
	}
	
	public int getTemp() {
		return temp;
	}
	public void setTemp(int temp) {
		this.temp = temp;
	}

	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public int getDevice_id() {
		return device_id;
	}

	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}

	public void setDevice_name(String device_name) {
		this.device_name = device_name;
	}
	
	public String getDevice_name() {
		return device_name;
	}
}

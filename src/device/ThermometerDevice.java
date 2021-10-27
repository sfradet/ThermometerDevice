package device;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import com.google.gson.Gson;

import models.ResponseDataModel;
import models.TempModel;
import rest.ThermometerDeviceRestService;

public class ThermometerDevice extends TimerTask{

	private int temp; // Temperature
	private Random rand; // Random class for returning temperatures
	private Timer timer; // Timer class for returning temperatures
	private ThermometerDeviceRestService rs;
	private TempModel tempModel;
	private Timestamp timestamp;
	private Gson gson;
	private ResponseDataModel responseModel;
	private String device_name;
	private String username;
	private String password;
	private String url;
	
	public ThermometerDevice(String device_name, String username, String password, String url) 
	{		
		this.rand = new Random();			
		this.temp = this.rand.nextInt(100);
		this.rs = new ThermometerDeviceRestService();
		this.gson =  new Gson();
		this.device_name = device_name;
		this.username = username;
		this.password = password;
		this.url = url;
		startTimer();
	}
	
	public void startTimer()
	{
		this.timer = new Timer();
		timer.schedule(this, (long)10*1000, (long)10*1000);		
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
	}

	@Override
	public void run() {
		// Increase temperature by a random number 1-5
		this.temp = this.temp + this.rand.nextInt(5);
		
		this.timestamp = new Timestamp(Calendar.getInstance().getTime().getTime());		
		
		this.tempModel = new TempModel(temp, timestamp.toString(), device_name);		
		
		this.responseModel = new ResponseDataModel(tempModel, 1, "Good to go");		
		
		String jsonModel = gson.toJson(responseModel);

		rs.sendTempRest(jsonModel, this.username, this.password, this.url);
	};	
}

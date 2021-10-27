package models;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Response")
@XmlAccessorType(XmlAccessType.FIELD)
public class ResponseDataModel extends ResponseModel {

	public TempModel temp;
	
	public ResponseDataModel() 
	{
		super(0, null);
	}

	public ResponseDataModel(int status, String message) 
	{
		super(status, message);
	}
	
	public ResponseDataModel(TempModel temp, int status, String message) 
	{
		super(status, message);
		this.temp = temp;
	}	

	public TempModel getTemp() {
		return temp;
	}

	public void setTemp(TempModel temp) {
		this.temp = temp;
	}	

}

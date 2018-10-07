package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.io.File;

public class Trips {
	private String Source;
	private String Destination;
	private String DepartDate;
	private String ReturnDate;
	private String Type;
	private File txtFile;
	private double price;
	private String CarID;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/Trips.txt");
	}
	public Trips()
	{
		
	}
	public Trips(String Source,String Destination,String DepartDate,String ReturnDate,String Type,double price,String CarID)
	{
		this.Source=Source;
		this.Destination=Destination;
		this.DepartDate=DepartDate;
		this.ReturnDate=ReturnDate;
		this.Type=Type;
		this.price=price;	
		this.CarID=CarID;
	}
	
	public double getPrice() {
		return price;
	}
	public void setID(double price) {
		this.price = price;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	public String getDepartDate() {
		return DepartDate;
	}
	public void setDepartDate(String departDate) {
		DepartDate = departDate;
	}
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getCarID() {
		return CarID;
	}
	public void setCarID(String carID) {
		CarID = carID;
	}
	

}


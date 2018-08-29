package System;

import java.io.File;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

import javax.swing.JOptionPane;

public class Cars {
	private int CarID;
	private String CompCarID;
	public String getCompCarID() {
		return CompCarID;
	}
	public void setCompCarID() {
		CompCarID = getCarID();
	}
	private int NoOfSeats;
	private int AvailNoOfSeats;
	protected ArrayList<String> DestinationOptions=new ArrayList<String>();
	protected int DriverID;
	protected Boolean Available;
	protected String DepartedTime;
	protected String AvailableTime;
	protected String CurrDest;
	private String SourceCars;
	public String getSource() {
		return SourceCars;
	}
	public void setSource(String source) {
		this.SourceCars = source;
	}
	private String Comfortability;
	public void setComfortability() {
		Comfortability = "Low";
	}
	public void setComfortability(String s) {
		Comfortability = s;
	}
	public String getComfortability() {
		return Comfortability;
	}
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/cars.txt");
	}
	protected   Random UniqueRandomize=new Random();
	private  int[] UniqueRandomNumbersCars=new int[100];
	protected  int n=8999;
	private  Boolean Repeated;
	private  int Randomized;
	protected  int minRandom=1001;
	private  String TYPE="Cars";
	private  int count=0;
	public  void main(String[] args)
	{		
		
		
		}
	public Cars()
	{
		
	}
	//creating new object from program
	public Cars(String Source)
	{
		setCarID();
		setCompCarID();
		setNoOfSeats();
		setAvailNoOfSeats();
		this.Available=true;
		setSource(Source);
		setComfortability();
		
	}
	//dynamic loading in array list cuz different variables
	public Cars(String CompCarID,int DriverID,Boolean Available,String DepartedTime,String AvailableTime,String CurrDest,String Source,String Comfortability )
	{
		this.CompCarID=CompCarID;
		this.DriverID=DriverID;
		this.Available=Available;
		this.DepartedTime=DepartedTime;
		this.AvailableTime=AvailableTime;
		this.CurrDest=CurrDest;
		setSource(Source);
		setComfortability(Comfortability);
	}
	//writing into file
	public Cars(String CompCarID,int NoOfSeats,int AvailNoOfSeats,int DriverID,Boolean Available,String DepartedTime,String AvailableTime,String CurrDest,String Source,String Comfortability )
	{
		
		this.CompCarID=CompCarID;
		this.NoOfSeats=NoOfSeats;
		this.AvailNoOfSeats=AvailNoOfSeats;
		this.DriverID=DriverID;
		this.Available=Available;
		this.DepartedTime=DepartedTime;
		this.AvailableTime=AvailableTime;
		this.CurrDest=CurrDest;
		setSource(Source);
		this.Comfortability=Comfortability;		
	
	}
	protected int GenerateRandomID()
	{
		Repeated=true;
		
		while(Repeated)
		{
		Randomized=UniqueRandomize.nextInt(n)+minRandom;
		if(count==99)
		{
			return 0;
		}
		for(int iterate: UniqueRandomNumbersCars)
		{
			if(count==99)
			{
				break;
			}
			if(iterate==Randomized)
			{
				Repeated=true;
			}
			else
			{
				Repeated=false;
				count++;
				UniqueRandomNumbersCars[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	public void TakeSeat()
	{
		AvailNoOfSeats--;
	}
	
	public String getCarID() {
		return CompCarID;
	}
	public String getCarIDGen() {
		return "C-"+Integer.toString(CarID);
	}
	public void setCarID() {
		this.CarID = GenerateRandomID();
	}
	public int getNoOfSeats() {
		return NoOfSeats;
	}
	public void setNoOfSeats() {
		NoOfSeats = 40;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeats;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeats = getNoOfSeats();
	}
	public ArrayList<String> getDestinationOptions() {
		return DestinationOptions;
	}
	public void setDestinationOptions(ArrayList<String> destinationOptions) {
		DestinationOptions = destinationOptions;
	}
	public int getDriverID() {
		return DriverID;
	}
	public void setDriverID(int driverID) {
		DriverID = driverID;
	}
	public Boolean getAvailable() {
		return Available;
	}
	public void setAvailable(Boolean available) {
		this.Available = available;
	}
	public String getDepartedTime() {
		return DepartedTime;
	}
	public void setDepartedTime(String departedTime) {
		this.DepartedTime = departedTime;
	}
	public String getAvailableTime() {
		return AvailableTime;
	}
	public void setAvailableTime(String availableTime) {
		this.AvailableTime = availableTime;
	}
	public String getCurrDest() {
		return CurrDest;
	}
	public void setCurrDest(String currDest) {
		this.CurrDest = currDest;
	}
	public String getgenAvailDate() {
		return AvailableTime;
	}
	public void setgenAvailDate() {
		Calendar date=Calendar.getInstance();
		int day=date.get(Calendar.DAY_OF_MONTH);
		int month=date.get(Calendar.MONTH)+1;
		int year=date.get(Calendar.YEAR);
		String comp=day+"/"+month+"/"+year;
		this.AvailableTime = comp;
	}
	
	

}
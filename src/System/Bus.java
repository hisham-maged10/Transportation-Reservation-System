package System;

import java.io.File;

public class Bus extends Cars{
	public Bus()
	{
		
	}
	//load construct
	
	public Bus(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompBusID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsBus=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsBus=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceBus=null;
		this.CurrDest=null;
		this.ComfortabilityBus=Comfortability;
		
	}
	
	//load construct
	public Bus(String CompCarID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsBus, int AvailNoOfSeatsBus)
	{
		super(CompCarID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompBusID=CompCarID;
		this.NoOfSeatsBus=NoOfSeatsBus;
		this.AvailNoOfSeatsBus=AvailNoOfSeatsBus;
		this.ComfortabilityBus=Comfortability;
		
	}
	
	public Bus(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompBusID=CompCarID;
		this.NoOfSeatsBus=NoOfSeats;
		this.AvailNoOfSeatsBus=AvailNoOfSeats;
		this.ComfortabilityBus=Comfortability;
	}
	
	
	private String ComfortabilityBus;
	public void setComfortability() {
		ComfortabilityBus = "Low";
	}
	public void setnewComfortability(String s) {
		ComfortabilityBus = s;
	}
	public String getComfortability() {
		return ComfortabilityBus;
	}
	private int BusID;
	private String CompBusID;
	
	public String getCompCarID() {
		return CompBusID;
	}
	public void setCompCarID() {
		CompBusID = getCarID();
	}
	private int NoOfSeatsBus;
	private int AvailNoOfSeatsBus;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/bus.txt");
	}
	private String SourceBus;
	public String getSource() {
		return SourceBus;
	}
	public void setSource(String source) {
		this.SourceBus = source;
	}
	private  String TYPE="Bus";
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersBus=new int[100];
	protected  int GenerateRandomID()
	{
		Repeated=true;
		
		while(Repeated)
		{
		Randomized=UniqueRandomize.nextInt(n)+minRandom;
		if(count==99)
		{
			return 0;
		}
		for(int iterate: UniqueRandomNumbersBus)
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
				UniqueRandomNumbersBus[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	
	public void setCarID() {
		this.BusID = GenerateRandomID();
	}
	public String getCarID() {
		return "B-"+Integer.toString(BusID);
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsBus--;
	}
	
	
	public int getNoOfSeats() {
		return NoOfSeatsBus;
	}
	public void setNoOfSeats() {
		NoOfSeatsBus = 40;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsBus;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsBus = getNoOfSeats();
	}
	
}

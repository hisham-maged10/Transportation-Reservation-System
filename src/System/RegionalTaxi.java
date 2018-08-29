package System;

import java.io.File;

public class RegionalTaxi extends Cars{

	public RegionalTaxi()
	{
		
	}
	public RegionalTaxi(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompTaxiID=CompCarID;
		this.NoOfSeatsTaxi=NoOfSeats;
		this.AvailNoOfSeatsTaxi=AvailNoOfSeats;
		this.ComfortabilityTaxi=Comfortability;
		
	}
	public RegionalTaxi(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompTaxiID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsTaxi=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsTaxi=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceTaxi=null;
		this.CurrDest=null;
		setComfortability();
		this.ComfortabilityTaxi=Comfortability;
		
	}
	
	public RegionalTaxi(String CompTaxiID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsTaxi, int AvailNoOfSeatsTaxi)
	{
		super(CompTaxiID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompTaxiID=CompTaxiID;
		this.NoOfSeatsTaxi=NoOfSeatsTaxi;
		this.AvailNoOfSeatsTaxi=AvailNoOfSeatsTaxi;
		this.ComfortabilityTaxi=Comfortability;
	}
	
	
	
	
	
	private String ComfortabilityTaxi;
	public void setComfortability() {
		ComfortabilityTaxi = "High";
	}
	public void setComfortability(String s) {
		ComfortabilityTaxi= s;
	}
	public String getComfortability() {
		return ComfortabilityTaxi;
	}
	private int TaxiID;
	private String CompTaxiID;
	public String getCompCarID() {
		return CompTaxiID;
	}
	public void setCompCarID() {
		CompTaxiID = getCarID();
	}
	private int NoOfSeatsTaxi;
	private int AvailNoOfSeatsTaxi;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/regionaltaxi.txt");
	}
	private String SourceTaxi;
	public String getSource() {
		return SourceTaxi;
	}
	public void setSource(String source) {
		SourceTaxi= source;
	}
	private  String TYPE="Taxi";
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersTaxi=new int[100];
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
		for(int iterate: UniqueRandomNumbersTaxi)
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
				UniqueRandomNumbersTaxi[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	
	public void setCarID() {
		this.TaxiID = GenerateRandomID();
	}
	public String getCarID() {
		return "RT-"+Integer.toString(TaxiID);
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsTaxi--;
	}
	
	public int getNoOfSeats() {
		return NoOfSeatsTaxi;
	}
	public void setNoOfSeats() {
		NoOfSeatsTaxi = 4;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsTaxi;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsTaxi = getNoOfSeats();
	}
}
	
	

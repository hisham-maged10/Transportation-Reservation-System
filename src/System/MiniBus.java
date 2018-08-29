package System;

import java.io.File;


public class MiniBus extends Cars {
	
	public MiniBus()
	{
		
	}
	
	
	
	public MiniBus(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompMiniID=CompCarID;
		this.NoOfSeatsMiniBus=NoOfSeats;
		this.AvailNoOfSeatsMiniBus=AvailNoOfSeats;
		this.ComfortabilityMiniBus=Comfortability;
	}
	public MiniBus(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompMiniID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsMiniBus=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsMiniBus=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceMini=null;
		this.CurrDest=null;
		setComfortability();
		this.ComfortabilityMiniBus=Comfortability;
	}
	
	public MiniBus(String CompCarID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsMiniBus, int AvailNoOfSeatsMiniBus)
	{
		super(CompCarID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompMiniID=CompCarID;
		this.NoOfSeatsMiniBus=NoOfSeatsMiniBus;
		this.AvailNoOfSeatsMiniBus=AvailNoOfSeatsMiniBus;
		this.ComfortabilityMiniBus=Comfortability;
	}
	private int MiniID;
	private String CompMiniID;
	public String getCompCarID() {
		return CompMiniID;
	}
	public void setCompCarID() {
		CompMiniID = getCarID();
	}
	private String ComfortabilityMiniBus;
	public void setComfortability() {
		ComfortabilityMiniBus = "Intermediata";
	}
	public void setComfortability(String s) {
		ComfortabilityMiniBus = s;
	}
	public String getComfortability() {
		return ComfortabilityMiniBus;
	}
	private int NoOfSeatsMiniBus;
	private int AvailNoOfSeatsMiniBus;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/minibus.txt");
	}
	private  String TYPE="Minibus";
	private String SourceMini;
	public String getSource() {
		return SourceMini;
	}
	public void setSource(String source) {
		SourceMini = source;
	}
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersMiniBus=new int[100];

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
		for(int iterate: UniqueRandomNumbersMiniBus)
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
				UniqueRandomNumbersMiniBus[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	public void setCarID() {
		this.MiniID = GenerateRandomID();
	}
	public String getCarID() {
		return "MB-"+Integer.toString(MiniID);
	}
	public void setNoOfSeatsMiniBus(int NoOfSeatsMiniBus) {
		this.NoOfSeatsMiniBus = NoOfSeatsMiniBus;
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsMiniBus--;
	}
	public int getNoOfSeats() {
		return NoOfSeatsMiniBus;
	}
	public void setNoOfSeats() {
		NoOfSeatsMiniBus = 14;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsMiniBus;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsMiniBus = getNoOfSeats();
	}
}
package System;

import java.io.File;


public class Limo extends Cars{
	
	public Limo()
	{
		
	}
	public Limo(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompLimoID=CompCarID;
		this.NoOfSeatsLimo=NoOfSeats;
		this.AvailNoOfSeatsLimo=AvailNoOfSeats;
		this.ComfortabilityLimo=Comfortability;
	}
	public Limo(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompLimoID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsLimo=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsLimo=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceLimo=null;
		this.CurrDest=null;
		setComfortability();
		this.ComfortabilityLimo=Comfortability;
	}
	
	public Limo(String CompCarID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsLimo, int AvailNoOfSeatsLimo)
	{
		super(CompCarID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompLimoID=CompCarID;
		this.NoOfSeatsLimo=NoOfSeatsLimo;
		this.AvailNoOfSeatsLimo=AvailNoOfSeatsLimo;
		this.ComfortabilityLimo=Comfortability;
	}
	private String ComfortabilityLimo;
	public void setComfortability() {
		ComfortabilityLimo = "High";
	}
	public void setComfortability(String s) {
		ComfortabilityLimo = s;
	}
	public String getComfortability() {
		return ComfortabilityLimo;
	}
	private int LimoID;
	private String CompLimoID;
	public String getCompCarID() {
		return CompLimoID;
	}
	public void setCompCarID() {
		CompLimoID = getCarID();
	}
	private int NoOfSeatsLimo;
	private int AvailNoOfSeatsLimo;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/limousine.txt");
	}
	private  String TYPE="Limousine";
	
	private String SourceLimo;
	public String getSource() {
		return SourceLimo;
	}
	public void setSource(String source) {
		SourceLimo = source;
	}
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersLimo=new int[100];
	
	
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
		for(int iterate: UniqueRandomNumbersLimo)
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
				UniqueRandomNumbersLimo[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	
	public void setCarID() {
		this.LimoID = GenerateRandomID();
	}
	public String getCarID() {
		return "L-"+Integer.toString(LimoID);
	}
	public void setNoOfSeatsLimo(int NoOfSeatsLimo) {
		this.NoOfSeatsLimo = NoOfSeatsLimo;
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsLimo--;
	}
	public int getNoOfSeats() {
		return NoOfSeatsLimo;
	}
	public void setNoOfSeats() {
		NoOfSeatsLimo = 8;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsLimo;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsLimo = getNoOfSeats();
	}
	
}

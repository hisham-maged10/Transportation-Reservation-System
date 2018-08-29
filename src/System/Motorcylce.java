package System;

import java.io.File;


public class Motorcylce extends Cars {
	
	public Motorcylce()
	{
		
	}
	
		public Motorcylce(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
				String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
		{
			super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
					Comfortability);
			this.CompMotorID=CompCarID;
			this.NoOfSeatsMotor=NoOfSeats;
			this.AvailNoOfSeatsMotor=AvailNoOfSeats;
			this.ComfortabilityMotor=Comfortability;
		}
		public Motorcylce(String Comfortability,int DriverID)
		{
			setCarID();
			setCompCarID();
			this.CompMotorID=getCompCarID();
			setNoOfSeats();
			this.NoOfSeatsMotor=getNoOfSeats();
			setAvailNoOfSeats();
			this.AvailNoOfSeatsMotor=getAvailNoOfSeats();
			this.DriverID=DriverID;
			this.Available=true;
			this.DepartedTime=null;
			setgenAvailDate();
			this.AvailableTime=getgenAvailDate();
			this.SourceMotor=null;
			this.CurrDest=null;
			setComfortability();
			this.ComfortabilityMotor=Comfortability;
		}
		
		public Motorcylce(String CompCarID,int DriverID, Boolean Available,
				String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsMotor, int AvailNoOfSeatsMotor)
		{
			super(CompCarID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
					Comfortability);
			this.CompMotorID=CompCarID;
			this.NoOfSeatsMotor=NoOfSeatsMotor;
			this.AvailNoOfSeatsMotor=AvailNoOfSeatsMotor;
			this.ComfortabilityMotor=Comfortability;
		}
			
	
	
	
	private int MotorID;
	private String CompMotorID;
	public String getCompCarID() {
		return CompMotorID;
	}
	public void setCompCarID() {
		CompMotorID = getCarID();
		}
	private String ComfortabilityMotor;
	public void setComfortability() {
		ComfortabilityMotor = "Low";
	}
	public void setComfortability(String s) {
		ComfortabilityMotor = s;
	}
	public String getComfortability() {
		return ComfortabilityMotor;
	}
	private int NoOfSeatsMotor;
	private int AvailNoOfSeatsMotor;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/motorcycle.txt");
	}
	private  String TYPE="Motorcycle";
	private String SourceMotor;
	public String getSource() {
		return SourceMotor;
	}
	public void setSource(String source) {
		SourceMotor = source;
	}
	private  int count=0;
	private  int[] UniqueRandomNumbersMotor=new int[100];
	private  Boolean Repeated;
	private  int Randomized;
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
		for(int iterate: UniqueRandomNumbersMotor)
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
				UniqueRandomNumbersMotor[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	public void setCarID() {
		this.MotorID = GenerateRandomID();
	}
	public String getCarID() {
		return "M-"+Integer.toString(MotorID);
	}
	public void setNoOfSeatsMotor(int NoOfSeatsMotor) {
		this.NoOfSeatsMotor = NoOfSeatsMotor;
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsMotor--;
	}
	
	public int getNoOfSeats() {
		return NoOfSeatsMotor;
	}
	public void setNoOfSeats() {
		NoOfSeatsMotor = 1;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsMotor;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsMotor = getNoOfSeats();
	}
	
}
package System;

import java.io.File;


public class Train extends Cars{
	public Train()
	{
		
	}
	public Train(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompTrainID=CompCarID;
		this.NoOfSeatsTrain=NoOfSeats;
		this.AvailNoOfSeatsTrain=AvailNoOfSeats;
		this.ComfortabilityTrain=Comfortability;
		
	}
	public Train(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompTrainID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsTrain=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsTrain=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceTrain=null;
		this.CurrDest=null;
		setComfortability();
		this.ComfortabilityTrain=Comfortability;
		
	}
	
	public Train(String CompTrainID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsTrain, int AvailNoOfSeatsTrain)
	{
		super(CompTrainID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompTrainID=CompTrainID;
		this.NoOfSeatsTrain=NoOfSeatsTrain;
		this.AvailNoOfSeatsTrain=AvailNoOfSeatsTrain;
		this.ComfortabilityTrain=Comfortability;
	}
	
	
	
	
	
	private String ComfortabilityTrain;
	public void setComfortability() {
		ComfortabilityTrain = "Intermediate";
	}
	public void setComfortability(String s) {
		ComfortabilityTrain= s;
	}
	public String getComfortability() {
		return ComfortabilityTrain;
	}
	private int TrainID;
	private String CompTrainID;
	public String getCompCarID() {
		return CompTrainID;
	}
	public void setCompCarID() {
		CompTrainID = getCarID();
	}
	private int NoOfSeatsTrain;
	private int AvailNoOfSeatsTrain;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/train.txt");
	}
	private String SourceTrain;
	public String getSource() {
		return SourceTrain;
	}
	public void setSource(String source) {
		SourceTrain= source;
	}
	private  String TYPE="Train";
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersTrain=new int[100];
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
		for(int iterate: UniqueRandomNumbersTrain)
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
				UniqueRandomNumbersTrain[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	
	public void setCarID() {
		this.TrainID = GenerateRandomID();
	}
	public String getCarID() {
		return "T-"+Integer.toString(TrainID);
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsTrain--;
	}
	
	public int getNoOfSeats() {
		return NoOfSeatsTrain;
	}
	public void setNoOfSeats() {
		NoOfSeatsTrain = 90;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsTrain;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsTrain = getNoOfSeats();
	}
}
	
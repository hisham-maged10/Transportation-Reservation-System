package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.io.File;

public class Metro extends Cars{
	public Metro()
	{
		
	}
	public Metro(String CompCarID, int NoOfSeats, int AvailNoOfSeats, int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability) 
	{
		super(CompCarID,NoOfSeats,AvailNoOfSeats,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompMetroID=CompCarID;
		this.NoOfSeatsMetro=NoOfSeats;
		this.AvailNoOfSeatsMetro=AvailNoOfSeats;
		this.ComfortabilityMetro=Comfortability;
	}
	public Metro(String Comfortability,int DriverID)
	{
		setCarID();
		setCompCarID();
		this.CompMetroID=getCompCarID();
		setNoOfSeats();
		this.NoOfSeatsMetro=getNoOfSeats();
		setAvailNoOfSeats();
		this.AvailNoOfSeatsMetro=getAvailNoOfSeats();
		this.DriverID=DriverID;
		this.Available=true;
		this.DepartedTime=null;
		setgenAvailDate();
		this.AvailableTime=getgenAvailDate();
		this.SourceMetro=null;
		this.CurrDest=null;
		setComfortability();
		this.ComfortabilityMetro=Comfortability;
		
	}
	
	public Metro(String CompMetroID,int DriverID, Boolean Available,
			String DepartedTime, String AvailableTime, String CurrDest, String Source, String Comfortability,int NoOfSeatsMetro, int AvailNoOfSeatsMetro)
	{
		super(CompMetroID,DriverID,Available,DepartedTime,AvailableTime,CurrDest,Source,
				Comfortability);
		this.CompMetroID=CompMetroID;
		this.NoOfSeatsMetro=NoOfSeatsMetro;
		this.AvailNoOfSeatsMetro=AvailNoOfSeatsMetro;
		this.ComfortabilityMetro=Comfortability;
	}
	
	
	
	
	
	private String ComfortabilityMetro;
	public void setComfortability() {
		ComfortabilityMetro = "High";
	}
	public void setComfortability(String s) {
		ComfortabilityMetro= s;
	}
	public String getComfortability() {
		return ComfortabilityMetro;
	}
	private int MetroID;
	private String CompMetroID;
	public String getCompCarID() {
		return CompMetroID;
	}
	public void setCompCarID() {
		CompMetroID = getCarID();
	}
	private int NoOfSeatsMetro;
	private int AvailNoOfSeatsMetro;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/metro.txt");
	}
	private String SourceMetro;
	public String getSource() {
		return SourceMetro;
	}
	public void setSource(String source) {
		SourceMetro= source;
	}
	private  String TYPE="Metro";
	private  int count=0;
	private  Boolean Repeated;
	private  int Randomized;
	private  int[] UniqueRandomNumbersMetro=new int[100];
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
		for(int iterate: UniqueRandomNumbersMetro)
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
				UniqueRandomNumbersMetro[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	
	public void setCarID() {
		this.MetroID = GenerateRandomID();
	}
	public String getCarID() {
		return "MT-"+Integer.toString(MetroID);
	}
	public void TakeSeat()
	{
		AvailNoOfSeatsMetro--;
	}
	
	public int getNoOfSeats() {
		return NoOfSeatsMetro;
	}
	public void setNoOfSeats() {
		NoOfSeatsMetro = 4;
	}
	public int getAvailNoOfSeats() {
		return AvailNoOfSeatsMetro;
	}
	public void setAvailNoOfSeats() {
		AvailNoOfSeatsMetro = getNoOfSeats();
	}
}

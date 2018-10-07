package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.io.File;


public class User extends Human{
	public User()
	{
		
	}
	
	
	//read&write
	public User(String FirstName,String LastName,int HumanID,String PhoneNumber,int Age,String State,int tripCounter,int TripsIn,String Password)
	{
		super(FirstName,LastName,HumanID,PhoneNumber,Age,State,Password);
		this.tripsCounter=tripCounter;
		this.tripsIN=TripsIn;
		this.UserID=HumanID;
		this.StateUser=State;
	}
	


	//New user
	public User(String FirstName,String LastName,String PhoneNumber,int Age,String Password)
	{
		super(FirstName,LastName,PhoneNumber,Age,Password);
		this.UserID=setGenHumanID();
		this.StateUser=setDefaultState();
		this.tripsCounter=setDefaultTripsCounter();
		this.tripsIN=setDefaultTripsIN();
		
	}
	

	
	
	
	private File txtFile;
	private String StateUser;
	private int tripsIN;
	private int tripsCounter;
	private int UserID;
	public int getTripsIN() {
		return tripsIN;
	}


	public void setTripsIN(int tripsIN) {
		this.tripsIN = tripsIN;
	}
	public int setDefaultTripsIN()
	{
		this.tripsIN=0;
		return tripsIN;
	}


	public int getTripsCounter() {
		return tripsCounter;
	}


	public void setTripsCounter(int tripsCounter) {
		this.tripsCounter = tripsCounter;
	}
	public int setDefaultTripsCounter() {
		this.tripsCounter = 0;
		return tripsCounter;
	}







	private  int[] UniqueRandomNumbersUsers=new int[100];
	protected  int n=8999;
	private  Boolean Repeated;
	private  int Randomized;
	protected  int minRandom=1001;
	private  int count=0;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/users.txt");
	}
	
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
		for(int iterate: UniqueRandomNumbersUsers)
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
				UniqueRandomNumbersUsers[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	public int getHumanID() {
		return UserID;
	}
	public void setHumanID(int UserID) {
		this.UserID = GenerateRandomID();
	}
	public int setGenHumanID() {
		this.UserID = GenerateRandomID();
		return UserID;
	}
	public String setDefaultState() {
		
		this.StateUser = "Normal";
		return StateUser;
	}
	public String getState() {
		return StateUser;
	}
	public void setState(String stateUser) {
		this.StateUser = stateUser;
	}


	
	
	
	
	

}

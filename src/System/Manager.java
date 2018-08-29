package System;

import java.io.File;


public class Manager extends Human{
	
	public Manager()
	{
		
	}
	
	
	//read&write
	public Manager(String FirstName,String LastName,int HumanID,String PhoneNumber,double Salary,int Age,String State,String Password)
	{
		super(FirstName,LastName,HumanID,PhoneNumber,Age,State,Password);
		this.ManagerID=HumanID;
		this.StateManager=State;
		if(State.equalsIgnoreCase("senior"))
				{
			this.SalaryManager=7000;
				}
		else
		{
			this.SalaryManager=5000;
		}
		
	}
	
	public Manager(String FirstName,String LastName,String PhoneNumber,int Age,String Password)
	{
		super(FirstName,LastName,PhoneNumber,Age,Password);
		this.ManagerID=setGenHumanID();
		this.StateManager=setDefaultState();
		this.SalaryManager=5000;
		
	}
	
	
	
	
	
	
	
	private File txtFile;
	private double SalaryManager;
	private int ManagerID;
	private String StateManager;
	public double getSalary() {
		return SalaryManager;
	}


	public void setSalary(double salaryManager) {
		SalaryManager = salaryManager;
	}

	private  int[] UniqueRandomNumbersManagers=new int[100];
	protected  int n=8999;
	private  Boolean Repeated;
	private  int Randomized;
	protected  int minRandom=1001;
	private  int count=0;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/managers.txt");
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
		for(int iterate: UniqueRandomNumbersManagers)
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
				UniqueRandomNumbersManagers[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	public int getHumanID() {
		return ManagerID;
	}
	public void setHumanID(int driverID) {
		ManagerID = driverID;
	}
	public int setGenHumanID() {
		this.ManagerID = GenerateRandomID();
		return ManagerID;
	}
	public String getState() {
		return StateManager;
	}
public String setDefaultState() {
		
		this.StateManager = "Normal";
		return StateManager;
	}
}

package System;

import java.io.File;
import java.util.Calendar;


public class Employee extends Human{
	public Employee()
	{
		
	}
	
	
	//read&write
	public Employee(String FirstName,String LastName,int HumanID,String PhoneNumber,String StartDate,Boolean Available,
			String CarDrivingID,String CurrDest,String DepartedDate,String AvailTime,double SalaryEmp,int Age,String Professionality,String StateEmployee,int tripsMade,String Password)
	{
		super(FirstName,LastName,HumanID,PhoneNumber,StartDate,Available,CarDrivingID,CurrDest,DepartedDate,AvailTime,Age,Password);
		this.StartDateEmployee=StartDate;
		this.Professionality=Professionality;
		this.StateEmployee=StateEmployee;
		this.tripsMade=tripsMade;
		this.SalaryEmp=SalaryEmp;
		this.EmpID=HumanID;
		
	}
	
	//New Employee for admin
	public Employee(String FirstName,String LastName,String PhoneNumber,int Age,String State,String Password)
	{
		super(FirstName,LastName,PhoneNumber,Age,Password);
		this.tripsMade=0;
		this.StateEmployee=State;
		this.EmpID=setGenHumanID() ;
		this.Professionality="Low";
		setStartDate();
		this.StartDateEmployee=getStartDate();
		if(StateEmployee.equalsIgnoreCase("senior"))
		{
			this.SalaryEmp=3750;
		}
		else
		{
			this.SalaryEmp=2750;
		}
	}
	//Standard new Employee
	public Employee(String FirstName,String LastName,String PhoneNumber,int Age,String Password)
	{
		super(FirstName,LastName,PhoneNumber,Age,Password);
		this.tripsMade=0;
		this.EmpID=setGenHumanID() ;
		this.StateEmployee=setDefaultState();
		this.Professionality="Low";
		this.SalaryEmp=2750;
		setStartDate();
		this.StartDateEmployee=getStartDate();
		this.tripsMade=0;
		
		
			}
	

	
	public double getSalary() {
		return SalaryEmp;
	}


	public void setSalary(double salaryEmp) {
		SalaryEmp = salaryEmp;
	}


	public String getProfessionality() {
		return Professionality;
	}


	public void setProfessionality(String professionality) {
		Professionality = professionality;
	}


	public String getState() {
		return StateEmployee;
	}


	public void setState(String stateEmployee) {
		StateEmployee = stateEmployee;
	}


	
	private File txtFile;
	private int tripsMade;
	private double SalaryEmp;
	private int EmpID;
	private String Professionality;
	private String StateEmployee;
	private String StartDateEmployee;
	

	public int getTripsMade() {
		return tripsMade;
	}


	public void setTripsMade(int tripsMade) {
		this.tripsMade = tripsMade;
	}







	private  int[] UniqueRandomNumbersEmployees=new int[100];
	protected  int n=8999;
	private  Boolean Repeated;
	private  int Randomized;
	protected  int minRandom=1001;
	private  int count=0;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/employees.txt");
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
		for(int iterate: UniqueRandomNumbersEmployees)
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
				UniqueRandomNumbersEmployees[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	public int getHumanID() {
		return EmpID;
	}
	public void setHumanID(int driverID) {
		EmpID = driverID;
	}
	public int setGenHumanID() {
		EmpID = GenerateRandomID();
		return EmpID;
	}
	
	
	public String setDefaultState() {
		
		this.StateEmployee = "Normal";
		return StateEmployee;
	}
	
	public String getStartDate() {
		return StartDateEmployee;
	}
	public void setStartDate() {
		Calendar date=Calendar.getInstance();
		int day=date.get(Calendar.DAY_OF_MONTH);
		int month=date.get(Calendar.MONTH)+1;
		int year=date.get(Calendar.YEAR);
		String comp=day+"/"+month+"/"+year;
		this.StartDateEmployee = comp;
	}
	
	
}

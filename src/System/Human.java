package System;

import java.io.File;
import java.util.Calendar;
import java.util.Random;

public class Human {
	
	private String FirstName;
	private String LastName;
	private String PhoneNumber;
	private String StartDate;
	private Boolean Available;
	private String CarDrivingID;
	private String CurrDest;
	private String DepartedTime;
	private int HumanID;
	private String Password;
	private String AvailTime;
	private double Salary;
	private int Age;
	private String State;
	protected   Random UniqueRandomize=new Random();
	private  int[] UniqueRandomNumbers=new int[100];
	protected  int n=8999;
	private  Boolean Repeated;
	private  int Randomized;
	protected  int minRandom=1001;
	private  int count=0;
	private File txtFile;
	
	public File getTxtFile() {
		return txtFile;
	}




	public void setTxtFile() {
		this.txtFile = new File("src/System/data/humans.txt");
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
		for(int iterate: UniqueRandomNumbers)
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
				UniqueRandomNumbers[count]=Randomized;
				return Randomized;
			}
		}
		
		}
		return 0;
		
	}
	
	
	
	
	protected void Assigned()
	{
		Available=false;
	}
	
	
	public Human()
	{
		
	}
	//user and manager >>add no of trips,howmuch trips in nw and in manager add if state 7ot salary
	public Human(String FirstName,String LastName,int HumanID,String PhoneNumber,int Age,String State,String Password)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.HumanID=HumanID;
		this.PhoneNumber=PhoneNumber;
		this.Age=Age;
		this.State=State;
		this.Password=Password;
	}
	//creating new User
	public Human(String FirstName,String LastName,String PhoneNumber,int Age,String Password)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.PhoneNumber=PhoneNumber;
		this.Age=Age;
		this.Password=Password;
		this.Available=true;
		this.CarDrivingID=null;
		this.DepartedTime=null;
		setStartDate();
		this.AvailTime=getStartDate();
		
	}
	
	//Employee
	public Human(String FirstName,String LastName,int HumanID,String PhoneNumber,String StartDate,Boolean Available,String CarDrivingID,String CurrDest,String DepartedDate,String AvailTime,int Age,String Password)
	{
		this.FirstName=FirstName;
		this.LastName=LastName;
		this.HumanID=HumanID;
		this.PhoneNumber=PhoneNumber;
		this.StartDate=StartDate;
		this.Available=Available;
		this.CarDrivingID=CarDrivingID;
		this.CurrDest=CurrDest;
		this.DepartedTime=DepartedDate;
		this.AvailTime=AvailTime;
		this.Age=Age;
		this.Password=Password;
		
	}
	
	
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getPhoneNumber() {
		return PhoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}
	public String getStartDate() {
		return StartDate;
	}
	public void setStartDate() {
		Calendar date=Calendar.getInstance();
		int day=date.get(Calendar.DAY_OF_MONTH);
		int month=date.get(Calendar.MONTH)+1;
		int year=date.get(Calendar.YEAR);
		String comp=day+"/"+month+"/"+year;
		this.StartDate = comp;
	}
	public Boolean getAvailable() {
		return Available;
	}
	public void setAvailable(Boolean available) {
		this.Available = available;
	}
	public String getCarDrivingID() {
		return CarDrivingID;
	}
	public void setCarDrivingID(String carDrivingID) {
		this.CarDrivingID = carDrivingID;
	}
	public String getCurrDest() {
		return CurrDest;
	}
	public void setCurrDest(String currDest) {
		CurrDest = currDest;
	}
	public String getDepartedTime() {
		return DepartedTime;
	}
	public void setDepartedTime(String departedTime) {
		DepartedTime = departedTime;
	}
	public int getHumanID() {
		return HumanID;
	}
	public void setHumanID(int driverID) {
		HumanID = driverID;
	}
	public int setGenHumanID() {
		this.HumanID = GenerateRandomID();
		return HumanID;
	}
	public String getAvailTime() {
		return AvailTime;
	}
	public void setAvailTime(String availTime) {
		AvailTime = availTime;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		this.State = state;
	}
	public String setDefaultState() {
		this.State = "Normal";
		return State;
	}
	public String getPassword() {
		return this.Password;
	}

}
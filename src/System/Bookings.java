package System;

import java.io.File;
import java.util.Random;
import java.io.*;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
public class Bookings {
	private String TripDest;
	private String TripType; //oneway wala round
	private String TripDate;
	private String ReturnDate;
	public String getReturnDate() {
		return ReturnDate;
	}
	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}

	private String CarType;
	private String CarStops;
	private String CarID;
	private double Price;
	private int Seats;
	private String UserFirstName;
	private String UserLastName;
	private String Source;
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}

	private int BookingID;
	private int UserID;
	private File txtFile;
	public File getTxtFile() {
		return txtFile;
	}
	public void setTxtFile() {
		this.txtFile = new File("src/System/data/bookings.txt");
	}
	public int getSeats() {
		return this.Seats;
	}



	public String getTripDest() {
		return TripDest;
	}



	public void setTripDest(String tripDest) {
		TripDest = tripDest;
	}



	public String getTripType() {
		return TripType;
	}



	public void setTripType(String tripType) {
		TripType = tripType;
	}



	public String getTripDate() {
		return TripDate;
	}



	public void setTripDate(String tripDate) {
		TripDate = tripDate;
	}



	public String getCarType() {
		return CarType;
	}



	public void setCarType(String carType) {
		CarType = carType;
	}



	public String getCarStops() {
		return CarStops;
	}



	public void setCarStops(String carStops) {
		CarStops = carStops;
	}



	public String getCarID() {
		return CarID;
	}



	public void setCarID(String carID) {
		CarID = carID;
	}



	public double getPrice() {
		return Price;
	}



	public void setPrice(double price) {
		Price = price;
	}



	public int getBookingID() {
		return BookingID;
	}



	public void setBookingID(int bookingID) {
		BookingID = bookingID;
	}






	public void setSeats(int Seats) {
		Seats = Seats;
	}



	public String getUserFirstName() {
		return UserFirstName;
	}



	public void setUserFirstName(String userFirstName) {
		UserFirstName = userFirstName;
	}



	public String getUserLastName() {
		return UserLastName;
	}



	public void setUserLastName(String userLastName) {
		UserLastName = userLastName;
	}



	public int getUserID() {
		return UserID;
	}



	public void setUserID(int userID) {
		UserID = userID;
	}
	
	public Bookings()
	{
		
	}
	
	
	
	public Bookings(String Source,String TripDest,String TripType,String TripDate,String ReturnDate,String CarType,String CarStops,String CarID,double Price,int Seats,String UserFirstName,String UserLastName,int BookingID,int UserID )
	{
		this.TripDest=TripDest;
		this.TripType=TripType;
		this.TripDate=TripDate;
		this.ReturnDate=ReturnDate;
		this.CarType=CarType;
		this.CarID=CarID;
		this.Price=Price;
		this.Seats=Seats;
		this.UserFirstName=UserFirstName;
		this.UserLastName=UserLastName;
		this.BookingID=BookingID;
		this.UserID=UserID;
		this.CarStops=CarStops;
		this.Source=Source;
		
		
	}
	
	public Bookings(String Source,String TripDest,String TripType,String TripDate,String ReturnDate,String CarType,String CarStops,String CarID,double Price,String UserFirstName,String UserLastName,int UserID)
	{
		this.TripDest=TripDest;
		this.TripType=TripType;
		this.TripDate=TripDate;
		this.ReturnDate=ReturnDate;
		this.CarType=CarType;
		this.CarID=CarID;
		this.Price=Price;
		this.UserFirstName=UserFirstName;
		this.UserLastName=UserLastName;
		Random x=new Random();
		this.BookingID=x.nextInt(8899)+101;
		switch(CarType)
		{
		case "Bus":this.Seats=x.nextInt(39)+1;break;
		case "Limousine":this.Seats=x.nextInt(7)+1;break;
		case "Mini-Bus":this.Seats=x.nextInt(13)+1;break;
		case "Taxi":this.Seats=2;break;
		case "Train":this.Seats=x.nextInt(89)+1;break;
		case "Metro":this.Seats=x.nextInt(89)+1;break;
		case "Motorcycle":this.Seats=2;break;
		}
		this.CarStops=CarStops;
		this.Source=Source;
		this.UserID=UserID;
		
		
	}
	
	
}

package System;
/**
 * @author ${hisham_maged10}
 *https://github.com/hisham-maged10
 * ${DesktopApps}
 */
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class FileHandling {
	protected  Bookings book=new Bookings();
	protected  ArrayList<Bookings> bookings=new ArrayList<Bookings>();
	protected  ArrayList<Cars> cars=new ArrayList<Cars>();
	protected  ArrayList<Bus> buses=new ArrayList<Bus>();
	protected  ArrayList<Limo> limos=new ArrayList<Limo>();
	protected  ArrayList<MiniBus> minibuses=new ArrayList<MiniBus>();
	protected  ArrayList<Motorcylce> motorcycles=new ArrayList<Motorcylce>();
	protected  ArrayList<Train> trains=new ArrayList<Train>();
	protected  ArrayList<RegionalTaxi> taxis=new ArrayList<RegionalTaxi>();
	protected  ArrayList<Metro> metros=new ArrayList<Metro>();
	protected  ArrayList<User> users=new ArrayList<User>();
	protected  ArrayList<Employee> employees=new ArrayList<Employee>();
	protected  ArrayList<Manager> managers=new ArrayList<Manager>();
	protected  ArrayList<Trips> trips=new ArrayList<Trips>();
	protected  Cars bus=new Bus();
	protected  Cars limo=new Limo();
	protected  Cars minibus=new MiniBus();
	protected  Cars motor=new Motorcylce();
	protected  Cars train=new Train();
	protected  Cars taxi=new RegionalTaxi();
	protected  Cars metro=new Metro();
	protected  Cars car=new Cars();
	protected  Human user=new User();
	protected  Human employee=new Employee();
	protected  Human manager=new Manager();
	protected  Trips trip=new Trips();
	protected final  void LoadInfo(Object topolyObj,int ClassNo)
	{
		Object polyObj=null;
		String Type = null;
		switch(ClassNo)
		{
		case 1:
		{
			System.out.println("ent");
			polyObj=(Cars) topolyObj;
			if(polyObj instanceof Bus)
			{
				 Type="Bus";
				 buses.clear();
			}
			else if(polyObj instanceof Limo)
			{
				Type="Limo";
				limos.clear();
			}
			else if(polyObj instanceof MiniBus)
			{
				Type="MiniBus";
				minibuses.clear();
			}
			else if(polyObj instanceof Motorcylce)
			{
				Type="Motorcylce";
				motorcycles.clear();
			}
			else if(polyObj instanceof Train)
			{
				Type="Train";
				trains.clear();
			}
			else if(polyObj instanceof RegionalTaxi)
			{
				Type="RegionalTaxi";
				taxis.clear();
			}
			else if(polyObj instanceof Metro)
			{
				Type="Metro";
				metros.clear();
			}
			else if(polyObj instanceof Cars)
			{
				Type="Cars";
				cars.clear();
			}
		break;
		}
		case 2:
		{
			polyObj=(Bookings) topolyObj;
			bookings.clear();
			break;
		}
		case 3:
		{
			polyObj=(Human) topolyObj;
			if(polyObj instanceof User)
			{
				 Type="User";
				 users.clear();
			}
			else if(polyObj instanceof Manager)
			{
				Type="Manager";
				managers.clear();
			}
			else if(polyObj instanceof Employee)
			{
				Type="Employee";
				employees.clear();
			}
			break;
		}
		case 4:
		{	Type="Trips";
			trips.clear();
			polyObj=(Trips) topolyObj;
			break;
		}
		}		
		LoadInfo2(polyObj,Type,ClassNo);
		
		
	}
	protected final  void LoadInfo2(Object polyObj,String Type,int ClassNo)
	{
		try
		{  
			BufferedReader LoadInfo=null;
			switch(ClassNo)
			{
			case 1:((Cars) polyObj).setTxtFile();
			LoadInfo=new BufferedReader(new FileReader(((Cars) polyObj).getTxtFile()));
			break;
			case 2:((Bookings) polyObj).setTxtFile();
			LoadInfo=new BufferedReader(new FileReader(((Bookings) polyObj).getTxtFile()));
			break;	
			case 3:((Human) polyObj).setTxtFile();
			LoadInfo=new BufferedReader(new FileReader(((Human) polyObj).getTxtFile()));
			break;
			case 4:((Trips) polyObj).setTxtFile();
			LoadInfo=new BufferedReader(new FileReader(((Trips) polyObj).getTxtFile()));
			break;
			}			
			String ObjectsInfo=LoadInfo.readLine();
			while(ObjectsInfo != null)
			{
				String[] ObjectInfo=ObjectsInfo.split(",");
				ConstructLoad(polyObj,ObjectInfo,Type,ClassNo);
				ObjectsInfo=LoadInfo.readLine();
			}
			
			
			
			LoadInfo.close();
			
		}catch(FileNotFoundException e)
		{
			JOptionPane.showMessageDialog(null, "File Doesn't Exist","Existance failure",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		catch(IOException e)
		{
			JOptionPane.showMessageDialog(null, "File Doesn't Exist","Existance failure",JOptionPane.ERROR_MESSAGE);
			System.exit(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	protected final  void ConstructLoad(Object topolyObj,String[] stringArray,String Type,int ClassNo)
	{
		Object polyObj=null;
		if(ClassNo==1)
		{
			switch(Type)
			{
			case "Bus":polyObj=(Bus) topolyObj;
			break;
			case "Limo":polyObj=(Limo) topolyObj;
			break;
			case "MiniBus":polyObj=(MiniBus) topolyObj;
			break;
			case "Motorcylce":polyObj=(Motorcylce) topolyObj;
			break;
			case "Train":polyObj=(Train) topolyObj;
			break;
			case "RegionalTaxi":polyObj=(RegionalTaxi) topolyObj;
			break;
			case "Metro":polyObj=(Metro) topolyObj;
			break;
			case "Cars":polyObj=(Cars)topolyObj;
			break;
			}
		}
		else if(ClassNo==2)
		{
			polyObj=(Bookings)topolyObj;
		}
		else if(ClassNo==3)
		{
			switch(Type)
			{
			case "User":polyObj=(User) topolyObj;
			break;
			case "Manager":polyObj=(Manager) topolyObj;
			break;
			case "Employee":polyObj=(Employee) topolyObj;
			break;
			}
		}
		else if(ClassNo==4)
		{
			polyObj=(Trips)topolyObj;
		}
		
		if(polyObj instanceof Bus)
		{
			buses.add(new Bus(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		else if(polyObj instanceof Limo)
		{
			limos.add(new Limo(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		else if(polyObj instanceof MiniBus)
		{
			minibuses.add(new MiniBus(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		else if(polyObj instanceof Motorcylce)
		{
			motorcycles.add(new Motorcylce(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		if(polyObj instanceof Train)
		{
			trains.add(new Train(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		if(polyObj instanceof RegionalTaxi)
		{
			taxis.add(new RegionalTaxi(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		if(polyObj instanceof Metro)
		{
			metros.add(new Metro(stringArray[0],Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2])));
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		else if(polyObj instanceof Cars)
		{
			cars.add(new Cars(stringArray[0],Integer.parseInt(stringArray[1]),Integer.parseInt(stringArray[2]),Integer.parseInt(stringArray[3]),Boolean.parseBoolean(stringArray[4])
					,stringArray[5],stringArray[6],stringArray[7],stringArray[8],stringArray[9]));
		}
		else if(polyObj instanceof Bookings)
		{
			bookings.add(new Bookings(stringArray[0],stringArray[1],stringArray[2],stringArray[3],stringArray[4],
					   stringArray[5],stringArray[6],stringArray[7],Double.parseDouble(stringArray[8]),
							   Integer.parseInt(stringArray[9]),stringArray[10],stringArray[11],
					   Integer.parseInt(stringArray[12]), Integer.parseInt(stringArray[13])));
		}
		else if(polyObj instanceof User)
		{
			users.add(new User(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]),stringArray[3],
					  Integer.parseInt( stringArray[4]),stringArray[5],Integer.parseInt(stringArray[6]),
					   Integer.parseInt(stringArray[7]),stringArray[8]));
		}
		else if(polyObj instanceof Manager)
		{
			managers.add(new Manager(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]),stringArray[3],
					  Double.parseDouble(stringArray[4]),Integer.parseInt(stringArray[5]),stringArray[6],stringArray[7]));
		}
		else if(polyObj instanceof Employee)
		{
			employees.add(new Employee(stringArray[0],stringArray[1],Integer.parseInt(stringArray[2]),stringArray[3],
						stringArray[4],Boolean.parseBoolean(stringArray[5]),stringArray[6],
					   stringArray[7],stringArray[8],stringArray[9],Double.parseDouble(stringArray[10]),
					   Integer.parseInt(stringArray[11]),stringArray[12],stringArray[13],Integer.parseInt(stringArray[14]),stringArray[15]));
		}
		else if(polyObj instanceof Trips)
		{
			trips.add(new Trips(stringArray[0],stringArray[1],stringArray[2],stringArray[3], stringArray[4],Double.parseDouble(stringArray[5]),stringArray[6]));
		}

	}
	
	protected final  void ConstructWrite(Object topolyObj,String[] stringArray,String Type,int ClassNo)
	{
		Object polyObj=null;
		if(ClassNo==1)
		{
			switch(Type)
			{
			case "Bus":polyObj=(Bus) topolyObj;
			break;
			case "Limo":polyObj=(Limo) topolyObj;
			break;
			case "MiniBus":polyObj=(MiniBus) topolyObj;
			break;
			case "Motorcylce":polyObj=(Motorcylce) topolyObj;
			break;
			case "Train":polyObj=(Train) topolyObj;
			break;
			case "RegionalTaxi":polyObj=(RegionalTaxi) topolyObj;
			break;
			case "Metro":polyObj=(Metro) topolyObj;
			break;
			case "Cars":polyObj=(Cars)topolyObj;
			break;
			}
		}
		else if(ClassNo==2)
		{
			polyObj=(Bookings)topolyObj;
		}
		else if(ClassNo==3)
		{
			switch(Type)
			{
			case "User":polyObj=(User) topolyObj;
			break;
			case "Manager":polyObj=(Manager) topolyObj;
			break;
			case "Employee":polyObj=(Employee) topolyObj;
			break;
			}
		}
		else if(ClassNo==4)
		{
			polyObj=(Trips)topolyObj;
		}
		
		if(polyObj instanceof Bus)
		{
			buses.add(new Bus(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		else if(polyObj instanceof Limo)
		{
			limos.add(new Limo(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		else if(polyObj instanceof MiniBus)
		{
			minibuses.add(new MiniBus(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		else if(polyObj instanceof Motorcylce)
		{
			motorcycles.add(new Motorcylce(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		if(polyObj instanceof Train)
		{
			trains.add(new Train(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		if(polyObj instanceof RegionalTaxi)
		{
			taxis.add(new RegionalTaxi(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		if(polyObj instanceof Metro)
		{
			metros.add(new Metro(stringArray[0],Integer.parseInt(stringArray[1])));
		}
		else if(polyObj instanceof Bookings)
		{
			bookings.add(new Bookings(stringArray[0],stringArray[1],stringArray[2],stringArray[3],
					   stringArray[4],stringArray[5],stringArray[6],
					   stringArray[7],Double.parseDouble(stringArray[8]),stringArray[9],stringArray[10],
					   Integer.parseInt(stringArray[11])));
		}
		else if(polyObj instanceof User)
		{
			users.add(new User(stringArray[0],stringArray[1],stringArray[2],Integer.parseInt(stringArray[3]),stringArray[4]));
		}
		else if(polyObj instanceof Manager)
		{
			managers.add(new Manager(stringArray[0],stringArray[1],stringArray[2],Integer.parseInt(stringArray[3]),stringArray[4]));
					  
		}
		else if(polyObj instanceof Employee)
		{
			employees.add(new Employee(stringArray[0],stringArray[1],stringArray[2],Integer.parseInt(stringArray[3]),stringArray[4]));
		}
		else if(polyObj instanceof Trips)
		{
			trips.add(new Trips(stringArray[0],stringArray[1],stringArray[2],stringArray[3], stringArray[4],Double.parseDouble(stringArray[5]),stringArray[6]));
		}

	}
	
	

	protected final  PrintWriter CreatePrintWriterinTryCatch(File file)
	{
		try
		{
		PrintWriter OutPut=new PrintWriter(new BufferedWriter(new FileWriter(file)));
		
		return OutPut;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	protected final static PrintWriter CreatePrintWriterinTryCatchforAppending(File file)
	{
		try
		{
		PrintWriter OutPut=new PrintWriter(new BufferedWriter(new FileWriter(file,true)));
		
		return OutPut;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return null;
		
	}
	protected final  void WriteInfo2(Object topolyObj,String Type,int ClassNo,PrintWriter OutPut)
	{
		Object polyObj=null;
		if(ClassNo==1)
		{
			switch(Type)
			{
			case "Bus":polyObj=(Bus) topolyObj;
			break;
			case "Limo":polyObj=(Limo) topolyObj;
			break;
			case "MiniBus":polyObj=(MiniBus) topolyObj;
			break;
			case "Motorcylce":polyObj=(Motorcylce) topolyObj;
			break;
			case "Train":polyObj=(Train) topolyObj;
			break;
			case "RegionalTaxi":polyObj=(RegionalTaxi) topolyObj;
			break;
			case "Metro":polyObj=(Metro) topolyObj;
			break;
			case "Cars":polyObj=(Cars)topolyObj;
			break;
			}
		}
		else if(ClassNo==2)
		{
			polyObj=(Bookings)topolyObj;
		}
		else if(ClassNo==3)
		{
			switch(Type)
			{
			case "User":polyObj=(User) topolyObj;
			break;
			case "Manager":polyObj=(Manager) topolyObj;
			break;
			case "Employee":polyObj=(Employee) topolyObj;
			break;
			}
		}
		else if(ClassNo==4)
		{
			polyObj=(Trips)topolyObj;
		}
		if(polyObj instanceof Bus)
		{
				String InfoTobeWritten=buses.get(buses.size()-1).getCompCarID()+","+ buses.get(buses.size()-1).getNoOfSeats() 
				+","+ buses.get(buses.size()-1).getAvailNoOfSeats()+","+Integer.toString(buses.get(buses.size()-1).getDriverID())+","+Boolean.toString(buses.get(buses.size()-1).getAvailable())+","+buses.get(buses.size()-1).getDepartedTime()
				+","+buses.get(buses.size()-1).getAvailableTime()+","+buses.get(buses.size()-1).getCurrDest()+","+buses.get(buses.size()-1).getSource()
				+","+buses.get(buses.size()-1).getComfortability();
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		
		}
		else if(polyObj instanceof Limo)
		{
			String InfoTobeWritten=limos.get(limos.size()-1).getCompCarID()+","+ limos.get(limos.size()-1).getNoOfSeats() 
					+","+ limos.get(limos.size()-1).getAvailNoOfSeats()+","+Integer.toString(limos.get(limos.size()-1).getDriverID())+","+Boolean.toString(limos.get(limos.size()-1).getAvailable())+","+limos.get(limos.size()-1).getDepartedTime()
					+","+limos.get(limos.size()-1).getAvailableTime()+","+limos.get(limos.size()-1).getCurrDest()+","+limos.get(limos.size()-1).getSource()
					+","+limos.get(limos.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		}
		else if(polyObj instanceof MiniBus)
		{
			String InfoTobeWritten=minibuses.get(minibuses.size()-1).getCompCarID()+","+ minibuses.get(minibuses.size()-1).getNoOfSeats() 
					+","+ minibuses.get(minibuses.size()-1).getAvailNoOfSeats()+","+Integer.toString(minibuses.get(minibuses.size()-1).getDriverID())+","+Boolean.toString(minibuses.get(minibuses.size()-1).getAvailable())+","+minibuses.get(minibuses.size()-1).getDepartedTime()
					+","+minibuses.get(minibuses.size()-1).getAvailableTime()+","+minibuses.get(minibuses.size()-1).getCurrDest()+","+minibuses.get(minibuses.size()-1).getSource()
					+","+minibuses.get(minibuses.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		}
		else if(polyObj instanceof Motorcylce)
		{
			String InfoTobeWritten=motorcycles.get(motorcycles.size()-1).getCompCarID()+","+ motorcycles.get(motorcycles.size()-1).getNoOfSeats() 
					+","+ motorcycles.get(motorcycles.size()-1).getAvailNoOfSeats()+","+Integer.toString(motorcycles.get(motorcycles.size()-1).getDriverID())+","+Boolean.toString(motorcycles.get(motorcycles.size()-1).getAvailable())+","+motorcycles.get(motorcycles.size()-1).getDepartedTime()
					+","+motorcycles.get(motorcycles.size()-1).getAvailableTime()+","+motorcycles.get(motorcycles.size()-1).getCurrDest()+","+motorcycles.get(motorcycles.size()-1).getSource()
					+","+motorcycles.get(motorcycles.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		}
		else if(polyObj instanceof Train)
		{
			String InfoTobeWritten=trains.get(trains.size()-1).getCompCarID()+","+ trains.get(trains.size()-1).getNoOfSeats() 
					+","+ trains.get(trains.size()-1).getAvailNoOfSeats()+","+Integer.toString(trains.get(trains.size()-1).getDriverID())+","+Boolean.toString(trains.get(trains.size()-1).getAvailable())+","+trains.get(trains.size()-1).getDepartedTime()
					+","+trains.get(trains.size()-1).getAvailableTime()+","+trains.get(trains.size()-1).getCurrDest()+","+trains.get(trains.size()-1).getSource()
					+","+trains.get(trains.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		
		}
		else if(polyObj instanceof RegionalTaxi)
		{
			String InfoTobeWritten=taxis.get(taxis.size()-1).getCompCarID()+","+ taxis.get(taxis.size()-1).getNoOfSeats() 
					+","+ taxis.get(taxis.size()-1).getAvailNoOfSeats()+","+Integer.toString(taxis.get(taxis.size()-1).getDriverID())+","+Boolean.toString(taxis.get(taxis.size()-1).getAvailable())+","+taxis.get(taxis.size()-1).getDepartedTime()
					+","+taxis.get(taxis.size()-1).getAvailableTime()+","+taxis.get(taxis.size()-1).getCurrDest()+","+taxis.get(taxis.size()-1).getSource()
					+","+taxis.get(taxis.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		
		}
		else if(polyObj instanceof Metro)
		{
			String InfoTobeWritten=metros.get(metros.size()-1).getCompCarID()+","+ metros.get(metros.size()-1).getNoOfSeats() 
					+","+ metros.get(metros.size()-1).getAvailNoOfSeats()+","+Integer.toString(metros.get(metros.size()-1).getDriverID())+","+Boolean.toString(metros.get(metros.size()-1).getAvailable())+","+metros.get(metros.size()-1).getDepartedTime()
					+","+metros.get(metros.size()-1).getAvailableTime()+","+metros.get(metros.size()-1).getCurrDest()+","+metros.get(metros.size()-1).getSource()
					+","+metros.get(metros.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		
		}
		else if(polyObj instanceof Cars)
		{
			String InfoTobeWritten=cars.get(cars.size()-1).getCompCarID()+","+ cars.get(cars.size()-1).getNoOfSeats() 
					+","+ cars.get(cars.size()-1).getAvailNoOfSeats()+","+Integer.toString(cars.get(cars.size()-1).getDriverID())+","+Boolean.toString(cars.get(cars.size()-1).getAvailable())+","+cars.get(cars.size()-1).getDepartedTime()
					+","+cars.get(cars.size()-1).getAvailableTime()+","+cars.get(cars.size()-1).getCurrDest()+","+cars.get(cars.size()-1).getSource()
					+","+cars.get(cars.size()-1).getComfortability();
					OutPut.println(InfoTobeWritten);
				OutPut.close();
		}
		else if(polyObj instanceof Bookings)
		{
				String InfoTobeWritten=bookings.get(bookings.size()-1).getSource()+","+bookings.get(bookings.size()-1).getTripDest()+","+ bookings.get(bookings.size()-1).getTripType() +","+ bookings.get(bookings.size()-1).getTripDate()+","+bookings.get(bookings.size()-1).getReturnDate()+","+bookings.get(bookings.size()-1).getCarType()
				+","+bookings.get(bookings.size()-1).getCarStops()+","+bookings.get(bookings.size()-1).getCarID()+","+Double.toString(bookings.get(bookings.size()-1).getPrice())+","
				+Integer.toString(bookings.get(bookings.size()-1).getSeats())+","+bookings.get(bookings.size()-1).getUserFirstName()+","+bookings.get(bookings.size()-1).getUserLastName()+","
				+Integer.toString(bookings.get(bookings.size()-1).getBookingID())+","+Integer.toString(bookings.get(bookings.size()-1).getUserID());
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		}
		else if(polyObj instanceof User)
		{
				String InfoTobeWritten=users.get(users.size()-1).getFirstName()+","+ users.get(users.size()-1).getLastName() 
				+","+ users.get(users.size()-1).getHumanID()+","+users.get(users.size()-1).getPhoneNumber()+","+Integer.toString(users.get(users.size()-1).getAge())+","+users.get(users.size()-1).getState()
				+","+users.get(users.size()-1).getTripsCounter()+","+users.get(users.size()-1).getTripsIN()+","+users.get(users.size()-1).getPassword();
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		}
		else if(polyObj instanceof Manager)
		{
				String InfoTobeWritten=managers.get(managers.size()-1).getFirstName()+","+ managers.get(managers.size()-1).getLastName() 
				+","+ managers.get(managers.size()-1).getHumanID()+","+managers.get(managers.size()-1).getPhoneNumber()+","+Double.toString(managers.get(managers.size()-1).getSalary())+","+Integer.toString(managers.get(managers.size()-1).getAge())
				+","+managers.get(managers.size()-1).getState()+","+managers.get(managers.size()-1).getPassword();
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		}
		else if(polyObj instanceof Employee)
		{
				String InfoTobeWritten=employees.get(employees.size()-1).getFirstName()+","+ employees.get(employees.size()-1).getLastName() 
				+","+ employees.get(employees.size()-1).getHumanID()+","+employees.get(employees.size()-1).getPhoneNumber()+","+employees.get(employees.size()-1).getStartDate()+","+employees.get(employees.size()-1).getAvailable()+","
				+employees.get(employees.size()-1).getCarDrivingID()+","+employees.get(employees.size()-1).getCurrDest()+","+employees.get(employees.size()-1).getDepartedTime()+","+employees.get(employees.size()-1).getAvailTime()+","
				+Double.toString(employees.get(employees.size()-1).getSalary())+","+Integer.toString(employees.get(employees.size()-1).getAge())+","+employees.get(employees.size()-1).getProfessionality()+","
				+employees.get(employees.size()-1).getState()+","+Integer.toString(employees.get(employees.size()-1).getTripsMade())+","+employees.get(employees.size()-1).getPassword();
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		}
		else if(polyObj instanceof Trips)
		{
				String InfoTobeWritten=trips.get(trips.size()-1).getSource()+","+ trips.get(trips.size()-1).getDestination()
				+","+ trips.get(trips.size()-1).getDepartDate()+","+trips.get(trips.size()-1).getReturnDate()+","+trips.get(trips.size()-1).getType()+","+Double.toString(trips.get(trips.size()-1).getPrice())+","+trips.get(trips.size()-1).getCarID();
				OutPut.println(InfoTobeWritten);
			OutPut.close();
		}
	}
	protected final  void WriteInfo(Object topolyObj,String[] info,int ClassNo)
	{
		String Type=null;
		Object polyObj=null;
		if(topolyObj instanceof Bus)
		{
			 Type="Bus";
			 polyObj=(Bus) topolyObj;
		}
		else if(topolyObj instanceof Limo)
		{
			Type="Limo";
			polyObj=(Limo) topolyObj;
		}
		else if(topolyObj instanceof MiniBus)
		{
			System.out.println("ent");
			Type="MiniBus";
			polyObj=(MiniBus) topolyObj;
		}
		else if(topolyObj instanceof Motorcylce)
		{
			Type="Motorcylce";
			polyObj=(Motorcylce) topolyObj;
		}
		else if(topolyObj instanceof Train)
		{
			 Type="Train";
			 polyObj=(Train) topolyObj;
		}
		else if(topolyObj instanceof RegionalTaxi)
		{
			 Type="RegionalTaxi";
			 polyObj=(RegionalTaxi) topolyObj;
		}
		else if(topolyObj instanceof Metro)
		{
			 Type="Metro";
			 polyObj=(Metro) topolyObj;
		}
		else if(topolyObj instanceof Cars)
		{
			Type="Cars";
			polyObj=(Cars) topolyObj;
		}
		else if(topolyObj instanceof Bookings)
		{
			Type="Bookings";
			polyObj=(Bookings) topolyObj;
		}
		else if(topolyObj instanceof User)
		{
			Type="User";
			polyObj=(User) topolyObj;
		}
		else if(topolyObj instanceof Manager)
		{
			Type="Manager";
			polyObj=(Manager) topolyObj;
		}
		else if(topolyObj instanceof Employee)
		{
			Type="Employee";
			polyObj=(Employee) topolyObj;
		}
		else if(topolyObj instanceof Trips)
		{
			Type="Trips";
			polyObj=(Trips)topolyObj;
		}
		PrintWriter OutPut=null;
		switch(ClassNo)
		{
		case 1:
			
			((Cars) polyObj).setTxtFile();
			OutPut=CreatePrintWriterinTryCatchforAppending(((Cars) polyObj).getTxtFile());
			ConstructWrite(polyObj,info,Type,1);
			WriteInfo2((Cars)polyObj,Type,ClassNo,OutPut);
			break;
			
			case 2:	
			
			((Bookings) polyObj).setTxtFile();
			OutPut=CreatePrintWriterinTryCatchforAppending(((Bookings) polyObj).getTxtFile());
			ConstructWrite(polyObj,info,Type,2);
			WriteInfo2((Bookings)polyObj,Type,ClassNo,OutPut);
			break;
			
			case 3:	
				
				((Human) polyObj).setTxtFile();
				OutPut=CreatePrintWriterinTryCatchforAppending(((Human) polyObj).getTxtFile());
				ConstructWrite(polyObj,info,Type,3);
				WriteInfo2((Human)polyObj,Type,ClassNo,OutPut);
				break;
				
			case 4:
				((Trips) polyObj).setTxtFile();
				OutPut=CreatePrintWriterinTryCatchforAppending(((Trips) polyObj).getTxtFile());
				ConstructWrite(polyObj,info,Type,4);
				WriteInfo2((Trips)polyObj,Type,ClassNo,OutPut);
				break;
			}
		
	
	}
	
	protected final  void DeleteFromObject(Object topolyObj,String Searchtarget,int ClassNo)
	{
		Object polyObj=null;
		String Type = null;
		if(ClassNo==1)
		{
			polyObj=(Cars) topolyObj;
			if(polyObj instanceof Bus)
			{
				boolean found=false;
				for(int i=0;i<buses.size();i++)
				{
					if(buses.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						buses.remove(i);
						buses.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Bus) polyObj).getTxtFile());
						for(Bus iterate: buses)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						buses.trimToSize();
						OutPut.close();
						LoadInfo(bus,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Limo)
			{
				boolean found=false;
				for(int i=0;i<limos.size();i++)
				{
					if(limos.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						limos.remove(i);
						limos.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Limo) polyObj).getTxtFile());
						for(Limo iterate: limos)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						limos.trimToSize();
						OutPut.close();
						LoadInfo(limo,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof MiniBus)
			{
				boolean found=false;
				for(int i=0;i<minibuses.size();i++)
				{
					if(minibuses.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						minibuses.remove(i);
						minibuses.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((MiniBus) polyObj).getTxtFile());
						for(MiniBus iterate: minibuses)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						minibuses.trimToSize();
						OutPut.close();
						LoadInfo(minibus,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Motorcylce)
			{
				boolean found=false;
				for(int i=0;i<motorcycles.size();i++)
				{
					if(motorcycles.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						motorcycles.remove(i);
						motorcycles.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Motorcylce) polyObj).getTxtFile());
						for(Motorcylce iterate: motorcycles)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						motorcycles.trimToSize();
						OutPut.close();
						LoadInfo(motor,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Train)
			{
				boolean found=false;
				for(int i=0;i<trains.size();i++)
				{
					if(trains.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						trains.remove(i);
						trains.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Train) polyObj).getTxtFile());
						for(Train iterate: trains)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(train,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof RegionalTaxi)
			{
				boolean found=false;
				for(int i=0;i<taxis.size();i++)
				{
					if(taxis.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						taxis.remove(i);
						taxis.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((RegionalTaxi) polyObj).getTxtFile());
						for(RegionalTaxi iterate: taxis)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(taxi,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Metro)
			{
				boolean found=false;
				for(int i=0;i<metros.size();i++)
				{
					if(metros.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						metros.remove(i);
						metros.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Metro) polyObj).getTxtFile());
						for(Metro iterate: metros)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						trains.trimToSize();
						OutPut.close();
						LoadInfo(metro,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Cars)
			{
				boolean found=false;
				for(int i=0;i<cars.size();i++)
				{
					if(cars.get(i).getCompCarID().equalsIgnoreCase(Searchtarget))
					{
						cars.remove(i);
						cars.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Cars) polyObj).getTxtFile());
						for(Cars iterate: cars)
						{
							String InfoTobeWritten=iterate.getCompCarID()+","+ iterate.getNoOfSeats() 
							+","+ iterate.getAvailNoOfSeats()+","+Integer.toString(iterate.getDriverID())+","+Boolean.toString(iterate.getAvailable())+","+iterate.getDepartedTime()
							+","+iterate.getAvailableTime()+","+iterate.getCurrDest()+","+iterate.getSource()
							+","+iterate.getComfortability();
							OutPut.println(InfoTobeWritten);
						}
						cars.trimToSize();
						LoadInfo(car,1);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
		else if(ClassNo==2)
		{
			polyObj=(Bookings) topolyObj;
			boolean found=false;
			for(int i=0;i<bookings.size();i++)
			{
				if(bookings.get(i).getBookingID()==Integer.parseInt(Searchtarget))
				{
					bookings.remove(i);
					bookings.trimToSize();
					PrintWriter OutPut=CreatePrintWriterinTryCatch(((Bookings) polyObj).getTxtFile());
					for(Bookings iterate: bookings)
					{
						System.out.println("dm");
						String InfoTobeWritten=iterate.getSource()+","+iterate.getTripDest()+","+iterate.getTripType() +","+ iterate.getTripDate()+","+iterate.getReturnDate()+","
						+iterate.getCarType()
						+","+iterate.getCarStops()+","+iterate.getCarID()+","+Double.toString(iterate.getPrice())+","
						+Integer.toString(iterate.getSeats())+","+iterate.getUserFirstName()+","+iterate.getUserLastName()+","
						+Integer.toString(iterate.getBookingID())+","+Integer.toString(iterate.getUserID());
						OutPut.println(InfoTobeWritten);
					}
					bookings.trimToSize();
					OutPut.close();
					LoadInfo(book,2);
					found=true;
				}
			}
			if(found=false)
			{
				JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(ClassNo==3)
		{
			polyObj=(Human) topolyObj;
			if(polyObj instanceof User)
			{
				boolean found=false;
				for(int i=0;i<users.size();i++)
				{
					if(users.get(i).getHumanID() == Integer.parseInt(Searchtarget))
					{
						users.remove(i);
						users.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((User) polyObj).getTxtFile());
						for(User iterate: users)
						{
							String InfoTobeWritten=iterate.getFirstName()+","+ iterate.getLastName() 
							+","+ iterate.getHumanID()+","+iterate.getPhoneNumber()+","+Integer.toString(iterate.getAge())+","+iterate.getState()
							+","+iterate.getTripsCounter()+","+iterate.getTripsIN()+","+iterate.getPassword();
							OutPut.println(InfoTobeWritten);
						}
						users.trimToSize();
						OutPut.close();
						LoadInfo(user,3);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Manager)
			{
				boolean found=false;
				for(int i=0;i<managers.size();i++)
				{
					if(managers.get(i).getHumanID()==Integer.parseInt(Searchtarget))
					{
						managers.remove(i);
						managers.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Manager) polyObj).getTxtFile());
						for(Manager iterate: managers)
						{
							String InfoTobeWritten=iterate.getFirstName()+","+ iterate.getLastName() 
							+","+ iterate.getHumanID()+","+iterate.getPhoneNumber()+","+Double.toString(iterate.getSalary())+","+Integer.toString(iterate.getAge())
							+","+iterate.getState()+","+iterate.getPassword();
							OutPut.println(InfoTobeWritten);
						}
						managers.trimToSize();
						OutPut.close();
						LoadInfo(manager,3);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
			else if(polyObj instanceof Employee)
			{
				boolean found=false;
				for(int i=0;i<employees.size();i++)
				{
					if(employees.get(i).getHumanID()==Integer.parseInt(Searchtarget))
					{
						employees.remove(i);
						employees.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Employee) polyObj).getTxtFile());
						for(Employee iterate: employees)
						{
							String InfoTobeWritten=iterate.getFirstName()+","+ iterate.getLastName() 
							+","+ iterate.getHumanID()+","+iterate.getPhoneNumber()+","+iterate.getStartDate()+","+iterate.getAvailable()+","
							+iterate.getCarDrivingID()+","+iterate.getCurrDest()+","+iterate.getDepartedTime()+","+iterate.getAvailTime()+","
							+Double.toString(iterate.getSalary())+","+Integer.toString(iterate.getAge())+","+iterate.getProfessionality()+","
							+iterate.getState()+","+Integer.toString(iterate.getTripsMade())+","+iterate.getPassword();
							System.out.println(InfoTobeWritten);
							OutPut.println(InfoTobeWritten);
						}
						employees.trimToSize();
						OutPut.close();
						LoadInfo(employee,3);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
			else if(ClassNo==4)
			{
				polyObj=(Trips) topolyObj;
				boolean found=false;
				trips.trimToSize();
				for(int i=0;i<trips.size();i++)
				{
					if(trips.get(i).getReturnDate().equals(Searchtarget))
					{
						trips.remove(i);
						trips.trimToSize();
						PrintWriter OutPut=CreatePrintWriterinTryCatch(((Trips) polyObj).getTxtFile());
						for(Trips iterate: trips)
						{
							System.out.println("0");
							String InfoTobeWritten=iterate.getSource()+","+ iterate.getDestination() 
							+","+ iterate.getDepartDate()+","+iterate.getReturnDate()+","+iterate.getType()+","+iterate.getPrice()+","+iterate.getCarID();
							OutPut.println(InfoTobeWritten);
						}
						trips.trimToSize();
						OutPut.close();
						LoadInfo(trip,4);
						found=true;
					}
				}
				if(found=false)
				{
					JOptionPane.showMessageDialog(null, "Invalid Booking ID","Invalid Input",JOptionPane.ERROR_MESSAGE);
				}
			}
		}
	}



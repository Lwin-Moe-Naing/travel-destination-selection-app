package C209L01S2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import C09L01S1.Helper;

public class WhereToGo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Country>countryList=new ArrayList<Country>();
countryList.add(new Country("Thailand",26.30,"Food,message,Shopping"));
countryList.add(new Country("Singapore",26.45,"Food,shopping"));
countryList.add(new Country("France",10.70,"Sking, Sight Seeing"));
countryList.add(new Country("Iceland",1.75,"Hot Spring ,Aurora"));
countryList.add(new Country("Japan",11.15,"Food,Mount Fuji"));
	int option=0;
	while (option!=4) {
		menu();
		option=Helper.readInt("Enter an option>");
		if(option==1) {
			countriesByTemp(countryList,1);
		}
		else if(option==2) {
			countriesByTemp(countryList,2);
		}
		else if(option==3) {
			searchString(countryList);
		}
		else if(option==4) {
			System.out.println("Good bye");
		}
		else {
			System.out.println("Invalid.");
		}
	}
	}
	public static void menu() {
		LocalDate currentDate=LocalDate.now();
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("EEEE dd MMMM yyyy");
		String dateFromLocalDate=currentDate.format(formatter);
		
		Helper.line(30,"-");
		System.out.println(dateFromLocalDate);
		System.out.println("WHERE TO GO?");
		Helper.line(30, "-");
		System.out.println("1.Warmer countries");
		System.out.println("2.Cooler countries");
		System.out.println("3.Search for recommendations by activities");
		System.out.println("4.Quit");}

	
	public static void countriesByTemp(ArrayList<Country> countryList,int choice) {
		String output="";
		
		Helper.line(40, "-");
		System.out.println("Countries");
		Helper.line(40, "-");
		
		for(int i=0;i<countryList.size();i++) {
			if(choice==1 && countryList.get(i).averageYearTempC>25.0) {
			output +=countryList.get(i).name+"\n";
			}
			else if(choice==2 && countryList.get(i).averageYearTempC<=25.0) {
				output+=countryList.get(i).name+"\n";
			}
			}
		System.out.println(output);
	}
	public static void searchString(ArrayList<Country>CountryList) {
		String str=Helper.readString("Enter a search term>");
		String output="Countries related to your search term:\n ";
		
		
		
		for(int i=0;i<CountryList.size();i++) {
			String activities=CountryList.get(i).thingsToDo.toUpperCase();
			str=str.toUpperCase();
			if(activities.contains(str)) {
				output+=CountryList.get(i).name+"\n";
			}
		}
		System.out.println(output);
	}
}

package C209L01S2;

public class Country {
String name;
double averageYearTempC;
String thingsToDo;
public Country(String name, double averageYearTempC, String thingsToDo) {
	super();
	this.name = name;
	this.averageYearTempC = averageYearTempC;
	this.thingsToDo = thingsToDo;
}
public void display() {
	System.out.println("Name="+name);
	System.out.println("Average Year Temperature="+averageYearTempC);
	System.out.println("Things to do+"+thingsToDo);
}
}

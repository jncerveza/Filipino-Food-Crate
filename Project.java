import java.util.*;

public class Project {
    public static void main (String[]args){
        Scanner sc= new Scanner (System.in);

double baggage, processfee ;
double fare= 0;
double tax= 0;


System.out.println("Hello and welcome to UMAK Airline");
System.out.println("");
System.out.println("");
System.out.println("Airline Type    Maximum Capacity");
System.out.println("--------------------------------");
System.out.println("  Private              14");
System.out.println("--------------------------------");
System.out.println("  Business             23");
System.out.println("--------------------------------");
System.out.println("  Regular fare         88");
System.out.println(" (40 seats might be reserved or"); 
System.out.println("    taken in this airline)");
System.out.println("");

System.out.print("What type of airline is your choice?  ");
String airline=sc.nextLine();


System.out.println("");
System.out.println("Age     Category    PASSENGER AGE RESTRICTION");
System.out.println("---------------------------------------------");
System.out.println("Below     Child      Cannot travel alone and"); 
System.out.println("19                   must be accompanied by at");
System.out.println("                     least one  (1) Adult and/");
System.out.println("                     or Senior Citizen");
System.out.println("---------------------------------------------");
System.out.println("19 - 59   Adult      Regular Computation applies");
System.out.println("---------------------------------------------");
System.out.println("Above 59  Senior     Tax Exempted and ");
System.out.println("          Citizen     will get Total   ");
System.out.println("                     Travel Destination");
System.out.println("                      computation only ");
System.out.println("                      and 20% discount"); 

System.out.println("");
System.out.println("");

System.out.print("How many individuals will be riding?  ");
int passengers=Integer.parseInt(sc.nextLine());

String name[]=new String[passengers];
int age[]=new int[passengers];



System.out.println("");

System.out.println("Please write down their name and age (Including yours)");
System.out.println("");


for(int a=0; a<passengers; a++){

System.out.println("Individual " + (a + 1));
System.out.println("");
System.out.println("Name: ");
name[a]=sc.nextLine();

System.out.println("Age: ");
age[a]=Integer.parseInt (sc.nextLine());
System.out.println("");
}

System.out.println("");
System.out.println("");

System.out.println("Please pick the type of flight");
System.out.println("=Local Flight       =International Flight");
System.out.print("= ");
String typef = sc.nextLine();

System.out.println("");

if (airline.equals ("Private")){
    if (typef.equals ("Local Flight")){
        System.out.println("Option      FROM        TO      Private Class Fare");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("A          Manila    Batanes       8,000.00");
        System.out.println("--------------------------------------------------");
        System.out.println("B          Batanes   Manila        9,800.00");
        System.out.println("--------------------------------------------------");
        System.out.println("C          Manila    Palawan       9,100.00");
        System.out.println("--------------------------------------------------");
        System.out.println("D          Palawan   Manila        9,850.00");
    }
    else if(typef.equals ("International Flight")){
        System.out.println("Option      FROM        TO      Private Class Fare");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("E          Manila    South Korea    27,450.00");
        System.out.println("--------------------------------------------------");
        System.out.println("F          South Korea    Manila    30,890.00");
        System.out.println("--------------------------------------------------");
        System.out.println("G          Manila      Japan        40,450.00");
        System.out.println("--------------------------------------------------");
        System.out.println("H          Japan       Manila       43,855.00");
        System.out.println("--------------------------------------------------");
        System.out.println("I          Manila      Vietnam      8,505.00");
        System.out.println("--------------------------------------------------");
        System.out.println("J          Vietnam      Manila      14,300.00");
        
    }
    else{
        System.out.println("Invalid Input");
    }
}
else if(airline.equals("Business")){
    if (typef.equals ("Local Flight")){
        System.out.println("Option      FROM        TO      Business Class Fare ");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("A          Manila    Batanes       12,500.00");
        System.out.println("--------------------------------------------------");
        System.out.println("B          Batanes   Manila        12,950.00");
        System.out.println("--------------------------------------------------");
        System.out.println("C          Manila    Palawan       10,500.00");
        System.out.println("--------------------------------------------------");
        System.out.println("D          Palawan   Manila        10,975.00");
}
    else if(typef.equals ("International Flight")){
        System.out.println("Option      FROM        TO      Business Class Fare");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("E          Manila    South Korea    37,390.00");
        System.out.println("--------------------------------------------------");
        System.out.println("F          South Korea    Manila    39,650.00");
        System.out.println("--------------------------------------------------");
        System.out.println("G          Manila      Japan        45,355.00");
        System.out.println("--------------------------------------------------");
        System.out.println("H          Japan       Manila       49,780.00");
        System.out.println("--------------------------------------------------");
        System.out.println("I          Manila      Vietnam      12,345.00");
        System.out.println("--------------------------------------------------");
        System.out.println("J          Vietnam      Manila      16,320.00");
}
    else{
        System.out.println("Invalid Input");
}
}
else if(airline.equals("Regular")){
    if (typef.equals ("Local Flight")){
        System.out.println("Option      FROM        TO      Business Class Fare ");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("A          Manila    Batanes       3,500.00");
        System.out.println("--------------------------------------------------");
        System.out.println("B          Batanes   Manila        3,900.00");
        System.out.println("--------------------------------------------------");
        System.out.println("C          Manila    Palawan       3,200.00");
        System.out.println("--------------------------------------------------");
        System.out.println("D          Palawan   Manila        3,575.00");
}
    else if(typef.equals ("International Flight")){
        System.out.println("Option      FROM        TO      Business Class Fare");
        System.out.println("                                  (per person)");
        System.out.println("--------------------------------------------------");
        System.out.println("E          Manila    South Korea    12,055.00");
        System.out.println("--------------------------------------------------");
        System.out.println("F          South Korea    Manila    13,100.00");
        System.out.println("--------------------------------------------------");
        System.out.println("G          Manila      Japan        27,800.00");
        System.out.println("--------------------------------------------------");
        System.out.println("H          Japan       Manila       29,400.00");
        System.out.println("--------------------------------------------------");
        System.out.println("I          Manila      Vietnam      3,200.00");
        System.out.println("--------------------------------------------------");
        System.out.println("J          Vietnam      Manila      4,600.00");
}
    else{
        System.out.println("Invalid Input");
}
}
else{
    System.out.println("Invalid Input");
}

System.out.print("Please choose your option: ");
String option=sc.nextLine();

System.out.println("");

System.out.println("Would you like to avail a travel insurance?");

if(airline.equals ("Private")){
    System.out.println("Private Class will cost 4,500.00 per person");
}
else if(airline.equals ("Business")){
    System.out.println("Business Class will cost 6,500.00 per person");
}
else if(airline.equals ("Regular")){
    System.out.println("Regular Class will cost 950.00 per person");
}
System.out.println("");
String insurance=sc.nextLine();

if (insurance.equals("Yes") && airline.equals("Private")){
    baggage= 4500.00 * passengers;
    System.out.println("");
    System.out.println("");
}
else if (insurance.equals("Yes") && airline.equals("Regular")){
    baggage= 950.00 * passengers;
    System.out.println("");
    System.out.println("");
}
else if (insurance.equals("Yes") && airline.equals("Business")){
    baggage= 6500.00 * passengers;
    System.out.println("");
    System.out.println("");
}
else{
    baggage= 0;
    System.out.println("");
    System.out.println("");
}
//numbers
//Private
if(airline.equals("Private")&& typef.equals("Local Flight")){
    tax= 4260.00 * passengers;
    System.out.println("The total tax is " + tax);
    if(option.equals("A")){
        fare= 8000.00 * passengers;
        System.out.println("The total Class fare is " + fare);
    }
    else if(option.equals("B")){
        fare= 9800.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("C")){
        fare= 9100.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("B")){
        fare= 9850.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}
else if (airline.equals("Private")&& typef.equals("International Flight")){
    tax= 4260.00 * passengers;
    System.out.println("The total tax is " + tax);
    if(option.equals("E")){
        fare= 27450.00 * passengers;
        System.out.println("The total Class fare is " + fare);
    }
    else if(option.equals("F")){
        fare= 30890.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("G")){
        fare= 40450.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("H")){
        fare= 43855.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("I")){
        fare= 8505.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("J")){
        fare= 14300.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}

//Business
else if(airline.equals("Business")&& typef.equals("Local Flight")){
    tax= 5700.00 * passengers;
    System.out.println("The total tax is " + tax);
    if(option.equals("A")){
        fare= 12500.00 * passengers;
        System.out.println("The total Class fare is " + fare);
    }
        else if(option.equals("B")){
        fare= 12950.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("C")){
        fare= 10500.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("B")){
        fare= 10975.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}
else if (airline.equals("Business")&& typef.equals("International Flight")){
    tax= 5700.00 * passengers;
    System.out.println("The total tax is " + tax);
    
        if(option.equals("E")){
        fare= 37390.00* passengers;
        System.out.println("The total Class fare is " + fare);
    }
        else if(option.equals("F")){
        fare= 39650.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("G")){
        fare= 45355.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("H")){
        fare= 49780.00* passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("I")){
        fare= 12345.00  * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("J")){
        fare= 16320.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}
//Regular
else if(airline.equals("Regular")&& typef.equals("Local Flight")){
    tax= 2500.00 * passengers;
    System.out.println("The total tax is " + tax);
    if(option.equals("A")){
        fare= 3500.00 * passengers;
        System.out.println("The total Class fare is " + fare);
    }
        else if(option.equals("B")){
        fare= 3900.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("C")){
        fare= 3200.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("B")){
        fare= 3575.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}
else if (airline.equals("Regular")&& typef.equals("International Flight")){
    tax= 2500.00 * passengers;
    System.out.println("The total tax is " + tax);
    
        if(option.equals("E")){
        fare= 12055.00 * passengers;
        System.out.println("The total Class fare is " + fare);
    }
        else if(option.equals("F")){
        fare= 13100.0 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("G")){
        fare= 27800.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("H")){
        fare= 29400.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("I")){
        fare= 3200.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
        else if(option.equals("J")){
        fare= 4600.00 * passengers;
        System.out.println("The total Class fare is" + fare);
    }
}

System.out.println("The total passengers that are registered are/is " + passengers);

if(airline.equals("Private") && airline.equals("Business")){
    processfee= 550.00;
    System.out.println("Additional Transaction Processing Fee is" + processfee);
}
else{
    processfee= 255.00;
    System.out.println("Additional Transaction Processing Fee is " + processfee);
}
System.out.println("");

double total= baggage + processfee + fare + tax;


System.out.println("The total fee is " + total);
    }
}

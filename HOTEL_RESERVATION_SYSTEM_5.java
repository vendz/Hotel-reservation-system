import java.util.Scanner;
import java.io.*;

class valid2
{
boolean validate_name(String name)
{
	boolean flag = false;
	for(int i = 0; i<name.length(); i++)
	{
		char ch = name.charAt(i);
		if(Character.isLetter(ch))
		{
		}
		else
		{
			flag=true;
			break;
		}
	}
		return flag;

}
boolean validate_num(String phoneNoToCheck)
{
	double phoneNoEntered = Double.parseDouble(phoneNoToCheck);
	if (phoneNoEntered > 1111111111 && phoneNoEntered < 9999999999.00)
	{
		return true;
	} else
	{
		return false;
	}
}
boolean validate_card(Double cardToCheck)
{
	double cardEntered = cardToCheck;
	if (cardEntered >= 1111111111111111.00 && cardEntered <= 9999999999999999.00)
	{
		return true;
	} else
	{
		return false;
	}
}
}
class HOTEL_RESERVATION_SYSTEM_5
{
public static void main(String args[]) throws IOException
{
Scanner s = new Scanner(System.in);
valid2 ob = new valid2();
String name;
String mb;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a=3;
System.out.println("");
System.out.println("");
System.out.println("  LL       EEEEEE  EEEEEE  LL           A      ");
System.out.println("  LL       E       E       LL          A A     ");
System.out.println("  LL       EEEEEE  EEEEEE  LL         A   A    ");
System.out.println("  LL       E       E       LL        A A A A   ");
System.out.println("  LLLLLLL  EEEEEE  EEEEEE  LLLLLLL  A       A  ");
System.out.println("");
System.out.println("");
System.out.println("  PALACES            HOTELS            RESORTS ");
System.out.println("");
System.out.println("");
System.out.println("We are one of the leading privately-owned domestic hotel brands in India,\n engaged in the business of operating and managing hotels, palaces and resorts, with a focus on\n the luxury segment. We operate 12 luxury hotels, palaces and resorts under The LaLiT brand and \ntwo mid-market segment hotels under The LaLiT Traveller brand across India’s key business and \nleisure travel destinations, offering 2,261 rooms, In addition, we hold the exclusive rights to \noperate and provide management consultancy services to a hotel in London, The LaLiT London, offering 70 rooms.");
System.out.println();
System.out.println();
System.out.println(" Do you want to Book a Room in our Hotel ? \n 1.Yes\n 2.No");
System.out.print(" Enter Your Choice : ");
int choice=Integer.parseInt(br.readLine());
if(choice==1)
{
  System.out.println();
System.out.println(" FILL UP THE REGISTRATION FORM GIVEN BELOW :");
System.out.println(" ^^^^^^^^^^ ******************** ^^^^^^^^^^ ");
for(;true;)
{
System.out.println("What is your name?");
name=br.readLine();
//valid2 ob = new valid2();
boolean ans = ob.validate_name(name);
if(ans==true)
{
  System.out.println("Invalid name");
}
else{
  System.out.println("");
  System.out.println("");
  System.out.println("");
  System.out.println("Hi! " + name + " Welcome to LEELA!!!");
  break;
  }
}
System.out.print(" Mobile Number : ");
String mobNumEnter = s.next();
while(true)
{
	if (ob.validate_num(mobNumEnter) == true)
	{
	 mb = mobNumEnter;
		break;
	} else
	{
		System.out.println("Invalid Number!!!");
		mobNumEnter = s.next();
	}
}
System.out.print(" Check-in Date : ");
String chkin=br.readLine();
System.out.print(" No. of Days you want to stay : ");
int days=Integer.parseInt(br.readLine());
System.out.print(" No. of Children Boarders (Below 18 years of age) : ");
int child=Integer.parseInt(br.readLine());
System.out.print(" No. of Adult Boarders (Above 18 years of age) : ");
int adults=Integer.parseInt(br.readLine());
System.out.print(" No. of Rooms Required : ");
int rooms=Integer.parseInt(br.readLine());
System.out.println(" THANK YOU!!!!");
System.out.println();
System.out.println(" 1. ROOMS");
System.out.println(" 2. ROYAL CLUBS");
System.out.println(" 3. SUITS");
System.out.println(" 4.exit");
System.out.println();
System.out.print(" Please enter your choice: ..............." );
int rm=Integer.parseInt(br.readLine());
if(rm==1)
{
System.out.println(" You have selected ROOMS");
System.out.println("following are the types of rooms......");
System.out.println();
System.out.println();
System.out.println("1. GRANDE DELUXE ROOM \n");
System.out.println("At about 552 sq ft (51 sq mt) these may be the smallest \n rooms in the hotel, but rest assured these are larger than their counterparts \n across the city. Book yourself into one of these rooms to feel the difference and \n enjoy the comforts of life that we have laid out for you.\n\n");



System.out.println("Here is a perfect combination of aesthetic designs, superlative luxury, state-of-the-art \n amenities and a majestic view of the city’s skyline or the gardens of the inner courtyard. \n Undoubtedly, these rooms define immaculate exuberance. Unfurl your life’s best moments here with \n your loved ones or unwind by yourself.\n\n");



System.out.println("Spread across the second to seventh floors of the hotel, these rooms are meant for those who \n like their space well defined. Some of the amenities in the room include complimentary hair dryer, \n iron and ironing board, mineral water bottles and a tea and coffee maker.\n");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n");
System.out.println("2. PREMIERE ROOM \n");

System.out.println("Relive a royal era here. The vibrant colours of the interiors\n add to a regal ambience with the primary aim to make guests feel at home. Enjoy the\n majestic view of ‘Devi’ created by the legendary Satish Gupta, in the lush, gardens of the hotel.\n\n");



System.out.println("Located on the second to seventh floors of the hotel, these 592 sq ft (55 sq mt) rooms \n are spacious and a perfect attempt to recreate the drama of the royal past. Some of the \n amenities in the room include complimentary hair dryer, iron and ironing board, mineral water \n bottles and a tea and coffee maker.\n\n");



System.out.println("We understand your need to retreat to a home away from home, especially after a hectic \n day at work or sightseeing.  We designed these rooms keeping that very fact in mind. Here \n style meets comfort for a memorable stay\n ");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("3. ROYAL PREMIERE ROOM \n");

System.out.println("Bright and well-ventilated to let in sunshine and natural light, these rooms,\n which are located on the seventh floor, offer the most serene views of the green foliage outside.\n\n");



System.out.println("Walk into these sprawling rooms spread across 592 sq ft (55 sq mt) and discover your space to get \n your work done or simply while time away. To add to the feel of uninhibited luxury, our rooms are \n adorned with intricate royal designs all over. Some of the amenities in the room include complimentary \n hair dryer, iron and ironing board, mineral water bottles and a tea and coffee maker.\n\n");



System.out.println("Sumptuously furnished with world class modern-day amenities in the room, stylish marble-finished bathrooms\n with soaking bath tubs and a sweeping view of the luxuriant greens surrounding the hotel ensure a relaxed and\n comfortable stay.\n");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("Enter your choice: ");
int c=s.nextInt();
if(c==1)
{
  long amt=10000*days*rooms+(10000*days*rooms)/2;
  System.out.println();
  System.out.println(" Generating The BILL");
  System.out.println(" Please Wait ...................");
  for(long j=0;j<559999999;j++);
  System.out.println(" DONE");
  System.out.println();
  System.out.println("                             :::: LEELA ::::         ");
  System.out.println();
  System.out.println("           \t\t\t************ BILL ************ ");
  System.out.println();
  System.out.println(" Name : "+name);
  System.out.println(" Mobile Number : "+mb);
  System.out.println(" Check-in Date : "+chkin);
  System.out.println(" Room Package Booked : "+"Super Deluxe Room. ");
  System.out.println(" No. of Days for stay : "+days);
  System.out.println(" No. of Children Boarders to stay : "+child);
  System.out.println(" No. of Adult Boarders to stay : "+adults);
  System.out.println(" Total no. of Boarders to stay : "+(adults+child));
  System.out.println(" No. of Rooms Booked : "+rooms);
  System.out.println(" Gross Amount : "+amt);
  double gst=Math.round(14.5/100.0*amt);
  double srvtax=Math.round(9.0/100.0*amt);
  System.out.println(" Total Taxes : Rs."+(gst+srvtax));
  System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
  System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
  System.out.print(" Enter your choice : ");
  String pymnt=br.readLine();
  System.out.println(); 
  System.out.println(" Thanks for using our services!!! \n Visit Again!!");
  System.out.println();
  System.out.println(" ======================XXXXX=========================");	
}
else if(c==2)
{
  long amt=15000*days*rooms+(15000*days*rooms)/2;
  System.out.println();
  System.out.println(" Generating The BILL");
  System.out.println(" Please Wait ...................");
  for(long j=0;j<559999999;j++);
  System.out.println(" DONE");
  System.out.println();
  System.out.println("                             :::: LEELA ::::         ");
  System.out.println();
  System.out.println("           \t\t\t************ BILL ************ ");
  System.out.println();
  System.out.println(" Name : "+name);
  System.out.println(" Mobile Number : "+mb);
  System.out.println(" Check-in Date : "+chkin);
  System.out.println(" Room Package Booked : "+"Super Deluxe Room. ");
  System.out.println(" No. of Days for stay : "+days);
  System.out.println(" No. of Children Boarders to stay : "+child);
  System.out.println(" No. of Adult Boarders to stay : "+adults);
  System.out.println(" Total no. of Boarders to stay : "+(adults+child));
  System.out.println(" No. of Rooms Booked : "+rooms);
  System.out.println(" Gross Amount : "+amt);
  double gst=Math.round(14.5/100.0*amt);
  double srvtax=Math.round(9.0/100.0*amt);
  System.out.println(" Total Taxes : Rs."+(gst+srvtax));
  System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
  System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
  System.out.print(" Enter your choice : ");
  String pymnt=br.readLine();
  System.out.println(); 
  System.out.println(" Thanks for using our services!!! \n Visit Again!!");
  System.out.println();
  System.out.println(" ======================XXXXX=========================");	
}
else if(c==3)
{
  long amt=20000*days*rooms+(20000*days*rooms)/2;
  System.out.println();
  System.out.println(" Generating The BILL");
  System.out.println(" Please Wait ...................");
  for(long j=0;j<559999999;j++);
  System.out.println(" DONE");
  System.out.println();
  System.out.println("                             :::: LEELA ::::         ");
  System.out.println();
  System.out.println("           \t\t\t************ BILL ************ ");
  System.out.println();
  System.out.println(" Name : "+name);
  System.out.println(" Mobile Number : "+mb);
  System.out.println(" Check-in Date : "+chkin);
  System.out.println(" Room Package Booked : "+"Super Deluxe Room. ");
  System.out.println(" No. of Days for stay : "+days);
  System.out.println(" No. of Children Boarders to stay : "+child);
  System.out.println(" No. of Adult Boarders to stay : "+adults);
  System.out.println(" Total no. of Boarders to stay : "+(adults+child));
  System.out.println(" No. of Rooms Booked : "+rooms);
  System.out.println(" Gross Amount : "+amt);
  double gst=Math.round(14.5/100.0*amt);
  double srvtax=Math.round(9.0/100.0*amt);
  System.out.println(" Total Taxes : Rs."+(gst+srvtax));
  System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
  System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
  System.out.print(" Enter your choice : ");
  String pymnt=br.readLine();
  System.out.println(); 
  System.out.println(" Thanks for using our services!!! \n Visit Again!!");
  System.out.println();
  System.out.println(" ======================XXXXX=========================");	
}
}
else if(rm==2)
{
System.out.println(" You have selected ROYAL CLUBS");
System.out.println();
System.out.println();
System.out.println("1. ROYAL CLUB ROOM");
System.out.println("Arrive at the modern day palace with our complimentary airport transfers\n through the hotel’s limousine service. Stay at our lavishly appointed Royal Club guestrooms \n spanning over 592 sq ft (55 sq mt), these rooms are richly endowed in décor and comfort providing a royal experience that remains incomparable.\n\n");



System.out.println("Maximize the experience with club lounge facilities like exclusive check-in, check-out and 24-hour\n personalized butler services. Packaged with host of unrivalled features and facilities including five\n complimentary food and beverage arrangements throughout the day, high speed internet, use of meeting room \n for two hour once during the stay is an exclusive experience for our patrons. Few other amenities in the room\n including hair dryer, iron and ironing board, mineral water bottles and a tea and coffee maker.\n");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("2. ROYAL CLUB PARLOUR");
System.out.println("Treat yourself to a luxury stay at the Royal Club Parlour, especially designed \n to offer supreme comfort and luxury. These suites exude the charm of Lutyen’s architecture and Indian \n interiors adorning the exclusive art work. The magnificent view overlooking New Delhi adds a distinct \n charm to the grandeur of the 700 sq ft (65 sq mt) suite.\n\n ");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("Enter your choice: ");
int cl=s.nextInt();
if(cl==1)
{
	long amt=30000*days*rooms+(30000*days*rooms)/2;
    System.out.println();
    System.out.println(" Generating The BILL");
    System.out.println(" Please Wait ...................");
    for(long j=0;j<559999999;j++);
    System.out.println(" DONE");
    System.out.println();
    System.out.println("               :::: LEELA :::: ");
    System.out.println();
    System.out.println(" \t\t\t************ BILL ************ "); System.out.println();
    System.out.println(" Name : "+name);
    System.out.println(" Mobile Number : "+mb);
    System.out.println(" Check-in Date : "+chkin);
    System.out.println(" Room Package Booked : "+"Deluxe Room");
    System.out.println(" No. of Days for stay : "+days);
    System.out.println(" No. of Children Boarders to stay : "+child);
    System.out.println(" No. of Adult Boarders to stay : "+adults);
    System.out.println(" Total no. of Boarders to stay : "+(adults+child));
    System.out.println(" No. of Rooms Booked : "+rooms);
    System.out.println(" Gross Amount : "+amt);
    double gst=Math.round(14.5/100.0*amt);
    double srvtax=Math.round(9.0/100.0*amt);
    System.out.println(" Total Taxes : Rs."+(gst+srvtax));
    System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
    System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
    System.out.print(" Enter your choice : ");
    String pymnt=br.readLine();
    System.out.println();
    System.out.println(" Thanks for using our services!!! \n Visit Again!!");
    System.out.println();
    System.out.println(" ======================XXXXX=========================");
}
else if(cl==2)
{
	long amt=35000*days*rooms+(35000*days*rooms)/2;
    System.out.println();
    System.out.println(" Generating The BILL");
    System.out.println(" Please Wait ...................");
    for(long j=0;j<559999999;j++);
    System.out.println(" DONE");
    System.out.println();
    System.out.println("               :::: LEELA :::: ");
    System.out.println();
    System.out.println(" \t\t\t************ BILL ************ "); System.out.println();
    System.out.println(" Name : "+name);
    System.out.println(" Mobile Number : "+mb);
    System.out.println(" Check-in Date : "+chkin);
    System.out.println(" Room Package Booked : "+"Deluxe Room");
    System.out.println(" No. of Days for stay : "+days);
    System.out.println(" No. of Children Boarders to stay : "+child);
    System.out.println(" No. of Adult Boarders to stay : "+adults);
    System.out.println(" Total no. of Boarders to stay : "+(adults+child));
    System.out.println(" No. of Rooms Booked : "+rooms);
    System.out.println(" Gross Amount : "+amt);
    double gst=Math.round(14.5/100.0*amt);
    double srvtax=Math.round(9.0/100.0*amt);
    System.out.println(" Total Taxes : Rs."+(gst+srvtax));
    System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
    System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
    System.out.print(" Enter your choice : ");
    String pymnt=br.readLine();
    System.out.println();
    System.out.println(" Thanks for using our services!!! \n Visit Again!!");
    System.out.println();
    System.out.println(" ======================XXXXX=========================");
}
}
else if(rm==3)
{
System.out.println(" You have selected SUITES.");
System.out.println();
System.out.println();
System.out.println("1. GRANDE SUITE WITH PLUNGE POOL");
System.out.println("Articulating the grand Indian theme of floor-to-ceiling columns \n and regal arches, this 1,090 sq ft (101 sq mt), two-bay suite located on the ninth floor\n of the hotel is a luxury haven waiting to be experienced. An indulgent touch to this suite\n is the open-to-sky private pool with temperature-controlled Jacuzzi. Casual seating around \n the pool gives the space a welcoming air. Step into the water to relax at the end of a long day\n with a refreshing drink and enjoy the views of the city that the large windows offer. Feel the \n stress of the day melt away in this grand and spacious suite.\n\n");

System.out.println("Some of the other amenities in the room include an iron and ironing board, mineral-water \n bottles and a tea and coffee maker.\n");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("2. ROYALE SUITE WITH PLUNGE POOL");
System.out.println("True to its name, this suite is a royal in design and welcoming in all \n its splendid offerings. An inviting view of the gardens adds to the allure of this suite. \n An indulgent touch to this suite is the open-to-sky temperature-controlled, in-room plunge \n pool with Jacuzzi. Casual seating around the pool gives the space a welcoming air. Step into \n the water to relax at the end of a long day with a refreshing drink and enjoy the views of the \n city that the large windows offer.\n\n");



System.out.println("Some of the amenities in the suite include a hair dryer, an iron and ironing board, \n mineral water- bottles and a tea and coffee maker.\n");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("3. PRESIDENTIAL SUITE");
System.out.println("An epitome of uber luxury, spanning over 4,800 sq ft (446 sq mt), the design \n and décor of the suite personifies the palatial grandeur of the royal heritage of India. The opulence\n of gold leaf ceilings, intricate wood work, pure silver and semi-precious stones art pieces, deep toned \n rich tapestry are complimented with the state-of-the-art functionalities and exclusive facilities.");

System.out.println("An eight-bay suite comes with amenities like a complimentary airport transfers in our luxurious BMW fleet, \n 24-hour butler service, Asprey London toiletries, private gymnasium, two separate living rooms with a powder \n room, private study room, private dining room that seats 12 guests, 24-hour in-room dining, fully-functional\n butler’s pantry, a separate bedroom with a spacious walk-in wardrobe and the sprawling bathroom, Jacuzzi, a \n rain shower head and a couple spa suite.");
System.out.println("===============XXXXXXXXXXXXXXX===============XXXXXXXXXXXXXXX=============== \n ");
System.out.println("This suite comes with an option of an additional bedroom to accommodate more guests. Keeping in mind the need\n for privacy and enhanced security, the suite is equipped with bullet-proof glass. Some of the amenities in the \n room include complimentary breakfast, hair dryer, iron and ironing board, mineral water bottles and tea & coffee maker.");
System.out.println("Enter your choice: ");
int su=s.nextInt();
if(su==1)
{
	long amt=50000*days*rooms+(50000*days*rooms)/2;
    System.out.println();
    System.out.println(" Generating The BILL");
    System.out.println(" Please Wait ...................");
    for(long j=0;j<559999999;j++);
    System.out.println(" DONE ");
    System.out.println();
    System.out.println("              :::: LEELA ::::");
    System.out.println(); 
    System.out.println("\t\t\t************ BILL ************");
    System.out.println();
    System.out.println("Name: "+name); 
    System.out.println("Mobile Number: "+mb);
    System.out.println("Check-in date: "+chkin);
    System.out.println("Room Oackage Booked: "+"Grande suite with plunge pool");
    System.out.println("No. of Days For Stay: "+days);
    System.out.println("No. of childern Boarders to stay: "+child);
    System.out.println("No. of Adult Boarders to stay: "+adults);
    System.out.println("Total no. of boarders to stay: "+(child+adults));
    System.out.println("No. of Rooms Booked: "+rooms);
    System.out.println("Gross Amount: "+amt); 
    double gst=Math.round(9.0/100.0*amt);
    double srvtax=Math.round(9.0/100.0*amt);
    System.out.println(" Total Taxes : Rs."+(gst+srvtax));
    System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
    System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
    System.out.print(" Enter your choice : ");
    String pymnt=br.readLine();
    System.out.println();
    System.out.println(" Thanks for using our services!!! \n Visit Again!!");
    System.out.println();
    System.out.println(" ======================XXXXX=========================");
}
else if(su==2)
{
	long amt=60000*days*rooms+(60000*days*rooms)/2;
    System.out.println();
    System.out.println(" Generating The BILL");
    System.out.println(" Please Wait ...................");
    for(long j=0;j<559999999;j++);
    System.out.println(" DONE ");
    System.out.println();
    System.out.println("              :::: LEELA ::::");
    System.out.println(); 
    System.out.println("\t\t\t************ BILL ************");
    System.out.println();
    System.out.println("Name: "+name); 
    System.out.println("Mobile Number: "+mb);
    System.out.println("Check-in date: "+chkin);
    System.out.println("Room Oackage Booked: "+"ROYALE SUITE WITH PLUNGE POOL");
    System.out.println("No. of Days For Stay: "+days);
    System.out.println("No. of childern Boarders to stay: "+child);
    System.out.println("No. of Adult Boarders to stay: "+adults);
    System.out.println("Total no. of boarders to stay: "+(child+adults));
    System.out.println("No. of Rooms Booked: "+rooms);
    System.out.println("Gross Amount: "+amt); 
    double gst=Math.round(9.0/100.0*amt);
    double srvtax=Math.round(9.0/100.0*amt);
    System.out.println(" Total Taxes : Rs."+(gst+srvtax));
    System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
    System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
    System.out.print(" Enter your choice : ");
    int pymnt=s.nextInt();
    if(pymnt==1)
    {
         System.out.println();
         System.out.println(" Thanks for using our services!!! \n Visit Again!!");
         System.out.println();
         System.out.println(" ======================XXXXX=========================");
    }
    else if(pymnt==2)
    {
        System.out.println("Enter your card number:- ");
        double card=s.nextDouble();
        while(true)
{
	if (ob.validate_card(card) == true)
	{
	 Double crd = card;
     System.out.println();
     System.out.println(" Thanks For Visiting LEELA !! Hope You Enjoy \n Please Come Again !!!");
     System.out.println();
     System.out.println(" =========================  @@@@@@@@@@@@@  =========================");
     System.exit(0); 
		break;
	} 
    else
	{
		System.out.println("Invalid Number!!!");
		card = s.nextDouble();
	}
}
    }
    System.out.println();
    System.out.println(" Thanks for using our services!!! \n Visit Again!!");
    System.out.println();
    System.out.println(" ======================XXXXX=========================");
}
else if(su==3)
{
	long amt=75000*days*rooms+(75000*days*rooms)/2;
    System.out.println();
    System.out.println(" Generating The BILL");
    System.out.println(" Please Wait ...................");
    for(long j=0;j<559999999;j++);
    System.out.println(" DONE ");
    System.out.println();
    System.out.println("              :::: LEELA ::::");
    System.out.println(); 
    System.out.println("\t\t\t************ BILL ************");
    System.out.println();
    System.out.println("Name: "+name); 
    System.out.println("Mobile Number: "+mb);
    System.out.println("Check-in date: "+chkin);
    System.out.println("Room Oackage Booked: "+"PRESIDENTIAL SUITE");
    System.out.println("No. of Days For Stay: "+days);
    System.out.println("No. of childern Boarders to stay: "+child);
    System.out.println("No. of Adult Boarders to stay: "+adults);
    System.out.println("Total no. of boarders to stay: "+(child+adults));
    System.out.println("No. of Rooms Booked: "+rooms);
    System.out.println("Gross Amount: "+amt); 
    double gst=Math.round(9.0/100.0*amt);
    double srvtax=Math.round(9.0/100.0*amt);
    System.out.println(" Total Taxes : Rs."+(gst+srvtax));
    System.out.println(" Total Amount to be paid : Rs."+(amt+gst+srvtax));
    System.out.println(" Enter the mode of payment : \n 1.CASH 2. CARD ");
    System.out.print(" Enter your choice : ");
    int pymnt=s.nextInt();
    if(pymnt==1)
    {
         System.out.println();
         System.out.println(" Thanks for using our services!!! \n Visit Again!!");
         System.out.println();
         System.out.println(" ======================XXXXX=========================");
    }
    else if(pymnt==2)
    {
        System.out.println("Enter your card number:- ");
        double card=s.nextDouble();
        while(true)
{
	if (ob.validate_card(card) == true)
	{
	 Double crd = card;
     System.out.println();
     System.out.println(" Thanks For Visiting LEELA !! Hope You Enjoy \n Please Come Again !!!");
     System.out.println();
     System.out.println(" =========================  @@@@@@@@@@@@@  =========================");
     System.exit(0); 
		break;
	} 
    else
	{
		System.out.println("Invalid Number!!!");
		card = s.nextDouble();
	}
}
    }
}
}
else if(rm==4)
{
    System.out.println();
    System.out.println(" Thanks For Visiting LEELA !! Hope You Enjoy \n Please Come Again !!!");
    System.out.println();
    System.out.println(" =========================  @@@@@@@@@@@@@  =========================");
    System.exit(0); 
}
}
}
}

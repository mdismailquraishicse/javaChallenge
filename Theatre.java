import java.util.*;

public class Theatre{

public static void main(String args [])

{

Scanner scan= new Scanner(System.in);

int refreshmentCharge=50;

int rate;

double price; 

System.out.println("Enter no of tickets:");

int tkt=scan.nextInt();

if(tkt<5||tkt>40)

{

System.out.println("Minimum of 5 and maximum of 40 tickets are allowed");

return;

}

System.out.println("Do you want refreshment:");

char refreshment=scan.next().charAt(0);

if(refreshment!='y')

{

if(refreshment!='n')

{

System.out.println("Invalid Input");

return;

}

}

System.out.println("Do you have coupon code:");

char code=scan.next().charAt(0);

if(code!='y')

{

if(code!='n')

{

System.out.println("Invalid Input");

return;

}

}

System.out.println("Enter the circle:");

char circle=scan.next().charAt(0);

if(circle!='k')

{

if(circle!='q')

{

System.out.println("Invalid Input");

return;

}

}

if(circle=='k')

{

rate=75;

price=tkt*rate;

if(code=='y')

price=(price-(0.02*price));

if(tkt>19)

price=(price-(0.1*price));

if(refreshment=='y')

price=(price+(tkt*refreshmentCharge));

System.out.println("Ticket cost:"+String.format("%.2f",price));

return;

}

if(circle=='q')

{

rate=150;

price=tkt*rate;

if(code=='y')

price=(price-(0.02*price));

if(tkt>19)

price=(price-(0.1*price));

if(refreshment=='y')

price=(price+(tkt*refreshmentCharge));

System.out.println("Ticket cost:"+String.format("%.2f",price));

return;

}

}

}

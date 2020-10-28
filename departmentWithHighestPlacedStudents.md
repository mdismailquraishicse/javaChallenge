import java.util.*;

public class Main{

public static void main (String args [])

{

int cse,ece,mech;

Scanner sc = new Scanner(System.in);

System.out.print("Enter the no of students placed in CSE:");

cse=sc.nextInt();

System.out.print("Enter the no of students placed in ECE:");

ece=sc.nextInt();

System.out.print("Enter the no of students placed in MECH:");

mech=sc.nextInt();

if(cse==0&&cse==0&&mech==0)

{

System.out.println("None of the department has got the highest placement...");

return;

}

if(cse==ece&&cse==mech&&ece==mech)

{

System.out.println("Highest placement");

System.out.println("CSE");

System.out.println("ECE");

System.out.println("MECH");

return;

}

if(cse==ece)

{

if(cse>mech)

{

System.out.println("Highest placement");

System.out.println("CSE");

System.out.println("ECE");
return;
}

else

System.out.println("Highest placement");

System.out.println("MECH");
return;
}

if(cse==mech)

{

if(cse>ece)

{

System.out.println("Highest placement");

System.out.println("CSE");

System.out.println("MECH");
return;
}

else

System.out.println("Highest placement");

System.out.println("ECE");
return;
}

if(ece==mech)

{

if(ece>cse)

{

System.out.println("Highest placement");

System.out.println("ECE");

System.out.println("MECH");
return;
}

else

System.out.println("Highest placement");

System.out.println("CSE");
return;
}

if(cse>ece)

{

if(cse>mech)

{

System.out.println("Highest placement");

System.out.println("CSE");
return;
}

else

{

System.out.println("Highest placement");

System.out.println("MECH");
return;
}

}

else

{

if(ece>mech)

{

System.out.println("Highest placement");

System.out.println("ECE");
return;
}

else

{

System.out.println("Highest placement");

System.out.println("MECH");
return;
}

}

}

}

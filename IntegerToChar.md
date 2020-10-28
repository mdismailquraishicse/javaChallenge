import java.util.*;

public class Main{

public static void main(String []args){

int num[]= new int[3];

Scanner sc = new Scanner(System.in); 

System.out.print("Enter three integers:");

for(int l=0;l<num.length;l++)

{

num[l] = sc.nextInt();

}

System.out.println("Characters given below");

for(int l=0;l<num.length;l++)

{

System.out.println(num[l]+":"+(char)num[l]);

}

}

}

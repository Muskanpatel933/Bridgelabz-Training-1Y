import java.util.Scanner;
class Spring{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the date of month");
int a=s.nextInt();
System.out.println("enter the month");
int m=s.nextInt();
if(m==3){
      if(a>20&&a<31){
System.out.println("it's spring season");}
}
else if(m==4){
    if(a>1&&a<30){
	System.out.println("it's spring season");}
	}
else if(m==5){
if(a>1&&a<31){
System.out.println("it's Spring season");}
}
else if(m==6){
if(a>1&&a<20){
System.out.println("its's spring season");}
}
else{
System.out.println("it's not a spring season");}

}
}
	
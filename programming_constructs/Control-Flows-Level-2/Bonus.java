import java.util.Scanner;
class Bonus{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the salary");
int salary=s.nextInt();
System.out.println("enter the years");
int year=s.nextInt();
double bonus=0;
if(year>5){
bonus=salary*0.05;
System.out.println("Bonus amount:"+bonus);
}
else{
System.out.println("no bonus");}
}
}


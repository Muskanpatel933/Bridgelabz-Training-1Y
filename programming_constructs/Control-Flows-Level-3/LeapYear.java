import java.util.Scanner;
class LeapYear{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the year");
int year=s.nextInt();
if (year>=1582){
if((year%4==0 && year%100!=0 ) || (year%400==0)) {
System.out.println("this year is leap" +year);
}
else {
System.out.println("this year is not leap year");}
}
else{
System.out.println("year must be 1582 or later");}
}
}
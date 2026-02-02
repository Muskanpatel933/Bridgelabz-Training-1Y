import java.util.Scanner;
class Youngest{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the age of Amar");
int ageAmar=s.nextInt();
System.out.println("enter the age of Akbar");
int ageAkbar=s.nextInt();
System.out.println("enter the age of Anthony");
int ageAnthony=s.nextInt();
if(ageAmar<ageAkbar && ageAmar<ageAnthony){
System.out.println("Amar is the youngest");}
else if(ageAkbar<ageAmar && ageAkbar<ageAnthony){
System.out.println("Akbar is the youngest");}
else{
System.out.println("Anthony is the youngest");
}
System.out.println("enter the height of Amar");
int heightAmar=s.nextInt();
System.out.println("enter the height of Akbar");
int  heightAkbar=s.nextInt();
System.out.println("enter the height of Anthony");
int heightAnthony=s.nextInt();
if(heightAmar<heightAkbar && heightAmar<heightAnthony){
System.out.println("Amar is the tallest");}
else if(heightAkbar<heightAmar && heightAkbar<heightAnthony){
System.out.println("Akbar is the tallest");}
else{
System.out.println("Anthony is the tallest");}
}
}



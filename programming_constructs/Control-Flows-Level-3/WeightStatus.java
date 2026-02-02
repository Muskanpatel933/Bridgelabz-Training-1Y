import java.util.Scanner;
class WeightStatus{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the weight of the person in kg");
double weight=s.nextDouble();
System.out.println("Enter the height of the person cm");
double heightCM=s.nextDouble();
double heightM=heightCM/100;
double BMI=weight/(heightM*heightM);
if(BMI<=18.4){
System.out.println("Underweight");}
else if(BMI<=24.9){
System.out.println("Normal");}
else if(BMI<=39.9){
System.out.println("Overweight");}
else {
System.out.println("Obese");}
}
}
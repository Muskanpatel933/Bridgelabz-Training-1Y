import java.util.Scanner;
class BodyMassIndex{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number of person");
int num=s.nextInt();
double[] weight=new double[num];
double[] height=new double[num];
double[] bmi=new double[num];
int[] status=new int[num];
for(int i=0; i<num; i++){
System.out.println("\nPerson" +(i+1));
System.out.println("Enter weight:" );
weight[i]=s.nextDouble();
System.out.println("Enter height:");
height[i]=s.nextDouble();
bmi[i]=weight[i]/(height[i]*height[i]);
if(bmi[i]<=18.4){
status[i]=1;
} else if(bmi[i]<=24.9){
status[i]=2;
} else if(bmi[i]<=39.9){
status[i]=3;
} else{
status[i]=4;
}}
for(int i=0;i<num; i++){
System.out.println("\nPerson" +(i+1));
System.out.println("Weight:" +weight[i] + "kg");
System.out.println("Height:" +height[i]+ "m");
System.out.println("BMI:" +bmi[i]);
if(status[i]==1)
System.out.println("Status: Underweight");
else if(status[i]==2)
System.out.println("Status:Normal");
else if(status[i]==3)
System.out.println("Status: Overweight   ");
else
System.out.println("Status: Obese ");
}
}
}

import java.util.Scanner;
class BodyMassIndex2D{
public static void main (String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the number of person");
int num=s.nextInt();
double[][] persondata=new double[num][3];
int[] status=new int[num];
for(int i=0; i<num; i++){
System.out.println("\nPerson" +(i+1));
System.out.println("Enter weight:" );
persondata[i][0]=s.nextDouble();
System.out.println("Enter height:");
persondata[i][1]=s.nextDouble();
persondata[i][2]=persondata[i][0]/(persondata[i][1]*persondata[i][1]);
if(persondata[i][2]<=18.4){
status[i]=1;
} else if(persondata[i][2]<=24.9){
status[i]=2;
} else if(persondata[i][2]<=39.9){
status[i]=3;
} else{
status[i]=4;
}}
for(int i=0;i<num; i++){
System.out.println("\nPerson" +(i+1));
System.out.println("Weight:" +persondata[i][0] + "kg");
System.out.println("Height:" +persondata[i][1]+ "m");
System.out.println("BMI:" +persondata[i][2]);
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

import java.util.Scanner;
class HeightOfFootballTeam{
public static void main(String args[]){
Scanner s=new Scanner(System.in);

double[] height = new double[11];
System.out.println("enter the height");
for(int i=0; i<11; i++){
height[i]=s.nextDouble();}
double sum =0;
for (int i=0; i<11;i++){
sum =sum+height[i];}
double mean=sum/11;
System.out.println("mean height =" +mean);}}
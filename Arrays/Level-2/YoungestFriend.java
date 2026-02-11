import java.util.Scanner;
class YoungestFriend{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int[] age=new int[3];
double[] height=new double[3];
for(int i=0;i<3;i++){
System.out.println("Enter age of friend" +(i+1));
age[i]=s.nextInt();
System.out.println("Enter the height of friend" +(i+1));
height[i]=s.nextInt();}
int youngest =age[0];
double tallest=height[0];
for(int i=1;i<3; i++){
if(age[i]<youngest){
youngest=age[i];}
if(height[i]>tallest){
tallest=height[i];}}
System.out.println("youngest age is:" +youngest);
System.out.println("Tallest height is:" +tallest);
}}

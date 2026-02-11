import java.util.Scanner;
class VoteChecking{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the 10 students age");
int[] age=new int[10];
for(int i=0; i<age.length; i++){
System.out.println("Enter age of students" +(i+1)+ ": ");
age[i] =s.nextInt();
}
for(int i=0; i< age.length; i++){
if(age[i]<0){
System.out.println("Invalid age");}
else if(age[i]>=18){
System.out.println("the student with age" +age[i] + "can vote");}
else{
System.out.println("the student with age" +age[i]+ "cannot vote");
}
}
}
}
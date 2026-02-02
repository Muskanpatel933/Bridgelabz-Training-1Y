import java.util.Scanner;
class GradePercantage{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("enter the physics marks");
int phy=s.nextInt();
System.out.println("enter the chemistry marks");
int chem=s.nextInt();
System.out.println("enter the maths marks");
int maths=s.nextInt();
int Percentage=(phy+chem+maths)/3;
char grade;
String remarks;
if(Percentage>=80){
grade='A';
remarks = "Level 4,above agency-normalized standards";
}else if(Percentage>=70){
grade='B';
remarks="Level 3,at agency-normalized";
}else if(Percentage>=60){
grade='C';
remarks="Level 2 below, but approching agency-normalized standards";
}else if(Percentage>=50){
grade='D';
remarks="Level 1, well below agency-normalized standards";
}else if (Percentage>=40){
grade='E';
remarks="Level 1, too below agency-normalized standards";
}else {
grade='R';
remarks="Remedial standards";
}
System.out.println("\nAverage Marks:" +Percentage+ "%");
System.out.println("Grade:"+grade);
System.out.println("Remarks:" +remarks);
}
}

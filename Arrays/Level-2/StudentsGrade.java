import java.util.Scanner;
class StudentsGrade{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the students number");
int num=s.nextInt();
int[] chem=new int[num];
int[] maths=new int[num];
int[] phy=new int[num];
double[] percentage=new double[num];
char[] grade= new char[num];
for(int i=0; i<num; i++){
System.out.println("\nStudent " +(i+1));
System.out.println("Enter the number of chemistry");
chem[i]=s.nextInt();
if(chem[i]<0){i--;continue;}
System.out.println("Enter the number of mathmatics");
maths[i]=s.nextInt();
if(maths[i]<0){i--;continue;}
System.out.println("Enter the number of physcis");
phy[i]=s.nextInt();
if(phy[i]<0){i--;continue;}
percentage[i]=(phy[i]+chem[i]+maths[i])/3;
if(percentage[i]>=80)
grade[i]='A';
else if(percentage[i]>=70)
grade[i]='B';
else if(percentage[i]>=60)
grade[i]='C';
else if(percentage[i]>=50)
grade[i]='D';
else if(percentage[i]>=40)
grade[i]='E';
else
grade[i]='R';}
for(int i=0;i<num;i++){
System.out.println("Student" +(i+1));
System.out.println("Percentage:" +percentage[i]);
System.out.println("Grade:" +grade[i]);
}
}
}

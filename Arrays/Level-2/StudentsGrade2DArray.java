import java.util.Scanner;
class StudentsGrade2DArray{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
System.out.println("Enter the students number");
int num=s.nextInt();
int[][] marks=new int[num][3];
double[] percentage=new double[num];
char[] grade= new char[num];
for(int i=0; i<num; i++){
System.out.println("\nStudent " +(i+1));
System.out.println("Enter the number of chemistry");
marks[i][0]=s.nextInt();
if(marks[i][0]<0){i--;continue;}
System.out.println("Enter the number of mathmatics");
marks[i][0]=s.nextInt();
if(marks[i][0]<0){i--;continue;}
System.out.println("Enter the number of physcis");
marks[i][0]=s.nextInt();
if(marks[i][0]<0){i--;continue;}
percentage[i]=(marks[i][0]+marks[i][1]+marks[i][2])/3;
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
System.out.println("Physics" +marks[i][0]);
System.out.println("mathmatics" +marks[i][1]);
System.out.println("chemistry" +marks[i][2]);
System.out.println("Percentage:" +percentage[i]);
System.out.println("Grade:" +grade[i]);
}
}
}

import java.util.Scanner;
class BonusOfEmployees{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n=10;
double[] salary=new double[n];
double[] years=new double[n];
double[] bonus=new double[n];
double[] newSalary=new double[n];
double totalBonus=0;
double totalOldSalary=0;
double totalNewSalary=0;
for(int i=0;i<n;i++){
System.out.println("Employee" +(i+1));
System.out.print("Enter the salary:");
salary[i]=s.nextDouble();
System.out.print("Enter years of service:");
years[i]=s.nextDouble();
if(salary[i]<=0||years[i]<0){
System.out.println("Invalid input");
i--;
continue;}
for(int j=0;j<n;j++){
if(years[j]>5){
bonus[j]=salary[j]*0.05;}
else{
bonus[j]=salary[j]*0.02;}
newSalary[j]=salary[j]+bonus[j];
totalBonus +=bonus[j];
totalOldSalary += salary[j];
totalNewSalary +=newSalary[j];
System.out.println("\n-------FINAL RESULT-------");
for(int k=0;k<n;k++){
System.out.println("Employee" +(k+1)+ "Old Salary:" +salary[k]+  "Bonus:" +bonus[k]+ "New Salary:"+ newSalary[k]);}
System.out.println("\nTotal OLD SALARY =" +totalOldSalary);
System.out.println("TOTAL BONUS PAID=" +totalBonus);
System.out.println("TOTAL NEW SALARY=" +totalNewSalary);
}
}}}
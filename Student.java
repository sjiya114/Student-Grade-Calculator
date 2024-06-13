//Task 1:Input:Take marks obtained(out of 100) in each subject
import java.util.*;
class Student
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter total number of subjects");
int sub=sc.nextInt();
int marks[]=new int[sub];
int sum=0;
for(int i=0;i<sub;i++)
{
System.out.println("Enter marks of subject out of 100:"+i+1);
marks[i]=sc.nextInt();
sum+=marks[i];
}
String grade="";
double avg=sum/sub;
if(avg>90)
{
grade+="A+";
}
else if(avg>80)
{
    grade="A";
}
else if(avg>70)
{
grade="B+";
}
else if(avg>60)
{
grade="B";
}
else if(avg>50)
{
grade="C+";
}
else if(avg>40)
{
    grade="C";
}
else if(avg>30)
{
    grade="D";
}
else
{
    grade="F";
}
System.out.println("Total marks of students:"+sum);
System.out.println("Percentage of student:"+avg);
System.out.println("Grade of student is:"+grade);
}
}
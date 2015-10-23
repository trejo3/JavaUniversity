package JUpackage;

import java.sql.SQLException;
import java.util.*;

public class Transcript {

ArrayList<Double> GPAList = new ArrayList<Double>();
Student s1 = new Student();
String course = "";
Integer credits = 0;

String grade = "";
Double GPA = 0.0;
Double FinalGPA = 0.0;
//System.out.println("welcome to the transcript application");
public void EnterRecords() {

Scanner scan = new Scanner(System.in);
System.out.println("enter the name of the student");
String name = scan.next();
s1.setName(name);
String response = "y";
while(response.equalsIgnoreCase("Y"))
{
System.out.println("Enter the course");
course = scan.next();
s1.setCourse(course);

System.out.println("Enter credits");
credits = scan.nextInt();
s1.setCredits(credits);

System.out.println("Enter grade");
grade = scan.next();
s1.setGrade(grade);

System.out.println("Another line item? (y/n): ");
response = scan.next();

}
} 

public void getRecords() throws SQLException{

s1.getName();
int i=0;

for(i=0; i<s1.courseList.size();i++)
{
//System.out.print("Course "+(i+1));
System.out.print(s1.getCourse(i)+" ");
System.out.print(s1.getCredits(i)+" ");
System.out.print(s1.getGrade(i)+" ");
if(s1.getGrade(i).equalsIgnoreCase("A"))
{
GPA = 4.0;
GPAList.add(GPA);

}
else if(s1.getGrade(i).equalsIgnoreCase("B"))
{
GPA = 3.0;
GPAList.add(GPA);

}
else if(s1.getGrade(i).equalsIgnoreCase("C"))
{
GPA = 2.0;
GPAList.add(GPA);

}
else if(s1.getGrade(i).equalsIgnoreCase("D"))
{
GPA = 1.0;
GPAList.add(GPA);

}
else
{

GPA = 0.0;
GPAList.add(GPA); 


}
System.out.println(GPA);
TranscriptDB.insertNewCustomerDB(s1.getName(),s1.getCredits(i),s1.getGrade(i), GPA);
TranscriptDB.retrieveCustomer(s1.getName());
}
calculateGPA(GPAList);


}

private void calculateGPA(ArrayList<Double> GPAList) {

for(int i=0; i<s1.courseList.size();i++)
{


FinalGPA = FinalGPA+GPAList.get(i);


}
System.out.println("");
System.out.println();

System.out.println(" GPA ="+(FinalGPA/s1.courseList.size()));
// TODO Auto-generated method stub

} 



}
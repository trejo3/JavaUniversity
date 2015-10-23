package JUpackage;

import java.sql.SQLException;
import java.util.Scanner;

public class TranscriptMain {

public static void main(String[] args) throws SQLException {

System.out.println("Welcome to the University.");
Transcript t1 = new Transcript();
Scanner scan = new Scanner(System.in);

System.out.println("enter the name of the student");


t1.EnterRecords();

System.out.print("Course ");
System.out.print("Credit ");
System.out.print("Grade ");
System.out.println("Quality Points");
System.out.print("------ ");
System.out.print("------ ");
System.out.print("----- ");
System.out.println("--------");


t1.getRecords();

}

}
package JUpackage;

import java.util.ArrayList;

public class Student {





ArrayList<String> courseList = new ArrayList<String>();
ArrayList<Integer> creditsList = new ArrayList<Integer>();
ArrayList<String> gradeList = new ArrayList<String>();

String Course = "";
Integer Credits = 0;
String name = "";
String grade = "";


public String getName() {
return name;
}
public void setName(String name) {
this.name = name;
}



public String getCourse(int index) {
return courseList.get(index);
}
public void setCourse(String course) {
Course = course;
courseList.add(course);
}
public Integer getCredits(int index) {
return creditsList.get(index);
}
public void setCredits(Integer credits) {
Credits = credits;
creditsList.add(Credits);
}
public String getGrade(int index) {
return gradeList.get(index);
}
public void setGrade(String grade) {
this.grade = grade;
gradeList.add(grade);

}


}


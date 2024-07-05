import java.util.*;
import java.lang.String;
class Student 
{
int admno;
String name;
Student(int x,String y)
{
admno=x;
name=y;
}
void show()
{
System.out.println(admno+" "+name);
}
}
class StudentDetails	
{
public static void main(String args[])
{
Student s1=new Student(111,"Reena");
s1.show();
Student s2=new Student(222,"rani");
s2.show();
}
}

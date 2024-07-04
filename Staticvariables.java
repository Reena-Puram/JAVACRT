import java.util.*;
import java.lang.String;
class Sample	
{
int a=10;
static int b=20;
}
class Staticvariables
{
public static void main(String args[])
{
System.out.println(Sample.b);
Sample s1=new Sample();
System.out.println(s1.a+" "+s1.b);
Sample s2=new Sample();
System.out.println(s2.a+" "+s2.b);
}
}
import java.util.*;
import java.lang.String;
class Sample	
{
int a=10;
static int b=20;
}
class Staticvariables1
{
public static void main(String args[])
{
Sample s1=new Sample();
System.out.println(s1.a+" "+s1.b);
Sample s2=new Sample();
System.out.println(s2.a+" "+s2.b);
s1.a=888;
s1.b=999;
System.out.println(s1.a+" "+s1.b);
System.out.println(s2.a+" "+s2.b);
}
}
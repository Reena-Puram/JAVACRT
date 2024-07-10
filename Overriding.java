class Father 
{
void surName()
{
System.out.println("K");
}
void designation()
{
System.out.println("Clerk");
}
}
class child extends Father
{
void getName()
{
System.out.print("Ramu ");
}
 void designation()
{
System.out.println("Java programmer");
}
}
class Overriding
{
public static void main(String args[])
{
child c1=new child();
c1.getName();
c1.surName();
c1.designation();
}
}

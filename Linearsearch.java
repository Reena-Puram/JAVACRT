import java.util.*;
class Linearsearch
{
static int Linearsearch (int a[],int n,int key)
{
for(int i=0;i<n;i++)
{
if(key==a[i])
{
return i;
}
}
return 0;
}
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
int key =s.nextInt();
int r=Linearsearch(a,n,key);
if(r==-1)
{
System.out.println("Element is not found");
}
else
{
System.out.println("Element is found");
}
}
}

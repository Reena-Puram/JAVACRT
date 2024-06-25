import java.util.*;
class Matrix
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
{
int n=s.nextInt();
int a[]= new int[n];
int count=0;
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(int i=0;i<n;i++)
{
if(a[0]<=a[i])
{
count++;
}
}
System.out.print(count);

}
}
}




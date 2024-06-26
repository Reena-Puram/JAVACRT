import java.util.*;
class Kthsmall
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int pos=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
if(i+1==pos)
{
System.out.println(a[i]);
}
}
}
}

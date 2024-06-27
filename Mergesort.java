import java.util.*;
class Merge
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=s.nextInt();
}
for(i=0;i<n;i++)
{
for(j=1;j<n;j++)
{
a[i]>a[j];
}
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
System.out.print(a[i]+" ");
}
}
}

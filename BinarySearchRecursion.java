import java.util.*;
class BinarySearchRecursion
{

static int Binarysearch(int a[],int low,int high,int key)
{
if(low<=high)
{
int mid=(low+high)/2;
if(key==a[mid])
return mid;
else if(key<a[mid])
return Binarysearch(a,low,mid-1,key);
else
return Binarysearch(a,mid+1,high,key);
}
else
{
return -1;
}
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
Arrays.sort(a);
int key=s.nextInt();
int r=Binarysearch(a,0,n-1,key);
if(r==-1)
{
System.out.println("Element is not found");
}
else
{
System.out.println("Element is found"+r);
}
}
}

package ramya;
import java.util.Scanner;
import java.util.*;
public class Sum0 {
public static void main(String args[]) {
	System.out.println("Enter the number:");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	double[] Arr=new double[n];
	System.out.println("Enter the Elements:");
	for(int i=0;i<n;i++)
	{
		Arr [i]=s.nextDouble();
	}
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			   if(Arr[i]+Arr[j]==0 || ((Arr[i]+Arr[j]<1)&&(Arr[i]+Arr[j]>-1)))	
System.out.println("elements are:"+Arr[i]+","+Arr[j]);
		}
		}
	}
}
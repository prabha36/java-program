import java.util.*;
public class Prog 
{
	public static void main(String[] args) 
	{
		int i,j,flag=0;
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n;i++) 
		{
			for(j=i+1;j<n;j++) 
			{
				if((arr[i]+arr[j])==k)
				{	
					flag=1;
					break;
				}
			}
			if(flag==1)
				break;
		}
		if(flag==1)
			System.out.println("true");
		else
			System.out.println("false");
	}
}
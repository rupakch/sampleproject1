package Day1;
import java.util.Scanner;
import java.util.Arrays; 
import java.util.Collections; 
public class ass1 {
public static void main(String ar[])
{
	//double min=0.0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no. of action scenes");
	int X=sc.nextInt();
	int a[]=new int[X];
	for (int i=0; i<a.length;i++)
	{
		System.out.println("Enter data for action scenes");
		a[i]=sc.nextInt();
	}
	System.out.println("Enter no. of comedy scenes");
	int Y=sc.nextInt();
	int b[]=new int[Y];
	for (int i=0; i<b.length;i++)
	{
		System.out.println("Enter data for comedy scenes");
		b[i]=sc.nextInt();
	}
	System.out.println("Enter no. of action and comedy scenes for validation");
	int va=sc.nextInt();
	int vc=sc.nextInt();
	int validation[][]=new int[va][vc];
	for (int i=0;i<va;i++)
	{
		for(int j=0;j<vc;j++)
		{
		System.out.println("Enter validation data");
		validation[i][j]=sc.nextInt();
		}
	}
	double prediction[]=new double[X];
		for (int i=0; i<prediction.length;i++)
			prediction[i]=Math.sqrt(Math.pow(50-a[i],2)+Math.pow(50-b[i],2));
	//System.out.println("Hello");
		for (int i=0; i<prediction.length;i++)
			System.out.println(prediction[i]);
	
		double min=prediction[0];
		for (int i=1; i<prediction.length;i++)
		{
			if (prediction[i]<min)
				min=prediction[i];
		}
		System.out.println(min);
		
		
	}
}

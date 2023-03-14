package javaprogram;
// design a method which is except a integer array and returns sum of the no present in array
public class Array2 
{ 
	static int arr[]= {12,3,4,15};
	
	static int sum()
	{
		int sum=0;
		int i;
		for (i=0; i<arr.length; i++)
			sum +=arr[i];
		return sum;
	}
	public static void main(String[] args) 
	{
		System.out.println("sum of no of array is "+ sum());	
	}
}

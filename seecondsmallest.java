package html;



import java.util.*;

public class example{
	 
	public static void main(String[] args) {
 
		int arr[] = {   47,46, 86, 92, 52, 48, 36,44, 66, 85 };
		int smallest= arr[0];
		int secondsmallest = arr[0];
		
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+"\t");
		}
		for (int i = 0; i < arr.length; i++) 
                {
 
			if (arr[i] < smallest)
                        {
				secondsmallest= smallest;
				smallest = arr[i];
  


			} else if (arr[i] < secondsmallest) {
				secondsmallest = arr[i];
 
			}
		}
 
		System.out.println("\nSecond smallestS number is:" + secondsmallest);
 
	}
}

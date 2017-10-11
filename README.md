import java.util.*;

public class reversenbr 
{		 
	   
	     
	    public static void main(String a[]){
	    	Scanner sc=new Scanner(System.in);
	    	 System.out.println("enter number");
	    	int number=sc.nextInt();
	    	int reverse=0;
	    	  while(number != 0)
		        {
		            reverse = (reverse*10)+(number%10);
		             number = number/10;
		            System.out.println(+reverse);
		        } 
	
	        System.out.println("Result: "+reverse);
	    }
 }

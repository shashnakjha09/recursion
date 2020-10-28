package recursion1;

import java.util.Scanner;

public class factorial {
	
	public static int factorial(int num) {
		 
		 if(num == 1) {
			 return 1;
		 }
		 
		 int result  = factorial(num-1);
		 int result1 = result * num;
		return result1;
		 
	}

	public static void main(String[] args) {
           
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		int result  =  factorial(num);  
	     System.out.println(result);
	
	
	}

}

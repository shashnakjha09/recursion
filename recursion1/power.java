package recursion1;


import java.util.Scanner;

public class power {
	
	public static int power(int base , int pow) {
		
		if(pow == 0) { 
			return 1;
		}

		 if(pow == 1) {
			 return base;
		 }
		 
		 int result  = power(base, pow/2);
		 
		 if(pow % 2 ==0) {
			 return result * result;
		 }
		 if(pow % 2 != 0) {
			 return result * result * base;
		 }
		return result;
	}

	public static void main(String[] args) {
         
          	Scanner sc = new Scanner(System.in);
          	
          	int base = sc.nextInt();
          	int pow = sc.nextInt();
          	int result = power(base, pow);
          	System.out.println(result);
          	
          	
		 
	}

	

}

	
	
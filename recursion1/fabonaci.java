package recursion1;

import java.util.Scanner;

public class fabonaci {
	
	public static int febonaci(int num) {
		if(num == 1) {
			return 0;
		}
		if(num ==2) {
			return 1;
		}
		
		int febo1 = febonaci(num-1);
		int febo2 = febonaci(num-2);
		
		int feb_final = febo1 + febo2;
		return feb_final;
	}
	

	public static void main(String[] args) {
         
		 Scanner sc = new Scanner(System.in);
		 int num = sc.nextInt();
		 
		int result  =  febonaci(num);  
	     System.out.println(result);

	}

}

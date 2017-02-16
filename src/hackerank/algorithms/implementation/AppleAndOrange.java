package hackerank.algorithms.implementation;

import java.util.Scanner;

/*
 * Problem-URL
 * https://www.hackerrank.com/challenges/apple-and-orange\
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class AppleAndOrange {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int s = in.nextInt();
	        int t = in.nextInt();
	        int a = in.nextInt();
	        int b = in.nextInt();
	        int m = in.nextInt();
	        int n = in.nextInt();
	        int[] apple = new int[m];
	        int apple_counter = 0;
	        int orange_counter = 0;
	        for(int apple_i=0; apple_i < m; apple_i++){
	            apple[apple_i] = in.nextInt();
	            if((a+apple[apple_i]>=s)  &&(a+apple[apple_i]<=t)){
	             apple_counter++;
	            }
	        }
	        int[] orange = new int[n];
	        for(int orange_i=0; orange_i < n; orange_i++){
	            orange[orange_i] = in.nextInt();
	            if((b+orange[orange_i]>=s)  &&(b+orange[orange_i]<=t)){
	             orange_counter++;
	            }
	        }
	        System.out.println(apple_counter);
	        System.out.println(orange_counter);
	        in.close();
	    }

}

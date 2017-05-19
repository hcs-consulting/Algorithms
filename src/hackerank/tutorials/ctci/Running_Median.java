package hackerank.tutorials.ctci;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


/*
 * Problem-URL 
 * https://www.hackerrank.com/challenges/ctci-find-the-running-median
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class Running_Median {
	static  Queue<Integer> low = new PriorityQueue<Integer>(Comparator.reverseOrder());
	static  Queue<Integer> high = new PriorityQueue<Integer>();

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a_i=0; a_i < n; a_i++){
        	add(in.nextInt());
        	System.out.println(median());
        }
    }
	
	public static void add(int number){
		if(low.size()<=high.size()){
			low.add(number);
		}
		else{
			high.add(number);
		}
		balance();
	}
	
	public static void balance(){
		if(!low.isEmpty() && !high.isEmpty() && low.peek()>high.peek()){
			Integer lowdata = low.poll();
			Integer highData = high.poll();
			low.add(highData);
			high.add(lowdata);
		}
	}
	
	public static double median(){
		return low.size()==high.size()?(low.peek()+high.peek())/2.0:low.peek();
	}

}

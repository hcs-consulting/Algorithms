package hackerank.algorithms.implementation;

import java.util.Scanner;
import java.util.Stack;

/*
 * Problem-URL
 * https://www.hackerrank.com/challenges/ctci-balanced-brackets
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */
public class BalancedBrackets {

	public static boolean isBalanced(String expression) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) {
			switch (expression.charAt(i)) {
			case '{':
			case '(':
			case '[':
				stack.push(expression.charAt(i));
				break;
			case '}':
				if (stack.empty() || (stack.peek() != '{')) {
					return false;
				}
				stack.pop();
				break;
			case ']':
				if (stack.empty() || (stack.peek() != '[')) {
					return false;
				}
				stack.pop();
				break;
			case ')':
				if (stack.empty() || (stack.peek() != '(')) {
					return false;
				}
				stack.pop();
				break;
			}
		}
		return stack.empty()?true:false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int a0 = 0; a0 < t; a0++) {
			String expression = in.next();
			System.out.println((isBalanced(expression)) ? "YES" : "NO");
		}
	}

}

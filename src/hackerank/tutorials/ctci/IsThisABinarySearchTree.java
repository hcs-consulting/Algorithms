package hackerank.tutorials.ctci;

/*
 * Problem-URL
 * https://www.hackerrank.com/challenges/ctci-is-binary-search-tree
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class IsThisABinarySearchTree {

	public static class Node {
		int data;
		Node left;
		Node right;
	}

	boolean checkBST(Node root) {
		return check_BstUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean check_BstUtil(Node node, int min, int max) {
		if (node == null) {
			return true;
		}
		/* false if this node violates the min/max constraint */
		if (node.data < min || node.data > max)
			return false;

		return check_BstUtil(node.left,min,node.data-1) && check_BstUtil(node.right, node.data+1,max);

	}

}

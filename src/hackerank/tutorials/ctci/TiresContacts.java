package hackerank.tutorials.ctci;

import java.util.HashMap;
import java.util.Scanner;

/*
 * Problem-URL
 * https://www.hackerrank.com/challenges/ctci-contacts
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class TiresContacts {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Trie trie = new Trie();
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String op = in.next();
            String contact = in.next();
            if(op.equals("add")){
            	trie.add(contact);
            }
            else{
            	System.out.println(trie.find(contact));
            }
        }
    }

}

class TrieNode{
	private HashMap<Character,TrieNode> children = new HashMap<>();
	public int size;
	public void putIfNodeAbsent(char c){
		children.putIfAbsent(c,new TrieNode());
	}
	public TrieNode getChldren(char c){
		return children.get(c);
	}
}

class Trie{
	TrieNode root = new TrieNode();
	
	public void add(String word){
		TrieNode current = root;
		for(int i=0;i<word.length();i++){
			char ch = word.charAt(i);
			current.putIfNodeAbsent(ch);
			current = current.getChldren(ch);
			current.size++;
		}
	}
	
	public int find(String prefix){
		TrieNode current = root;
		for(int i=0;i<prefix.length();i++){
			char ch = prefix.charAt(i);
			current = current.getChldren(ch);
			if(current == null){
				return 0;
			}
		}
		return current.size;
	}
	
}



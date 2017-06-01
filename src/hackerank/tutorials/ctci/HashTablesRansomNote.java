package hackerank.tutorials.ctci;

import java.util.*;


/*
 * Problem-URL
 * https://www.hackerrank.com/challenges/ctci-ransom-note
 * result = Passed all test cases
 */

/*
 * @author Raj Sharma
 * https://www.linkedin.com/in/raj-sharma-a1650958/
 */

public class HashTablesRansomNote {  
    Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;

    public HashTablesRansomNote(String magazine, String note) {
        magazineMap = new HashMap<String, Integer>();
        noteMap = new HashMap<String, Integer>();

        fillMap(magazineMap, magazine);
        fillMap(noteMap, note);
    }

    public void fillMap(Map<String, Integer> map, String value) {
        if (value == null) return;

        String[] words = value.split("\\s+");

        for (String word : words) {
            if (!map.containsKey(word)) {
                map.put(word, 1);
            } else {
                Integer current = map.get(word);
                if (current == null) current = 0;
                map.put(word, current + 1);
            }
        }
    }

    public boolean solve() {
        for (String key : noteMap.keySet()) {
            // If magazine doesn't have a word that's on a note, then return false right the way
            if (!magazineMap.containsKey(key)) return false;

            // Now make sure there are enough words on magazine for a given word
            Integer magazineCount = magazineMap.get(key);
            Integer noteCount = noteMap.get(key);

            if (magazineCount < noteCount) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        // Eat whitespace to beginning of next line
        scanner.nextLine();

        HashTablesRansomNote s = new HashTablesRansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();

        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");

    }
}
import java.util.HashMap;


public class FirstNonRepeatingCharacter {

    public static int firstUniqChar(String s) {

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        
        // Count the frequency of each character in the string

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);

        }

        
        // Find the first character with a frequency of 1

        for (int i = 0; i < s.length(); i++) {

            if (frequencyMap.get(s.charAt(i)) == 1) {

                return i;

            }

        }

        
        // If no non-repeating character found, return -1

        return -1;

    }

    
    public static void main(String[] args) {

        String s1 = "leetcode";

        System.out.println("First non-repeating character index in '" + s1 + "': " + firstUniqChar(s1));

        
        String s2 = "loveleetcode";

        System.out.println("First non-repeating character index in '" + s2 + "': " + firstUniqChar(s2));

    }

}
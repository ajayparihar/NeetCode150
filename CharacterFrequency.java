import java.util.HashMap;

public class CharacterFrequency {
    public static void main(String[] args) {
        // Sample string
        String s = "racecar";

        // Create a HashMap to store the frequency of each character
        HashMap<Character, Integer> hashMap = new HashMap<>();

        // Iterate through the characters of the string
        for (char c : s.toCharArray()) {
            if (hashMap.containsKey(c)) {
                // If the character is already in the HashMap, increment its frequency
                hashMap.put(c, hashMap.get(c) + 1);
            } else {
                // If the character is not in the HashMap, add it with a frequency of 1
                hashMap.put(c, 1);
            }
        }

        // Print the HashMap
        for (char key : hashMap.keySet()) {
            System.out.println("Character: " + key + ", Frequency: " + hashMap.get(key));
        }
    }
}

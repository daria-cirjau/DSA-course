import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrans(String[] strs) {
        Map<String, List<String>> storage = new HashMap<>();
        for (String word : strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);
            storage.putIfAbsent(sortedWord, new ArrayList<>());
            storage.get(sortedWord).add(word);
        }

        return new ArrayList<>(storage.values());
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
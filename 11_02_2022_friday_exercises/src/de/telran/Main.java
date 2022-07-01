package de.telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public List<String> anagramList(String str, List<String> strings) {
        Map<String, List<String>> anagrams = new HashMap<>();
        for (String s : strings) {
            String sortedK = sortAnagram(s);
            if (anagrams.containsKey(sortedK)) {
                List<String> value = anagrams.get(sortedK);
                value.add(s);
                anagrams.put(sortedK, value);
            } else {
                List<String> value = new ArrayList<>();
                value.add(s);
                anagrams.put(s);
            }

        }
    }

    private String sortAnagram(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    List<String> removeDublicate(List<String> imput) {
        Set<String> set = new HashSet<>(imput);
    }
}

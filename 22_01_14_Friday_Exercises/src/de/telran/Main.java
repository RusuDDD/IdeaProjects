package de.telran;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {


    }

    public List<String> yesOrNot(List<Integer> list1, List<Integer> list2) {
        List<String> resultYesNo = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) == list2.get(i)) {
                resultYesNo.add("Yes");
            else resultYesNo.add("No");
            }
            return resultYesNo;
        }
    }

    public List joinTwoList(List list1, List list) {
        List joinesd = new List() {
        }
    }

    public List<Integer> withoutElementsMoreThanRequired(List<Integer> imput, int n) {
        List<integer> withoutMoreThan = new ArrayList<>();
        for (Integer i : imput) {
            if (i < n) withoutMoreThan.add(i);
        }
        return withoutMoreThan;

    }

    String schortestOrLongest(List<String> list) {
        if (list.isEmpty()) throw new EmptyListException();
        String res = list.get(0);
        String minSizeElement = list.get(0);
        int indexMinElement = 0;
        String maxSizeElement = list.get(0);
        int indexMaxElement = 0;

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < minSizeElement.length()) {
                minSizeElement = list.get(i);
                indexMinElement = i;
            } else if (list.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = i;
            }
        }
        if (indexMinElement < indexMaxElement) {
            res = minSizeElement;
        } else if (indexMaxElement < indexMinElement) {
            res = maxSizeElement;
        }
        return res;
    }

    private class EmptyListException extends Throwable {
    }

    public boolean balancesBreackets(String str) {
        char[] chars = str.toCharArray();
        Deque<Character> breackets = new ArrayDeque<>();

        for (char letter : chars) {
            if (letter == '(' || letter == '{' || letter == '[')
                breackets.addFirst(letter);
            else if (letter == ')' && breackets.getFirst() == ')' ||
                    letter == '}' && breackets.getFirst() == '}' ||
                    letter == ']' && breackets.getFirst() == ']')
                breackets.removeFirst();
        }
        if (breackets.size() == 0)
            return true;
        return false;
    }
}

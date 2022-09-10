package exercitii;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//        exercitiu de interviu: find the missing number
        int[] arr = new int[]{2, 1, 5, 4};
        int[] sortedArr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[arr[i]] = arr[i];
        }
        for (int i = 1; i < sortedArr.length; i++) {
            if (sortedArr[i] == 0) {
                System.out.println("Elementul care lipseste este: " + i);
            }
        }
        System.out.println("-------------------" + "\n" + "-------------------");

        System.out.println(areTheWordsAnagrams("Arc", "rac"));
        System.out.println(areTheWordsAnagrams("arc", "asd"));
        System.out.println(areTheWordsAnagrams("arc", "asdasda"));

        System.out.println("-------------------" + "\n" + "-------------------");
        System.out.println(isWordAnagram("Arc", "rac"));
        System.out.println(isWordAnagram("arc", "asd"));
        System.out.println(isWordAnagram("arc", "asdasda"));
    }

    public static boolean areTheWordsAnagrams(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] arr1 = firstWord.toUpperCase().toCharArray();
        char[] arr2 = secondWord.toUpperCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }


    /////////////////ESTE MAI EFICIENTA DPDV AL VITEZEI/////////////
    public static boolean isWordAnagram(String firstWord, String secondWord) {
        if (firstWord.length() != secondWord.length()) {
            return false;
        }
        char[] arr1 = firstWord.toUpperCase().toCharArray();
        char[] arr2 = secondWord.toUpperCase().toCharArray();
        Map<Character, Integer> frequency = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            if (frequency.get(arr1[i]) == null) {
                frequency.put(arr1[i], 1);
            } else {
                frequency.put(arr1[i], frequency.get(arr1[i]) + 1);
            }
        }
        Map<Character, Integer> frequency1 = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            if (frequency1.get(arr2[i]) == null) {
                frequency1.put(arr2[i], 1);
            } else {
                frequency1.put(arr2[i], frequency1.get(arr2[i]) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            if (!(frequency.get(entry.getKey()).equals(frequency1.get(entry.getKey())))) {
                return false;
            }
        }
        return true;
    }
}



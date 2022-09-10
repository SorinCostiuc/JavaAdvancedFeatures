package exercitii;

import java.util.Arrays;

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
        System.out.println("----------");

        System.out.println(areTheWordsAnagrams("Arc", "rac"));
        System.out.println(areTheWordsAnagrams("arc", "asd"));
        System.out.println(areTheWordsAnagrams("arc", "asdasda"));

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
}


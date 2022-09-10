package exercitii;

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
    }
}

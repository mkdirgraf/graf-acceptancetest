package RevisingJava.Collections;

public class CheckingDuplicates {
    public static void main(String[] args) {
        int[] duplicates = new int[]{2, 1, 2, 6, 4, 7, 6};
        for (int i = 0; i < duplicates.length; i++) {
            for (int j = i + 1; j < duplicates.length; j++) {
                if (duplicates[i] == duplicates[j]) {
                    System.out.println(duplicates[i] + " has a duplicate");
                }
            }
        }


        // sort the array
        int temp;
        int[] arr = new int[]{3, 1, 7, 12, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

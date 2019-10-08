package javakaitele.array;

import java.util.*;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] lastNames = new String[]{"Kochkorov", "Stalin", "Lenin", "Putin", "Van Debek", "Alisher", "Cheferin", "Ronaldo", "Rodrigues", "Bale", "Modric", "Jovic", "Kaka"};
        String[] firstNames = new String[]{"Ricardo", "Cristiano", "Vladimir", "Temirlan", "Doni", "Emir", "James", "Luka", "Ricardo", "Joseph", "Gareth"};
        Random random = new Random();
        int lastNameIndex = random.nextInt(lastNames.length);
        int firstNameIndex = random.nextInt(firstNames.length);
        System.out.println("Random firstName is --> " + firstNames[firstNameIndex] + " , and random last name is -->" + lastNames[lastNameIndex]);
        Arrays.sort(lastNames);
        System.out.println(Arrays.binarySearch(lastNames, "Kochkorov") + " is here");

        //------------Array Sorting----------------
        int[] arr = new int[]{2, 6, 9, 3, 12};
        int temp;
        OUTTER:
        for (int i = 0; i < arr.length; i++) {
            INNER:
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }

        }
        for (int k = 0; k < arr.length; k++) {
            System.out.println(arr[k]);
        }

// How to get each 2 digits of String, sum them and sum all together
        String str = "The Academy";
        char[] characters = str.toLowerCase().toCharArray();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < characters.length; i++) {
            if (map.containsKey(characters[i])) {
                int num = map.get(characters[i]);
                map.put(characters[i], ++num);
            } else {
                map.put(characters[i], 1);
            }
        }

        map.forEach((k, v) -> System.out.print(k + ":" + v + " "));


        //-----------How To get each two digit of String
        System.out.println("Getting each two digits");
        List<String> list = new LinkedList<>();
        String number = "121364";
        for (int i = 0; i < number.length(); i += 2) {
            list.add(number.substring(i, Math.min(number.length(), i + 2)));
        }
        list.forEach(e -> System.out.println(e));
        String[] twoDigitNumbers = list.toArray(new String[0]);
        for (int i = 0; i < twoDigitNumbers.length; i++) {
            int sum = Integer.valueOf(twoDigitNumbers[i]);
            System.out.println(sum);
        }

        System.out.println("sljfdklsjdflksd");
        int hh = 123464;
        int reversed = 0;
        int sum;
        while (hh != 0) {
            int digit = hh % 10;
            reversed = reversed * 10 + digit;
            hh /= 10;
        }
        System.out.println(reversed);
    }
}

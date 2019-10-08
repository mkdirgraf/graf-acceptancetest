package RevisingJava;

public class ArraysAndTypes {
    public static void main(String[] args) {
        /**
         *
         */
        {
            int arr1[] = {1, 2, 3};
            int arr2[] = {1, 2, 3};
            if (arr1 == arr2) // Same as arr1.equals(arr2)
                System.out.println("Same");
            else
                System.out.println("Not same");
        }

        /*
        Note: Arrays are are first class objects. arr1 and arr2 are two references to two different objects, so when we compare them it is checking '
        whether they are pointing to the same object or no

        Note: Simple way of comparing two arrays are through loop, comparing elements one by one.
         */


        String[] bugs = {"cricket", "beetle", "ladybug"};
        String[] alias = bugs;
        System.out.println(bugs==alias);
        System.out.println(bugs.equals(alias));


        String[] tima={"tima","tima2","tima3"};
        String[] tima2={"tima","tima2","tima3"};
        System.out.println(tima==tima2);
        System.out.println(tima.equals(tima2));


        int i=4;
     for (int j=0;j<i;++j){
         System.out.println(j);
     }


    }
}


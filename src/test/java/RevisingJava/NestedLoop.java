package RevisingJava;

public class NestedLoop {
    public static void main(String[] args) {

//Array is a single varibale that holds values of the same data type
        //As an example you don't need to create 100 variables for 100 students, you can simply save all of them into the array
        /*
        1)int[] nameofVariable=new int[sizeOfArray];
        2)int[] nameOfVariable={2,2,2};
        3)int nameOfVariable[];
        You can access those values through the index, nameOfVariable[index]
        You can use length method to get the length of the array
        Note: Index starts from ZERO(0) and length method starts counting from 1
         */

        int[][] arr = {{5, 1, 2, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};
        int positionX = -1;
        int positionY = -1;
        int searchValue = 9;

        //Searching for the value from the array
        OUTTERLOOP:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    break OUTTERLOOP;
                }
            }
        }

        if (positionX == -1 || positionY == -1) {
            System.out.println("Searching value not found in the array");
        } else {
            System.out.println("searching value found at index " + positionX + " " + positionY);
        }

        int repeatTime = 0;
        OUTER:
        for (int i = 0; i < arr.length; i++) {
            INNER:
            for (int j = 0; j < arr[i].length; j++) {
             if(arr[i][j]==searchValue){
                 ++repeatTime;
                 positionX=i;
                 positionY=j;
                 System.out.println(searchValue+" found in array: "+positionX+" and value at index: "+positionY);
             }
            }
        }


    }
}

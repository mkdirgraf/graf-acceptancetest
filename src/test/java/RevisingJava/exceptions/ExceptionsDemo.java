package RevisingJava.exceptions;

public class ExceptionsDemo {
    public static void main(String[] args) {
        int a = 1;
        int b = 10;
        System.out.println(a % b);

        int originalNumber = 54321;
        int reversed = 0;
        while (originalNumber!=0){
            int digit=originalNumber%10;
            reversed=reversed*10+digit;
            originalNumber/=10;
        }
        System.out.println(reversed);
    }
}

package RevisingJava;

public class BreakContinue {
    public static void main(String[] args) {

        /**
         * Break and continue are loop control statements
         * 1)break:  break out of the loop
         * 2)continue: skips current iteration
         *
         */


        for (int i = 0; i < 10; i++) {
            if (i >= 5) {
                break;
            }
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {
            if (i >= 5) {
                continue;
            }
            System.out.println(i);
        }


    }
}

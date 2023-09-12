public class Reduce {

    public static void main(String[] args) {

        int n = 100;
        int count = 0;

        while (n > 0) {

            // Check if 2 divides n.
            if (n % 2 == 0) {

                // Divide n by 2 when n is even.
                n = n / 2;

            } else {

                // Decrease n by 1 when n is odd.
                n--;

            }

            // Increase count of steps by 1.
            count++;

        }

        // Print result.
        System.out.println("It takes " + count + " steps to reach 0 from 100.");

    }
}

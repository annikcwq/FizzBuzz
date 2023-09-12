public class Multiples {
    public static void main(String[] args) {

        int i = 1;
        int count = 0;

        while (i < 1000) {

            // Find out if numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Increment count by 1 if 3 or 5 divides 1.
            if (divisibleBy3 || divisibleBy5) {
                count++;
            }

        i++;

        }

        // Print result.
        System.out.println("There are " + count + " multiples of 3 or 5 under 1000.");

    }
}

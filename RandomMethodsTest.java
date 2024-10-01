import java.util.Random;

public class RandomMethodsTest {
    public static void main(String[] args) {
        // Create a Random object
        Random random = new Random();

        // 1. nextInt() - Returns a random integer
        System.out.println("Random integer: " + random.nextInt());

        // 2. nextInt(bound) - Returns a random integer between 0 (inclusive) and the specified bound (exclusive)
        System.out.println("Random integer (0 to 99): " + random.nextInt(100));

        // 3. nextDouble() - Returns a random double between 0.0 and 1.0
        System.out.println("Random double: " + random.nextDouble());

        // 4. nextFloat() - Returns a random float between 0.0 and 1.0
        System.out.println("Random float: " + random.nextFloat());

        // 5. nextLong() - Returns a random long value
        System.out.println("Random long: " + random.nextLong());

        // 6. nextBoolean() - Returns a random boolean value
        System.out.println("Random boolean: " + random.nextBoolean());

        // 7. nextGaussian() - Returns a random number with a Gaussian distribution (mean 0, standard deviation 1)
        System.out.println("Random Gaussian: " + random.nextGaussian());

        // 8. nextBytes() - Generates random bytes and stores them in a byte array
        byte[] byteArray = new byte[5];
        random.nextBytes(byteArray);
        System.out.print("Random bytes: ");
        for (byte b : byteArray) {
            System.out.print(b + " ");
        }
        System.out.println();

        // 9. setSeed() - Sets the seed of the random number generator
        random.setSeed(12345);
        System.out.println("Random integer after setting seed: " + random.nextInt(100));

        // 10. int() - Generates a stream of random integers
        System.out.println("Random integers (stream): ");
        random.ints(5, 0, 50).forEach(System.out::println);
    }
}

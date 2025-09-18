import java.util.Scanner;

public class DistanceMultiple {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ask how many times the program should run
        System.out.print("How many times should this program run? ");
        int numRuns = input.nextInt();
        input.nextLine();

        for (int i = 0; i < numRuns; i++) {
            System.out.print("Enter two points in the format (x1,y1)(x2,y2): ");
            String line = input.nextLine();

            // Create a scanner to parse the input line
            Scanner lineScanner = new Scanner(line);

            // Use delimiter to split on (, ), comma, or whitespace
            lineScanner.useDelimiter("[(),\\s]+");

            // Read coordinates
            double x1 = lineScanner.nextDouble();
            double y1 = lineScanner.nextDouble();
            double x2 = lineScanner.nextDouble();
            double y2 = lineScanner.nextDouble();

            // Calculate distance
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

            // Print result
            System.out.println("Found distance " + distance);

            lineScanner.close();
        }

        input.close();
    }
}

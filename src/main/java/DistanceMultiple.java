import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Ask how many inputs
        System.out.print("How many times should this program run?"");
        int numRuns = input.nextInt();
        input.nextLine(); // consume the leftover newline

        // 2. Loop through each pair
        for (int i = 0; i < numRuns; i++) {
            System.out.print("Enter two points in the format (x1,y1)(x2,y2): ");
            String line = input.nextLine();

            // 3. Use a scanner with a delimiter
            Scanner lineScanner = new Scanner(line);
            
            // Delimiter: split by (, ), comma, or space
            lineScanner.useDelimiter("[(),\\s]+");

            
            double x1 = lineScanner.nextDouble();
            double y1 = lineScanner.nextDouble();
            double x2 = lineScanner.nextDouble();
            double y2 = lineScanner.nextDouble();

            
            double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            lineScanner.close();
        }

        input.close();
    }
}

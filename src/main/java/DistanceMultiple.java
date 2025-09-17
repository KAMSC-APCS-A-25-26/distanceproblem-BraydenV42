/*
 * TODO: APCS-A Distance Program
 *
 * Write a program that:
 *  1. Asks the user how many inputs (pairs of points) they want to enter.
 *  2. For each input, prompt them to enter two points in the format:
 *         (x1,y1)(x2,y2)
 *     Example: (2,3)(7,3)
 *
 *  3. Use Scanner with a custom delimiter:
 *     This should ignore parentheses, commas, and spaces so only numbers remain.
 *
 *  4. Extract x1, y1, x2, y2 as doubles.
 *
 *  5. Compute the distance between the two points:
 *
 *  6. Print the results
 * 
 *  7. Repeat until all inputs have been processed.
 *
 * Example Inputs:
 *  How many inputs? 3
 *  Enter input 1 (like (x1,y1)(x2,y2)): (2,3)(7,3)
 *  Enter input 2 (like (x1,y1)(x2,y2)): (4,5)(8,8)
 *  Enter input 3 (like (x1,y1)(x2,y2)): (-1,-2)(0,7)
 *
 */

import java.util.Scanner;

public class DistanceMultiple
{
    public static void main(String[] args)
    {
        // Create scanner
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String coordinate1, coordinate2, x1, x2, y1, y2;
        int commaLoc, parenthese,  x, y, numRuns;
        double distance;

        // Prompt for number of runs
        System.out.println("How many times do you want to run this program?");
        numRuns = scanner.nextInt();

        // Set up a loop
        for(int i = 0; i < numRuns; i++)
        {
            // Prompt for coordinate one
            System.out.println("What is the first coordinate?");
            coordinate1 = scanner.next();

            // Prompt for coordinate two
            System.out.println("What is the second coordinate?");
            coordinate2 = scanner.next();

            // Find X1
            commaLoc = coordinate1.indexOf(",");
            parenthese = coordinate1.indexOf("(");
            x1 = coordinate1.substring(parenthese + 1, commaLoc);

            // Find Y1
            commaLoc = coordinate1.indexOf(",");
            parenthese = coordinate1.indexOf(")");
            y1 = coordinate1.substring(commaLoc + 1, parenthese);

            // Find X1
            commaLoc = coordinate2.indexOf(",");
            parenthese = coordinate2.indexOf("(");
            x2 = coordinate2.substring(parenthese + 1, commaLoc);

            // Find Y2
            commaLoc = coordinate2.indexOf(",");
            parenthese = coordinate2.indexOf(")");
            y2 = coordinate2.substring(commaLoc + 1, parenthese);

            // Find the distance between the two coordinates
            x = Integer.parseInt(x2) - Integer.parseInt(x1);
            y = Integer.parseInt(y2) - Integer.parseInt(y1);
            distance = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
            System.out.println("The distance between the two points is " + distance + ".");
        }
    }
}

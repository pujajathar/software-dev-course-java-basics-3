package org.example;
import java.util.Scanner;
public class LoopExercises {
    public int sum(int n) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        int total = 0;
        for ( int i = 1; i <= n; i++)
        {
            total = total + i;
        }
        return total;
    }

    public int sumUntilEven(int n1) {
        // Replace the line below with code that returns the sum of the numbers from 1 to n
        // but stops adding when the sum is even
        // (use a while loop with a sum variable and a counter variable)
        int sum = 0;
        int counter = 1;
        while (counter <= n1) {
            sum = sum + counter;
            if (sum % 2 == 0) {
            break;
        }
            counter++;
        }
        return sum;
    }
    public static void main(String[] args) {
        LoopExercises exercises = new LoopExercises();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.println("Sum of numbers from 1 to " + n + " is: " + (exercises.sum(n)));
        System.out.print("Enter number: ");
        int n1 = scanner.nextInt();
        System.out.println("Sum until Even is: " + exercises.sumUntilEven(n1));


    }
}

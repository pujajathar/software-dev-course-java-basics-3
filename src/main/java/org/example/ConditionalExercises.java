package org.example;
import java.util.Scanner;
public class ConditionalExercises {
    public boolean lessThanFive(int x) {
        // Replace the line below with code that returns true if x is less than 5, and false otherwise
        if (x < 5) return true;
        return false;
    }

    public String getAgeGroup(int age) {
        // Replace the line below with code that returns "child" if age is less than 13,
        // "teen" if age is less than 20, and "adult" otherwise
        // (use if, else if, and else)
        if (age < 13)  return "child";
         else if (age < 20) return "teen";
         else return "adult";
    }

    public boolean isValidPassword(String password) {
        int passwordLength = password.length();

        // Replace the line below with code that returns true if password is at least 8 characters long
        // and false otherwise
        // (use an if statement with an else block.)
        if (passwordLength >= 8) return true;
         else return false;
    }
    public static void main(String[] args) {
        ConditionalExercises exercise = new ConditionalExercises();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = scanner.nextInt();
        System.out.println("is " + x + " less than 5: " + exercise.lessThanFive(x));
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("You are a " + exercise.getAgeGroup(age) + "!");
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        System.out.println("Is password valid? " + exercise.isValidPassword(password));
    }
}

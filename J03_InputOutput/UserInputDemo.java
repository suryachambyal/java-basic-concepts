package J03_InputOutput;

import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {

        // Scanner object used for taking user input
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scn.nextLine();

        System.out.print("Enter your age: ");
        int age = scn.nextInt();

        // Displaying user information
        System.out.println("Welcome " + name);
        System.out.println("Your age is: " + age);

        scn.close();
    }
}
package emailapp;

import java.util.Scanner;

public class EmailApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //first name
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        
        //last name
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        // Create Emailusing input
        Email em1 = new Email(firstName, lastName);

        // Display email info
        System.out.println(em1.showInfo());
        scanner.close();
    }
}

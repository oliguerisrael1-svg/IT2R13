import java.util.Scanner;

public class FirstProblem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String userName = input.nextLine();

        System.out.print("Enter your age: ");
        int userAge = input.nextInt();

        System.out.print("Enter your weight: ");
        double userWeight = input.nextDouble();

        System.out.print("Enter your number: ");
        long userNumber = input.nextLong();

        System.out.println();
        System.out.println("----------- PROFILE SUMMARY -----------");
        System.out.println("Name: " + userName);
        System.out.println("Age: " + userAge);
        System.out.printf("Weight: %.2f kg\n", userWeight);
        System.out.println("Number: " + userNumber);

        input.close();
    }
}

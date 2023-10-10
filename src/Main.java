import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int)(Math.random() * 10) + 1;
        int guess = 0;
        boolean verify = false;

        System.out.println("Let's play a game.\nTry to guess my number!");
        do {
            System.out.println("Enter a number [1-10]");

            if (scanner.hasNextInt()) {
                guess = scanner.nextInt();

                if (guess <= 0 || guess > 10) {
                    System.out.println("Sorry, you're guess is invalid. Please try again.");
                    continue;
                }

                System.out.println("My number was " + randomNumber);
                if (guess < randomNumber) {
                    System.out.println("Your guess was too low.");
                } else if (guess > randomNumber) {
                    System.out.println("Your guess was too high.");
                } else {
                    System.out.println("Your guess was correct!");
                }

                verify = true;
            } else {
                System.out.println("Sorry, you're guess is invalid. Please try again.");
            }
            scanner.nextLine();
        } while (!verify);
    }
}
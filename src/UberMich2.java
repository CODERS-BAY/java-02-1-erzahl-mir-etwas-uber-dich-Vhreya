import java.util.Scanner;

public class UberMich2 {
    public static void main(String[] args) {

        Scanner scannerVariable = new Scanner(System.in);

        System.out.printf("%s%n", "What is you first name?");
        String firstName = scannerVariable.nextLine();

        System.out.printf("%s%n", "What is your last name?");
        String lastName = scannerVariable.nextLine();

        System.out.printf("%s%n", "How old are you?");
        int age = scannerVariable.nextInt();

        System.out.printf("%s%n", "Are you married?");
        boolean married = scannerVariable.nextBoolean();

        System.out.printf("%s%n", "What's your size in meters?");
        double size = scannerVariable.nextDouble();

        System.out.printf("Personal Data:%n First Name: %s%n Last Name: %s%n Age: %d%n Married: %b%n Size: %.2f%n", firstName, lastName, age, married, size);
    }
}

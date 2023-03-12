import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        String input = scanner.nextLine();
        int sum = 0;
        for (int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i)))
                sum += Character.getNumericValue(input.charAt(i));
        }
        System.out.println("Sum of all digits of " + input + " is: " + sum);
    }
}
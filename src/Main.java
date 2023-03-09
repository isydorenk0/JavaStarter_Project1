import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int input = scanner.nextInt();
        String inputStr = String.valueOf(input);
        int sum = 0;
        for (int i = 0; i < inputStr.length(); i++){
            sum += Character.getNumericValue(inputStr.charAt(i));
        }
        System.out.println("Sum of all digits of " + inputStr + " is: " + sum);
    }
}
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Calculator calculator = new Calculator();
        // Using Scanner for Getting Input from User
        Scanner in = new Scanner(System.in);

        String[] inputs;

        System.out.println("Enter a command:");

        while(true) {
            String s = in.nextLine();
            inputs = s.split("\\s+");

            switch(inputs[0]) {
                case "add":
                    System.out.println(calculator.add(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
                    break;
                case "subtract":
                    System.out.println(calculator.subtract(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
                    break;
                case "multiply":
                    System.out.println(calculator.multiply(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
                    break;
                case "divide":
                    System.out.println(calculator.divide(Integer.parseInt(inputs[1]), Integer.parseInt(inputs[2])));
                    break;
                case "fibonacci":
                    System.out.println(calculator.fibonacciNumberFinder(Integer.parseInt(inputs[1])));
                    break;
                case "binary":
                    System.out.println(calculator.intToBinaryNumber(Integer.parseInt(inputs[1])));
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }
    }
}

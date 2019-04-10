import java.util.Scanner;

public class KaitsCalc {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        char operator;
        double answer = 0.0;

        Scanner kDCalculator = new Scanner(System.in);

        System.out.println("What is your first number? ");
        num1 = kDCalculator.nextInt();
        System.out.println("What is your second number? ");
        num2 = kDCalculator.nextInt();
        System.out.println("What operation are you using? ");
        operator = kDCalculator.next().charAt(0);

        switch (operator) {

            case '+' : answer = num1 + num2;
            break;

            case '-' : answer = num1 - num2;
            break;

            case '*' : answer = num1 * num2;
            break;

            case '/' : answer = num1 / num2;
            break;


        }

        System.out.println(num1 + " " + operator + " " + num2 + " " + "=" + " " + answer);
    }
}

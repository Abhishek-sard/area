import java.util.Scanner;

public class java1 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number");
            double num1 = getValidNumber(scanner);

            System.out.println("Enter the second numbers");
            double num2 = getValidNumber(scanner);

            System.out.println("Enter operator (+,-,*,/):");
            char operator = scanner.next().charAt(0);

            double result;

            switch (operator) {
                case "+":
                 result = num1 + num2;
                    
                    break;
                case '-':
                result = num1-num2;
            
                
                    break;
            }
        }

    }
}

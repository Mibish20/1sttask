import java.util.Scanner;
public class arhe {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        System.out.println("Choose a operator:");
        String Op = sc.next();
        sc.close();
        switch (Op) {
            case "+":
            System.out.println("Result: " + (num1 + num2));
            break;
            case "-":
            System.out.println("Result: " + (num1 - num2));
            break;
            case "*":
            System.out.println("Result: " + (num1 * num2));
            break;
            case "/":
            System.out.println("Result: " + (num1 / num2));
            break;
        }
        
    }
}

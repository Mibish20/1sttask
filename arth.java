import java.util.Scanner;
public class arth {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = sc.nextInt();
        sc.close();
        int sum = num1+num2;
        int diff = num1-num2;
        int mul = num1*num2;
        int div = num1/num2;
        System.out.println("Sum: " + sum +"\n");        
        System.out.println("Difference: " + diff+"\n");        
        System.out.println("Product: " + mul+"\n");        
        System.out.println("Quotient: " + div+"\n");
    }
}

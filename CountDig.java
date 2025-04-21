import java.util.Scanner;

public class CountDig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        int count = 0;
        scanner.close();
        if (num == 0) {
            count = 1;
        } else {
            while (num != 0) {
                num /= 10;  
                count++;    
            }
        } 
        System.out.println("Number of digits: " + count);   
    }
}

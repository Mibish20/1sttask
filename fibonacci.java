import java.util.Scanner;
public class fibonacci {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        int a = 0, b = 1;
        scanner.close();
        for (int i = 1; i <= terms; i++) {
            System.out.print(a + " ");           
            int next = a + b;
            a=b;
            b= next;            
        }
     }
}

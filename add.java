import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter two numbers to add: ");
        int num = scanner.nextInt();
        int sum=0;
        scanner.close();
        for (int i=1;i<=num;i++){
            sum += i;
        }  
        System.out.println("Sum of the first " + num + " numbers is: " + sum);
     }

}
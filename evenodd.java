import java.util.Scanner;
public class evenodd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else{
            System.out.println("The number is odd.");
        }
    }
}

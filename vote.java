import java.util.Scanner;
public class vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else{
            System.out.println("You are underaged to vote");
        }

    }
}

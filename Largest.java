import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();
        if (num1 > num2 && num1 > num3){
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num1 && num2 > num3){
            System.out.println("The largest number is: " + num2);
        } else{
            System.out.println("The largest number is: " + num3);
        }
    }
}


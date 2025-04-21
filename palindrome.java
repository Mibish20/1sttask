import java.util.Scanner;
public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        int input = sc.nextInt();
        int orgi = input;
        int rev = 0;
        sc.close();
        while (input > 0){
            int dig = input % 10;
            rev = rev * 10 + dig;
            input = input / 10;
        }
        if (orgi == rev){
            System.out.println("It is palindrome");
        }else{
            System.out.println("It is not palindrome");
        }


    }
}

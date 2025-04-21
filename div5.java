import java.util.Scanner;
public class div5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        if (number % 5 == 0 && number % 11 ==0) {
            System.out.println(number + " is divisible by 5 and 11.");
    }else{
        System.out.println("It is not divisible by 5 and 11");
    }
    }
}
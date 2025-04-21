import java.util.Scanner;
public class inte {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        if (number>0){
            System.out.println("It is positive number");
        } else if (number<0){
            System.out.println("It is a negative number");
        } else{
            System.out.println("Number is Zero");
        }
    }
}

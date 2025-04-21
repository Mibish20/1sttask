import java.util.Scanner;
public class Perfectsq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        double sqrtNum = Math.sqrt(number);
        sc.close();
        if (sqrtNum * sqrtNum == number) {
            System.out.println(number + " is a perfect square.");
            
        }else{
            System.out.println(number + " is not a perfect square.");
        }
    }
    
}

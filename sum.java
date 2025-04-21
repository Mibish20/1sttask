import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numbers: ");
        int num = sc.nextInt();
        int sumn = 0;
        sc.close();
        for (int i = 1; i <= num; i++) {
            sumn +=i;
        }
        System.out.println("The sum is: " + sumn);

    }
}

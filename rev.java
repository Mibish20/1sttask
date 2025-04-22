import java.util.Scanner;
public class rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        int num = sc.nextInt();
        int rev =0;
        sc.close();
        while (num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit; 
            num /= 10;
        }

        System.out.println(rev);;;
        

     }         
}
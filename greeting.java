import java.util.Scanner;
public class greeting {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("what is your full name?");
        String fn ="";
        fn = sc.nextLine();
        sc.close();
        System.out.println("Hello, " + fn + "!");
    }
}
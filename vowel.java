import java.util.Scanner;
public class vowel {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        String letter = sc.nextLine();
        sc.close();
        switch (letter) {
            case "a": case "e": case "i": case "o": case "u":
            System.out.println(letter + " is a vowel.");
            break;
            default:
            System.out.println(letter + " is not a vowel.");
        }


    }
    
}

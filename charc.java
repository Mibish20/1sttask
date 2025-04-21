import java.util.Scanner;
public class charc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ic = sc.next().charAt(0);
        sc.close();
        if (ic == 'a' || ic == 'e' || ic == 'i' || ic == 'o' || ic == 'u'){
            System.out.println(ic + " is a vowel.");
        }else{
            System.out.println(ic + " is a consonant.");
        }
    }
}

import java.util.Scanner;
public class rev{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string");
        String str = sc.next();
        int length= str.length();
        String reversedString = "";
        sc.close();
        for (int i=length-1;i>=0;i--){
            reversedString +=str.charAt(i);
        }
        System.out.println(reversedString);

     }         
}
import java.util.Scanner;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.close();
        boolean primeflag = true;
        if (number==0 && number==1){
            System.out.println("1");
        }else{
            for (int i=2;i<number;i++){
                if (number % i == 0) {
                   primeflag = false;
                    break;

                }
            }
            if (primeflag){
                System.out.println(number + " is a prime number.");        
            } else {
                 System.out.println(number + " is not a prime number."); 
            }
        }

     }
        
 }    
    


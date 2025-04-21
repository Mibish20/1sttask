import java.util.Scanner;
public class result {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter mark of 5 subjects: ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        sc.close();
        int total = s1 + s2 + s3 + s4 + s5;
        double perc = total / 5.0;
        System.out.println("Total Marks: " + total + "\n"+"Percentage: " + perc + "%");
        if (perc >= 40 && perc < 50) {
            System.out.println("You have received a grade of D.");
        }else if (perc >= 50 && perc < 60) {
            System.out.println("You have received a grade of C.");
        }else if (perc >= 60 && perc < 70) {
            System.out.println("You have received a grade of B.");
        }else if (perc >= 70 && perc <= 100){
            System.out.println("You have received a grade of A.");
        }else if (perc > 100){
            System.out.println("Input error");
        }else{
            System.out.println("You have failed exam.");        
        }
    }
    
}

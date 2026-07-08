import java.util.Scanner;

public class Q_2__Counting_occurrences {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n=sc.nextInt();
        System.out.print("Enter the number of occurrences: ");
        int num=sc.nextInt();

        int count=0;
        while(n>0){
            int remainder=n%10;
            if(remainder==num){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}

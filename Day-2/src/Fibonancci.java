import java.util.Scanner;

public class Fibonancci {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Nth number: ");
        int n=sc.nextInt();

        int p=0,i=1,count=2;

        while(count<=n){
            int temp=i;
            i=i+p;
            p=temp;
            System.out.println(i);
            count++;
        }
        System.out.println("Your " +n+"th term is:" +i);
    }
}

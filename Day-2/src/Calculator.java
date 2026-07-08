import java.util.Scanner;

public class Calculator {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int n = sc.nextInt();
        System.out.print("Enter your operant(+,-,*,/): ");
        int op = sc.next().charAt(0);
        System.out.print("Enter your secound number: ");
        int n1=sc.nextInt();

        if(op=='+'){
            int result=n+n1;
            System.out.print("your ans is "+ result);
        }else if(op=='-'){
            int result=n-n1;
            System.out.print("your ans is "+ result);
        }else if(op=='*'){
            int result=n*n1;
            System.out.print("your ans is "+ result);
        }else if(op=='/'){
            int result=n/n1;
            System.out.print("your ans is"+ result);
        }else{
            System.out.println("Invalid input");
        }
    }
}

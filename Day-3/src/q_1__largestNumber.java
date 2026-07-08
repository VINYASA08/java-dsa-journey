// WAC to find the largestg numebr.
import java.util.Scanner;

public class q_1__largestNumber {
    static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = num.nextInt();
        System.out.println("Enter second number: ");
        int num2 = num.nextInt();
        System.out.println("Enter third number: ");
        int num3 = num.nextInt();

        if(num1>num2 && num1>num3){
            System.out.print("The largest number is: " + num1);
        }else if(num2>num1 && num2>num3){
            System.out.print("The largest number is: " + num2);
        }
        else if(num3>num1 && num3>num2){
            System.out.println("The largest number is: " + num3);
        }


        //short cut to solve

        int max=Math.max(num3,Math.max(num1,num2));
        System.out.println("The largest number is: " + max+ "  using short cut");
    }
}

import java.util.Scanner;

//Problem - 1:
//Write a Java program that contains a function named isEven(int n). This function must take a single integer as an argument and return a boolean value (true if the number is even, and false otherwise). Call this function inside your main method with multiple test numbers (such as positive numbers, negative numbers, and zero) to print and verify the output.
//
//Key Concepts Tested: Method definition, parameter passing, and return types.
public class Prob_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       System.out.print("Enter a number: ");
       int num = input.nextInt();
       String result=isEven(num);
       System.out.println(result);
    }

    static String isEven(int n){
        return n%2==0?"True":"False";
    }
}

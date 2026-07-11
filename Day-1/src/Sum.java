import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        double num1=input.nextDouble();
        double num2=input.nextDouble();

        double sum=num1+num2 ;
        System.out.println(sum);
    }
}

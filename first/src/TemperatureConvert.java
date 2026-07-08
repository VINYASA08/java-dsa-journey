import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inter 1 to convert celsius to fahranheit and 2 fro fahranheit to celsius");
        int option = input.nextInt();
        if(option == 1){
            System.out.print("Enter temperature in Celsius: ");
            double celsius = input.nextDouble();
            double result = celsius * 1.8 + 32;
            System.out.println("Converted celsius to fro fahranheit is: " + result);
        }
        else if(option == 2){
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double rel2 = (fahrenheit - 32)/1.8;
            float rel3=(float) rel2;
            System.out.println("Converted fahrenheit to celsius is: " + rel3);
        }
        else{
            System.out.println("Invalid option");
        }


    }
}

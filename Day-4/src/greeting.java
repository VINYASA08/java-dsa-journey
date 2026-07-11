import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        String mess=greeting(name);
        System.out.println(mess);
    }

    static String greeting(String naam){
        String greeting = "Good Morning,"+naam;
        return greeting;
    }
}

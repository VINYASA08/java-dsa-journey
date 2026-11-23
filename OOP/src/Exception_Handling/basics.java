package Exception_Handling;

public class basics {

    static void main(String[] args) {

        try {
            int a =10;
            int b = 0;
            System.out.println(a/b);
        }
        catch (ArithmeticException e){
            System.out.println("cannot divide by zero(0)");
            System.out.println(e);   //Returns exception
            System.out.println(e.getMessage());  //Returns exception message
        }
        finally {
            System.out.println("program full complied");
        }
    }

}

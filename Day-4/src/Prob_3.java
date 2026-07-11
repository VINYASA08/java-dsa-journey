//Problem - 3:
//Create a Java class to implement flexible summation handling using two distinct features:
//
//Write a method named calculateSum that uses Variable Arguments (Varargs) to accept any number of integers (zero or more) dynamically, loops through them, and returns their total sum.
//
//Perform Method Overloading by creating a second version of calculateSum. To avoid signature conflicts (since Java treats varargs as arrays under the hood), design this overloaded version to accept a identifying descriptive String label along with a standard integer array int[] numbers, computing and returning the total sum.
//
//Test both methods inside the main method by passing variable lists of numbers to the varargs version and a constructed array to the overloaded version.
//
//Key Concepts Tested: Varargs syntax, method overloading rules, and array processing.
public class Prob_3 {
    static void main(String[] args) {
        int varargsSum = calculateSum(5, 10, 15, 20);
        System.out.println("Varargs Sum: " + varargsSum);

        int[] myNumbers = {10, 20, 30};
        int arraySum = calculateSum("My Array Total", myNumbers);
        System.out.println("Array Sum: " + arraySum);
    }
    static int calculateSum(int ...v){
        int sum=0;
        for (int num : v) {
            sum += num;
        }
        return sum;
    }

    static int calculateSum(String lablr,int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
}

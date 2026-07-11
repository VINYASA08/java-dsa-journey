//Problem - 2:
//Create a Java class that defines a member variable (instance variable) named int x = 10;.
//Inside a method of this class:
//
//Define a local variable with the exact same name: int x = 20;. Print the value of x to see which variable takes priority.
//
//Open a block scope using a loop (for example, for(int i = 0; i < 1; i++)). Inside this loop block, declare a block-level variable int blockX = 30; and print its value.
//
//Write code within the method to print the original instance variable value (10) while the local variable is still active.
//
//Key Concepts Tested: Local scope vs. class scope, block isolation, and variable shadowing resolution.
public  class Prob_2 {
    static int x = 20;
    static void main(String[] args) {
        int result=vari();
        System.out.println(result);
        for (int i=0;i<1;i++) {
            int blockX = 30;
            System.out.println(blockX);
        }
    }

    static int vari(){
        x=10;
        return x;
    }
}


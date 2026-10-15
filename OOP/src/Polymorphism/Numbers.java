package Polymorphism;

public class Numbers {
    int sum(int a, int b){
        return a + b;
    }

    int sum(int a, int b,int c){
        return a + b +c;
    }

    int sum(int a, int b,int c,int d){
        return a + b +c+d;
    }

    static void main(String[] args) {
        Numbers obj = new Numbers();
        obj.sum(2,3);
        obj.sum(2,3,4);
        obj.sum(2,3,5,6);
    }


}

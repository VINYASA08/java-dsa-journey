package staticExample;


import java.util.Arrays;

public class InnerClasses {


    static class test{
        String name;
        public test(String name){
            this.name=name;
        }
    }

    static void main(String[] args) {

        System.out.println(Arrays.toString(new int[]{1,2,3,5}));

        test a = new test("vinod kumar");
        test b = new test("kunal");

        System.out.println(a.name);
        System.out.println(b.name);

        System.out.println(a);
    }
}

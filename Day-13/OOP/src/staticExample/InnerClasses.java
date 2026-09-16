package staticExample;

class test{
    String name;
    public test(String name){
        this.name=name;
    }
}
public class InnerClasses {


    static void main(String[] args) {
        test a = new test("vinod kumar");
        test b = new test("kunal");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}

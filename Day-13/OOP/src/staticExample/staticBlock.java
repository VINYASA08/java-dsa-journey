package staticExample;

//this is a demo to show initalisation of static variavle
public class staticBlock {
    static int a=4;
    static int b;

    static {
        System.out.println("i am in static bloack");
        b=a*3;
    }

    public static void main(String[] args) {
        staticBlock obj= new staticBlock();
        System.out.println(staticBlock.a+","+staticBlock.b);
    }
}

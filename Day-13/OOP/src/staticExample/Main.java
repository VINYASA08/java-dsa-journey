package staticExample;

public class Main {
    public static void main(String[] args) {
        Human vinodKumar =new Human("vinod kumar",20,50000,false);
        Human rahul = new Human("rahul",19,30000,false);
        Human kunal = new Human("kunal",19,30000,false);

        Main funn = new Main();
        funn.fun2();

    }

    // this is now dependent on objects
     static void fun(){

        //you can not access non static stuff without referenceing their instance in
         //a static context
        Main obj = new Main();
        obj.greeting();//you can not use this because it required an instance
        //but this function you are  using it in does noe depend on instance
    }

    void fun2(){
        greeting();
    }

    //we know that is something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello World");
    }
}

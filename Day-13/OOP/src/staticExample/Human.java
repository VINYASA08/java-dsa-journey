package staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean isMarried;
   static long population;

    public Human(String name,int age, int salary,boolean isMarried){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.isMarried=isMarried;
        Human.population  +=1;
    }
}

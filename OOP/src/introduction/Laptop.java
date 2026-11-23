public class Laptop {

    String brand;
    int price;

    public Laptop(String brand , int price){
        this.brand=brand;
        this.price=price;
    }



    void display(){
        System.out.println("the "+brand+" have laptop price :"+price);
    }
}


public void main(){
    Laptop l1 = new Laptop("lenovo",75000);
    Laptop l2 =  new Laptop("samsung",68000);

    Laptop l3;

    l3=l1;

    l3.brand = "Idea";

    l1.display();
    l2.display();
}

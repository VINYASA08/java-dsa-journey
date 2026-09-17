package Inheritance;

public class Main {
    static void main(String[] args) {
        Box box1 = new Box(4);
        Box box2 = new Box(10,20,30);

        System.out.println(box1.l + ","+ box1.w+","+ box1.h);
        System.out.println(box2.l + ","+ box2.w+","+ box2.h);

        newWeightBox box3 = new newWeightBox();
        newWeightBox box4= new newWeightBox(1,2,3,4);


        System.out.println(box4.h +","+ box4.weight);

        Box box5 = new newWeightBox(1,2,3,40);
        System.out.println(box5.w);

        newBoxPrice box6 = new newBoxPrice();
        newBoxPrice box7 = new newBoxPrice(2,25,30);
        System.out.println(box6.h);

    }
}


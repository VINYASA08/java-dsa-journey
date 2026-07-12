import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class arrayList
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList <Integer> list = new ArrayList<>(10);
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
//        list.add(6);
//        System.out.println(list.contains(2));
//        list.remove(1);
//        System.out.println(list.contains(2));
//        System.out.println(list);


        //input
        for (int j = 0; j < 5; j++){
            list.add(sc.nextInt());
        }

        for (Integer integer : list) {
            out.println(integer);
        }
    }
}

public class loops {
<<<<<<< HEAD
    static void main(String[] args) {

        //for loop working
        for(int i=0;i<5;i+=1) {
            for(int j=0;j<=i;j+=1) {
                System.out.print("*");
            }
            System.out.println();
        }



        //while loop working
        int num=0;
        while(num<5) {
            System.out.println("i = " + num);
            num++;
        }


        //do-while loop working
        int num2=0;
        do {
            System.out.println(num2);
            num2++;
        }while(num2<5);
=======
    public static void main(String[] args) {
        int i;
        int a = 1;
        int b = 1;
        if (a == b){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
        }
        int count = 3;
        while (count !=6) {
            System.out.println(count);
            count++;
        }

        for( i=0;i<5;i++) {
            System.out.println(i);
        }
>>>>>>> 31c97c015723054f6530e13c530edee2428e973d
    }
}

package Interface;

public class basicExample {

    interface Vehicle{
        void start();
    }

    class car implements Vehicle{

        @Override
        public void start(){
            System.out.println("Car start with a card");
        }
    }

    class bick implements Vehicle{

        @Override
        public void start(){
            System.out.println("Bick start with a Key");
        }
    }

    void main(){

        Vehicle v1 = new car();
        v1.start();
        Vehicle v2 = new bick();
        v2.start();
    }
}

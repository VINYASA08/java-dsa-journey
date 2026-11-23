package Abstract;

public class expm {

    abstract class area {
        abstract void size();
    }

    class square extends area {

        @Override
        void size(){
            System.out.println("enter side of square");
        }
    }

    class circle extends area {

        @Override
        void size(){
            System.out.println("enter radius of circle");
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

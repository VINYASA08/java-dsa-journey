package Abstract;

public class Ab {

    abstract class abstract1{
       abstract void shap();
    }


    class use extends abstract1{
        @Override
        void shap(){
            System.out.println("none! shap");
        }
    }
}

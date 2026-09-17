package Inheritance;

public class boxColor extends newWeightBox{

    String color;

    boxColor(){
        this.color="none";
    }

    boxColor(String color){
        this.color=color;
    }

    boxColor(newWeightBox weight, String color){
        super(weight);
        this.color=color;
    }

}

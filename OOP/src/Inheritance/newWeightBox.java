package Inheritance;

public class newWeightBox extends Box {
    double weight;

    public newWeightBox(){
        this.weight = -1;
    }

    public newWeightBox(double side,double weight){
        super(side);
        this.weight = -1;
    }

    public newWeightBox(double l ,double h , double w ,double weight){
        super(l,h,w);
        this.weight = weight;
    }

    newWeightBox(newWeightBox other){
        super(other);
        weight = other.weight;
    }
}


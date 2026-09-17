package Inheritance;

public class newBoxPrice extends newWeightBox {
    double cost;

    newBoxPrice(){
        super();
        this.cost = -1;
    }

    newBoxPrice(newBoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    newBoxPrice(double l, double b, double w ,double weight,double cost){
        super(l,b,w,weight);
        this.cost=cost;
    }

    newBoxPrice(double side,double weight,double cost){
        super(side,weight);
        this.cost=cost;
    }
}

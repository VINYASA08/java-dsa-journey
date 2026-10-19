package Stack;

public class dynamicStack extends Stacks {
    public dynamicStack(){
        super();//it will call Stack()--that have no argument
    }

    public dynamicStack(int size){
        super(size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){

            //creat new stack of double the size
            int[] temp = new int[data.length * 2];


            //copy all old itms
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }

            data=temp;
        }

        return super.push(item);
    }
}

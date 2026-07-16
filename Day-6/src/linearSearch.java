//linear search algorithm
public class linearSearch {
    public static void main(String[] args) {

        int[] myArray = new int[] {1,2,3,4,5,6,7,8,9,10};
        int Target= 5;

        for(int i = 0; i < myArray.length; i++){
            if(Target == myArray[i]){
                System.out.println(myArray[i]);
                break;
            }
        }

        System.out.println(searching(myArray,10));
    }

    static int searching(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i+1;
            }
        }
        return -1;
    }
}



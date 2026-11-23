package Encapsulation;

public class exmp {
    private int marks;

    void setMarks(int marks){
        if(marks >= 0 && marks <= 100){
            this.marks=marks;
            System.out.println("Marks is set to "+marks);
            return;
        }
        System.out.println("invalid marks");
    }
}

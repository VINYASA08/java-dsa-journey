package introduction;

public class Understanding {
    public static void main(String[] args) {
        Student vinod = new Student("vinod kumar", 196, 85.41f, "cse-core");
    }

    static class Student {
        String name;
        int roll;
        float marks;
        String branch;

        Student() {
            name = "unknown";
            roll = 0;
            marks = 0.0f;
            branch = "unknown";
        }

        Student(String name, int roll, float marks, String branch) {
            this.name = name;
            this.roll = roll;
            this.marks = marks;
            this.branch = branch;
            this.result(this.name, this.roll, this.marks, this.branch);
        }

        void result(String name, int roll, float marks, String branch) {
            System.out.println("Student " + name + " roll number: " + roll +
                    " is from branch " + branch + " having marks " + marks);
        }
    }
}
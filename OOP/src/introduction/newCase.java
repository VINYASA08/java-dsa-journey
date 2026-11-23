package introduction;

public class newCase {

    static class Person{
        Person(String name){
            System.out.println("name "+name);
        }
    }

   static class Student extends Person{
        Student(String name , int rollNo){
            super(name);
            System.out.println("roll no : "+rollNo);
        }
    }

    static class CollegeStudent extends Student{
        CollegeStudent(String name , int rollNo,String college){
            super(name, rollNo);
            System.out.println("college is "+college);
        }
    }


    static void main(String[] args) {
        CollegeStudent obj = new CollegeStudent("Vinod kumar",101,"PIET");
    }
}


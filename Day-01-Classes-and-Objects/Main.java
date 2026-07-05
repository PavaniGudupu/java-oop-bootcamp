class Student {
    int id;
    String name;
}

public class Main {
    public static void main(String args[]) {

        Student obj = new Student();

        obj.id = 101;
        obj.name = "Pavani";

        System.out.println("Student Details:");
        System.out.println(obj.id);
        System.out.println(obj.name);
    }
}
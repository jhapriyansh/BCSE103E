// 5 Aug
class Student {
    public String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
}

public class Arrays_In_Java_Pt2 {
    public static void main(String[] args) {
        Student[] myStudents = new Student[] { new Student("Dharma"), new Student("Sanvi"), new Student("Rupa"),
                new Student("Ajay"), new Student("Test") };
        for (Student m : myStudents) {
            System.out.println(m);
        }
    }
}

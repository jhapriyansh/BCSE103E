// 31 July
class Student {
    public int roll_no;
    public String name;

    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Objects_In_Java {
    public static void main(String[] args) {
        Student[] arr = new Student[5];
        arr[0] = new Student(1, "Amit");
        arr[1] = new Student(2, "Vaibhav");
        arr[2] = new Student(3, "Dharmesh");
        arr[3] = new Student(4, "Mohit");
        arr[4] = new Student(5, "Rohit");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Name: " + arr[i].name + "\nRoll No: " + arr[i].roll_no + "\n");
        }
    }
}

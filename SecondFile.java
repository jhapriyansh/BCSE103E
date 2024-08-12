// 12 Aug
// Needs MainFile.java to run
public class SecondFile {
    public static void main(String[] args) {
        Student o1 = new Student();
        System.out.println("Name: " + o1.fname);
        System.out.println("Age: " + o1.age);
        System.out.println("Graduation Year: " + o1.graduationYear);
        o1.study();
    }
}

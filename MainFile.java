// 12 Aug
// Needs SecondFile.java to run.
abstract class MainFile {
    public String fname = "John";
    public int age = 24;

    public abstract void study();
}

class Student extends MainFile {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("Studying all day long.");
    }
}

// 7 Aug
// Needs MultiClasses2.java to function
public class MultClasses1 {
    int x = 10;
    final int y = 15; 
    public static void main(String[] args) {
        MultClasses2 myObj = new MultClasses2();
        MultClasses1 myObj2 = new MultClasses1();
        myObj.x = 4; // Modifiable Value... Not encouraged
        myObj2.x = 4; // Modifiable Value... Not encouraged
        // myObj2.y = 4; // This value can't be modified.
        System.out.println(myObj.x);
        System.out.println(myObj2.x);
        System.out.println(myObj2.y);
    }
}

public class Vari_Example
{
public static void main(String[] args)
{
String name = "John";
// final int num = 34;
// trying to change a final variable leads to error.
int num = 34;
System.out.println("Name: "+name);
System.out.println("Number: "+num);
num = 45;
System.out.println("Updated Number: "+num);
}
}

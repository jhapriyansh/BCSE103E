public class Type_Conversion{
	public static void main(String[] args){
		int num = 9;
		float number = num;
		// Widening type cast.
		System.out.println(num);
		System.out.println(number);
		double number2 = 9.87d;
		int num2 = (int)number2;
		// Narrowing type cast.
		System.out.println(number2);
		System.out.println(num2);
	}
}

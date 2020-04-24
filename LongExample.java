
public class LongExample {
	public static void main(String[] agrs) {
		long num1 = 100; // 
		long num2 = 20L;
		long num3 = 100000000000L;
		
		int num4 = Integer.MAX_VALUE; // 2147483647
		int num5 = 10;
		int num4 = 2147483647; // -2147483637
		if (num4 <= Integer.MAX_VALUE - num5) {
			int result = num4 + num5;
		System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");
		}
		
		int num6, num7;
		num6 = 1000000000;
		num7 = 1000;
		
		result = num6 * num7;
		
		if (num6 <= Integer.MAX_VALUE / num7 ) {
			int result = num6 * num7;
			System.out.println("result: " + result);
		} else {
			System.out.println("overflow maxvalue");
		}
	}
}
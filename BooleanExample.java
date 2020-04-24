public class BooleanExample {
	public static void main(String[] args) {
			boolean isTrue = false; // true
			isTrue = true;
			
			int num1, num2;
			num1 = 19;
			num2 = 29;
			byte b1 = 10;
			int num4 = b1;
			b1 = (byte) num4;
			
			isTrue = num2 > num1; //
			
			if(isTrue) {
				System.out.println("num2 is larger than num1");
			} else {
				System.out.println("num1 is larger than num2");
			}
	}
}
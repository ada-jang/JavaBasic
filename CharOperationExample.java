public class CharOperationExample {
    public static void main(String[]args) {
        int v1 = 5;
        int v2 = 2;

        int result = v1 / v2; // 2
        double result1 = (double) v1 / v2; // 2.5
        System.out.println(result1);

        result = sum(10, 15);
        System.out.println("result: " + result);
    }
    
    public static int sum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}
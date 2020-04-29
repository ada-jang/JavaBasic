
public class MethodExample1 {
    public static void main(String[] args) {
        // printDouble(10, 5);
        // System.out.println("result: " + sum(10, 20));
        // System.out.println("result: " + sum(10, 20, 30));
        // System.out.println("result: " + sum(10.5, 20.3));
        // System.out.println("1 ~ 5 합: " + toSum(1, 5));

        // printStar (1, 3); // 3번 실행
        // System.out.println("========");
        // printStar(1, 5); // 5번 실행
        // System.out.println("========");
        // printDouble(3, 7);
        // printGugudan(1~9);
    }
    // void 반환 X
    public static void main(String[] args) {
        printString("5, Hello");
    }

    // public static void printGugudan(int dan) {
    //    for (int i = 1; i <= 18 i++) {
    //        System.out.println(": " + (i * 2));
    //    }
    // }

    public static void printString(String str, String name) {
        System.out.println(str + ", " + name);
    }

    public static void printStar(int a, String str) {
        for (int i = 1; i <= a; i++) {
            System.out.println(str);
        }
    }

    public static void printDouble(int a, int b) {
        System.out.println("정수의 2배: " + (a * b));
    }

    public static void printStar(int a) {
        for (int i = 1; i <= a; i++)
            System.out.println("*****");
    }

    public static void printStar(int a, int b) {
        // 정수인 1과 5를 변수에 넣음
        for (int i = a; i <= b; i++) // i가 b보다 작거나 같을 때까지 5번 실행
            System.out.println("*****"); // "*****" 출력
    }

    public static int toSum(int num1, int num2) {
        int sum = 0;
        for (int i = num1; i <= num2; i++) {
            sum += i; // sum = sum + i;
        }
        return sum;
    }

    public static int sum(int a, int b) {
        int sum = 0;
        sum = a + b;
        return sum;
    }

    public static int sum(double c, double d) {
        double sum = 0;
        sum = c + d;
        return 0;
    }

    public static int sum(int a, int b, int c) {
        int sum = 0;
        sum = a + b + c;
        return sum;
    }
}

public class ForSumExample {
    public static void main(String[] args) {
        // 1..100까지
        // 3의 배수
        int sum = 0;
        for(int i = 0; i <= 100; i++) {
            if (i % 3 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 3의 배수의 합: " + sum);
    }
}

public class WhileExample {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum = sum + 1;
        }        

        // while 사용
        int i = 1;
        while (1 <= 5) {
            sum = sum + i;
            i++;
        }
        System.out.println("sum1: " + sum);

        // while ...
        i = 1;
        sum = 0;
        while (true) {
            sum = sum + i;
            if (i > 5) {
                break;
            }
            i++;
        }
        System.out.println("sum2: " + sum);

        // 홀수만 더해서 8
        while (1 <= 8) {
            sum = sum + i;
            i++;
        }
    }

}

public class ForAndForExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            System.out.println("단: " + i);
            for (int j = 1; j <= 9; j++) {
                // 2 * 1 = 2
                // 2 * 2 = 4
                System.out.println(i + " * " + j + " = " + (i - j) );
            }
        }
    }


}
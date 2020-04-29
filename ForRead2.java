
public class ForRead2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            // 2 또는 3의 배수
            if((i % 2==0) && (i % 3 == 0)) {
            System.out.println("2 와 3의 공통 배수입니다." + i);
                }
            else if((i % 2==0) || (i % 3==0)) {
            System.out.println("2 또는 3의 배수: " + i);
            }
        }
        System.out.println("end of program");
    }
}
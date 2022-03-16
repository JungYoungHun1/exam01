package ch04;

public class ForTest3 {
    public static void main(String[] args) {
        int name = 10;
        for (int i = 2; i < name; i++) {
            for (int j = 1; j < name; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            if (i < 9) {
                System.out.println("--------------");

            }
        }
    }
}

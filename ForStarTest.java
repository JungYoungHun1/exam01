package ch04;

public class ForStarTest {
    public static void main(String[] args) {
        int star = (int) (Math.random() * 5) + 2;
        System.out.println(star + "단");
        for (int x = 0; x < star; x++) {
            for(int j =0;j<star;j++){
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}


package ch04;

public class Coffee {
    public static void main(String[] args) {
        int cof = (int) (Math.random() * 4) + 1;
        if (cof<5) {
            for (int i=0;i<10;i++) {
                System.out.println(cof + "번 당첨 축하드립니다 커피 잘 마실게요 ^~^");
            }
        }
    }
}

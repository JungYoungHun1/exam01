package ch04;

public class ForTest {
    public static void main(String[] args) {

        int dan = (int)(Math.random()*8)+2;
        System.out.println(dan+"단");
        for(int i=1;i<=9;i++){
            System.out.println(dan+"*" + i + "=" + dan * i);
        }

        System.out.println(dan+"단");
        for(int i=10;i<=18;i++){
            System.out.println(dan+"*" + (i-9) + "=" + dan * (i-9));
        }
        /*
        int star = (int) (Math.random() * 9 + 2);
        if (star = 2) {
            for (int i = 0; i < 2; i++) {
                System.out.println("*");
            }
        }
        if (star = 4) {
            for (int i = 0; i < 4; i++) {
                System.out.println("*");
            }
        }
        int star = (int) (Math.random() * 9 + 2);
        System.out.println("star : " + star);
        //for(int i =0;i<star;i++){
        //    System.out.print("*");
        //}
        //System.out.println();
        //for(int i = star; i>0; i--){
        //    System.out.print("*");
        //}
        for(int i = star+34; i>34; i--){
            System.out.print("*");
        }*/

    }
}

package ch04;

public class ForStarTest2 {
    public static void main(String[] args){
        int star = (int) (Math.random() * 5) + 2;
        System.out.println(star + "단");
        for (int x = 1; x <=star; x++) {
            for(int j=x;j<star;j++) {
                System.out.printf(" ");
            }
            for(int z=0;z<x;z++){
                System.out.printf("*");
            }


            System.out.println();
        }

        /*
        for (int x = 0; x < star; x++) {
            for(int j =star;j>x;j--){
                System.out.printf("*");
            }
            System.out.println();
        }*/
    }
}

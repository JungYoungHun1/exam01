package ch04;

import java.util.Scanner;

public class WhileTest {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력하세요(정지 : 0) : ");
        int age = scan.nextInt();
        int sum=0;
        sum+=age;

        while(age!=0){
            System.out.print("숫자를 입력하세요(정지 : 0) : ");
            age = scan.nextInt();
            sum+=age;
        }
        System.out.println("더한 수 : " + sum);



    }
}

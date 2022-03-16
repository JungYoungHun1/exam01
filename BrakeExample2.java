package ch04;

public class BrakeExample2 {
    public static void main(String[] args){
        OUT_FOR:
        for(int i=0;i<10;i++){
            for(int z=100;z<110;z++){
                if(z==103){
                    break; //안쪽 for문만 break
                }
                System.out.printf("%d-%d\n",i,z);
            }
        }
        OUT_FOR: //레이블 (for문에 이름을 붙임)
        for(int i=0;i<10;i++){
            for(int z=100;z<110;z++){
                if(z==103){
                    break OUT_FOR; //바깥 for문까지 break
                }
                System.out.printf("%d-%d\n",i,z);
            }
        }
    }
}

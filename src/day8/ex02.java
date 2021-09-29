package day8;
import java.util.Random;

public class ex02 {
    public static void main(String[] args){
        Random rand = new Random(System.currentTimeMillis());
        int [][] random=new int[5][20];
        for(int i=0;i<5;i++) {
            for (int j = 0; j < 20; j++)
            {
                random[i][j]=rand.nextInt(10);
                System.out.print(random[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        for(int c=0;c<10;c++){
            int count=0;
            for(int i=0;i<5;i++) {
                for (int j = 0; j < 20; j++) {
                    if(c==random[i][j]) count++;
                }
            }
            System.out.print(c+"개수");
            for(int i=0;i<count;i++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

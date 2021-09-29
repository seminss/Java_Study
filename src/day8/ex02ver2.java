package day8;
import java.util.Random;

public class ex02ver2 {
    public static void main(String[] args){
        Random rand=new Random();
        int[] number=new int[100];
        int[] counter=new int[10];

        for(int i=0;i<number.length;i++){
            number[i]=rand.nextInt(10);
            System.out.print(number[i]);
            if(i%20==19) System.out.println();
        }
        System.out.println();
        for(int i=0;i<number.length;i++)
            counter[number[i]]++;
        printGraph(counter);
    }
    public static void printGraph(int[] c){
        for(int i=0;i<c.length;i++){
            System.out.print(i+"개수");
            for(int j=0;j<c[i];j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

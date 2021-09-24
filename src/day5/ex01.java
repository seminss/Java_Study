package day5;

//행렬x와 행렬y의 합을 구하는 메소드와 행렬을 출력하는 메소드를 멤버로 하는
//        Matrix 클래스가 있다. 다음과 같이 주어진 Ex1 클래스와 결과 내용을 참고하
//        여 Matrix 클래스를 작성하시오.

public class ex01 {
    public static void main(String[] args){
        int[][] a={{1,2,3},{4,5,6,}};
        int[][] b={{6,3,4},{5,1,2}};
        int[][] c= new int[2][3];

        Matrix mx = new Matrix();
        System.out.println("행렬 a");
        mx.printMatrix(a);
        System.out.println("행렬 b");
        mx.printMatrix(b);
        System.out.println("행렬 c");
        mx.addMatrix(a,b,c);
        mx.printMatrix(c);
    }
}
class Matrix{
    public void printMatrix(int m[][]){
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++)
                System.out.print(m[i][j]+" ");
            System.out.println("");
        }
    }
    public void addMatrix(int[][] a, int[][] b, int[][] c){
        for(int i=0;i<2;i++) {
            for (int j = 0; j < 3; j++)
                c[i][j] = a[i][j] + b[i][j];
        }
    }
}

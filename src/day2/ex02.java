package day2;

//구구단을 다음 보기와 같이 출력이 되도록
//        이중 for문을 통해 프로그램을 작성하시오

public class ex02 {
    public static void main(String[] args){
        for(int i=2;i<=9;++i){
            for(int j=1;j<=i;++j){
                System.out.print(i+"x"+j+"="+i*j+"\t");
            }
            System.out.println("");
        }
    }
}

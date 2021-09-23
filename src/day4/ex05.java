package day4;

//클래스 ExId를 설명과 같이 작성하시오. 인스턴스를 생성할 때마다 식별번호를
//        n씩 증가시켜서 부여한다.(n은 양의 정수) n값은 지정하지 않으면 1로 설정하
//        고 메서드를 통해서 확인 및 변경할 수 있다. 예를 들어 인스턴스를 2개 생성한
//        후에 n을 3으로 변경한 경우, 다시 인스턴스를 2개 생성한다. 이때 인스턴스에
//        부여하는 식별 번호는 생성된 순으로 1, 2, 5, 8이 된다.

public class ex05 {
    public static void main(String args[]){
        ExId a = new ExId(); //1
        ExId b = new ExId(); //2
        ExId.setStep(3);
        ExId c = new ExId(); //5
        ExId d = new ExId(); //8

        System.out.println("a의 식별 번호 : "+a.getId());
        System.out.println("b의 식별 번호 : "+b.getId());
        System.out.println("c의 식별 번호 : "+c.getId());
        System.out.println("d의 식별 번호 : "+d.getId());
        ExId.setStep(1);
        int max= ExId.getMaxId();
        System.out.println("마지막 부여한 식별 번호 : "+max);
        System.out.println("다음에 부여할 식별 번호 : "+(max+ExId.getStep()));
    }
}
class ExId{
    private static int step=1;
    private int ID=0;
    private static int mID=0;

    public ExId(){
        mID=mID+step;
        ID=mID;
    }
    public static void setStep(int n){
        step=n;
    }
    public static int getStep(){
        return step;
    }
    public int getId(){
        return ID;
    }
    public static int getMaxId(){
        return mID;
    }
}
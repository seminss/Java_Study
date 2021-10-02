package day9;

public class ex03 {
    public static void main(String[] args){
        Integer[] ArrayOne={1,2,3,4,5};
        Double[] ArrayTwo={3.0,4.0,1.5,2.5,1.5};
        Long[] ArrayThree={7L, 8L, 9L, 10L};

        System.out.println(getAverage(ArrayOne));
        System.out.println(getAverage(ArrayTwo));
        System.out.println(getAverage(ArrayThree));
    }
    public static <T extends Number> double getAverage(T[] arr){
        double sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i].doubleValue(); //이게 모지?
        }
        return sum/arr.length;
    }
}

package day3;

public class ex02 {
    public static void main(String[] args) {
        Song song = new Song(1978, "스웨덴", "ABBA", "Dancing Queen");
        song.show();
    }
}
class Song{
    private String Title, artist, country;
    private int year;
//    String Title, artist, country;
//    int year;

    public Song(int y, String c, String a, String t){
        Title=t; artist=a; country=c; year=y;
    }
    public void show(){
        System.out.println(year+"년 "+country+" 국적의 "+artist+"가 부른 "+"Title");
    }
}
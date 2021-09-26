package day7;

interface Player{
    public void play();
    public void stop();
}
interface ExPlayer extends Player{
    public void slow();
}
class DVDPlayer implements ExPlayer{
    @Override
    public void play(){
        System.out.println("DVD 재생 시작!");
    }
    @Override
    public void stop(){
        System.out.println("DVD 재생 종료!");
    }
    @Override
    public void slow(){
        System.out.println("DVD 느린 재생 시작!");
    }
}
public class ex01 {
    public static void main(String[] args){
        DVDPlayer d = new DVDPlayer();
        Player p = new DVDPlayer();
        ExPlayer e =new DVDPlayer();

        System.out.println("*** DVDPlayer 형 변수 d ***");
        d.play();
        d.stop();
        d.slow();

        System.out.println("*** Player형 변수 p ***");
        p.play();
        p.stop();

        System.out.println("*** EXPlayer형 변수 e ***");
        e.play();
        e.stop();
        e.slow();
    }
}

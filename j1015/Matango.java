package j1015;

public class Matango {
    int hp;
    final int LEVEL=10;
    char suffix;
    Hero hero=new Hero();

    public void run(){
        System.out.println("お化けキノコ"+this.suffix+"は逃げ出した");
    }
    public void selfHarm(){
        int num=new java.util.Random().nextInt(100)+1;
        if(num>=1 && num<=70){
            hero.hp-=15;
            System.out.println(hero.hp);
        }else{
            System.out.println(this.suffix+"は訳もわからず自分を攻撃した");
        }
    }
}

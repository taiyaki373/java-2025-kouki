package j1015;

public class Mian {
    public static void main(String[] args) {
        Hero hero=new Hero(); //勇者が生まれる(インスタンス)
        hero.name="ポンタ";    //勇者の名前設定
        hero.hp=100;          //勇者の名前設定
        // hero.sleep();
        hero.sit(10);

        // Matango matango=new Matango();
        // matango.hp=50;
        // System.out.println("マタンゴのHPは"+matango.hp);
    }
}

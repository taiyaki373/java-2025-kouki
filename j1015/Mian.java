package j1015;

public class Mian {
    public static void main(String[] args) {
        Hero hero=new Hero(); //勇者が生まれる(インスタンス)
        // hero:インスタンス、オブジェクト、実態
        hero.name="ポンタ";    //勇者の名前設定
        hero.hp=100;          //勇者の名前設定

        Hero earth=new Hero();
        earth.name="ゴー☆ジャス";
        earth.hp=30;

        Matango matango1=new Matango();
        matango1.hp=50;
        matango1.suffix='A';

        Matango matango2=new Matango();
        matango2.hp=50;
        matango2.suffix='B';

        // 冒険の始まり
        // hero.slip();
        // matango1.run();
        
        // hero.run();
        earth.confusion();
        matango2.selfHarm();

    }
}

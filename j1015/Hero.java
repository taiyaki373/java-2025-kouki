package j1015;

public class Hero {
    String name;    //名前保存用
    int hp;         //体力保存用
    //操作
    public void attack() {
        //具体的な処理は後で
    };
    public void sleep(){
        //自分自身のhpフィールドを100にする
        this.hp=100;
        System.out.println(this.name+"は眠ってHPが回復した");
    };
    public void sit(int sec){
        this.hp+=sec;
            System.out.println(this.name+"は"+sec+"秒座った");
            System.out.println("HPが"+sec+"ポイント回復した");
            System.out.println("現在のHPは"+this.hp);
    };
    public void slip(){
        final int DAMAGE=15;
        this.hp-=15;
        System.out.println(this.name+"は転んだ");
        System.out.println(DAMAGE+"のダメージ！");
        System.out.println("現在のHPは"+this.hp);
    };

    public void run(){
        System.out.println(this.name+"は逃げ出した");
        System.out.println("GAMEOVER");
        System.out.println("最終HPは"+this.hp+"でした");
    };

    public void confusion(){
        System.out.println("パパがIT企業の社長じゃないなんて…\r\n" + 
                        "パパは牛乳屋…ぱぽぷあにゅうや？\r\n"+ 
                        "パプアニューギニア\r\n" +"\r\n"+ 
                        "そーれっ!ここパプアニューギニア"+"\r\n"+"\r\n"+"訳わかんねぇだろ！");
    }

}

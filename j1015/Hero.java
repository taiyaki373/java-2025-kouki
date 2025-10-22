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

    };
    public void slip(){
        
    };

    public void run(){

    };


}
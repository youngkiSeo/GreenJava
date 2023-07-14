package com.green.java.ch14;


public class fightabletest {

    public static void run(Fightable f){
    f.punch();

    }

    public static void main(String[] args) {

        //익명클래스를 객체화
        streetfighter sf = new streetfighter();
        run(sf);

        run(new Fightable() {
            @Override
            public void punch() {

            }
        });

        Fightable f1 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("ㅇㅇㅇㅇ");
            }
        };
    }
}
class streetfighter implements Fightable{

    @Override
    public void punch(){
        System.out.println("주먹을 날린다");
    }
}

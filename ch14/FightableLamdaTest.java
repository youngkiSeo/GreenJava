package com.green.java.ch14;

public class FightableLamdaTest {
    public static void run(Fightable f){
        f.punch();
    }


    public static void main(String[] args) {

        Fightable f1 = () -> {
            System.out.println("하이");
        };
        run(f1);

        Fightable f2 = new Fightable() {
            @Override
            public void punch() {
                System.out.println("ㅇㅇㅇㅇ");
            }
        };
        run(f2);

    }
}

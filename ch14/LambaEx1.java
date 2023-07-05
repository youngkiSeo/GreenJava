package com.green.java.ch14;
@FunctionalInterface
interface MyFunction{
    void run();
}
interface MyFunction2{
    int run(int a , int b);
}

public class LambaEx1 {
    static void execute(MyFunction f){

        f.run();

    }
    private static MyFunction getmyFunction() {

        MyFunction result = ()->{
            System.out.println("mf");
        };
        return result;
    }

    private static MyFunction2 getmyFunction2() {
        MyFunction2 result = (a,b)-> a + b;
        return result;
    }



    public static void main(String[] args){
        MyFunction mf = getmyFunction();
        mf.run();
        execute(mf);

        MyFunction2 mf2 = getmyFunction2();
        int result = mf2.run(10,20);
        System.out.println(result);


    }
}

package com.green.java.ch14;

public class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList mList = new MyArrayList();

        for (int i = 100; i <=200; i++) {
            mList.add(i);
        }

        final int[] num = {0};
        mList.forEach( (item) -> {
            num[0] += item;
        });
        System.out.println(num[0]);

        final IntBox box = new IntBox();
        mList.forEach(item -> {box.plus(item);});
        System.out.println(box.getSum());

        mList.forEach(item -> {box.plus2(item);});
        System.out.println(box.getSum2());

        mList.forEach(item ->
                {
                    if (item % 2 == 0) {
                        box.plus(item *2);
                    } else
                        box.plus(item);
                }
                );
        System.out.println(box.getSum());







    }
}
class IntBox{
    private int sum;
    private int sum2;

    public int getSum2() {
        return sum2;
    }

    public int getSum() {
        return sum;
    }

    public void plus(int num){

        this.sum += num;

    }

    public void plus2(int sum2){
        if (sum2 % 2 == 0 ){
            this.sum2 += sum2;
        }

    }


}

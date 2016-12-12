package com.eli.future_task;

import java.util.concurrent.Callable;

/**
 * Created by zhouyilin on 2016/12/11.
 */
public class Changgong implements Callable<Integer> {
    private int hours = 12;
    private int amount;

    public Integer call() throws Exception {

        while (hours > 0){
            System.out.println("I'm working......");
            amount++;
            hours--;
            Thread.sleep(1000);
        }

        return amount;
    }
}

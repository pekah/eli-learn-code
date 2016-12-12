package com.eli.future_task;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by zhouyilin on 2016/12/11.
 */
public class Dizhu {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Changgong changgong = new Changgong();
        FutureTask<Integer> futureTask = new FutureTask<Integer>(changgong);
        new Thread(futureTask).start();

        while (!futureTask.isDone()){
            try {
                System.out.println("看长工做完了没...");
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        int amount = futureTask.get();
        System.out.println("工作做完了,上交了"+amount);

    }
}

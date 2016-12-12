package com.eli.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by zhouyilin on 2016/12/11.
 */
public class TestTask implements Callable<Boolean> {

    public Boolean call() throws Exception {
        System.out.println("10秒钟开始了");
        Thread.sleep(3000);
        System.out.println("10秒钟结束了");
        return true;
    }

    public static void main(String[] args) throws Exception{
        System.out.println("--------开始做晚饭--------");
        System.out.println("开始炖猪脚～～～");
        System.out.println("--------猪脚下锅--------");

        FutureTask<Boolean> futureTask = new FutureTask<Boolean>(new TestTask());
        Thread thread = new Thread(futureTask);
        thread.start();

        Thread.sleep(1000);
        System.out.println("--------淘米--------");
        Thread.sleep(1000);
        System.out.println("--------洗菜--------");
        Thread.sleep(1000);
        System.out.println("--------刷牙--------");
        Thread.sleep(1000);
        System.out.println("--------抠脚--------");
        //如果猪脚炖好了
        if(futureTask.get()==true){
            System.out.println("--------继续炒菜--------");
        }
    }
}

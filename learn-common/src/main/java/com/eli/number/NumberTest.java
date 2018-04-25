package com.eli.number;

/**
 * Created by elizhou on 2017/7/17.
 */
public class NumberTest {
    public static void main(String[] args) throws Exception{
        int i = Integer.MAX_VALUE;
        System.out.println(i);


        System.out.println(new NumberTest().getCode(0, 2, 4, 3, 5, 6, 2, 4, 5));




    }


    /**
     * 比如入参是1, 2, 3, 5
     * 返回1123500000
     *
     * @param args 长度最大为9
     * @return 以1开头，将入参以次拼成一串整数，最多10位数
     * @throws Exception
     */
    public int getCode(int... args) throws Exception{
        if(args.length > 9){
            throw new Exception("最多只支持9位");
        }

        double code = Math.pow(10, 9);//首位从1开头
        int exponent = 8;//指数，n次方

        for(int arg : args){
            code += Math.pow(10, exponent) * arg;
            exponent--;
        }

        return (int)code;
    }
}

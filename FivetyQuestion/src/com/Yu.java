package com;
/*
判断任意正整数是否为2的整数次方倍
 */
import java.util.Scanner;
public class Yu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();//接收数据
        Yu yu=new Yu();
        String i=yu.print(x);//调用yu对象的print方法，传入键盘输入数据并获取结果
        System.out.println("整数"+x+"是否是2的整数次方倍："+i);
    }

    public String print(int i) {
        return(0 == ((i - 1) & i))?"是":"否";
    }
}
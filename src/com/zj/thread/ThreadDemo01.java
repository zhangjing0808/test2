package com.zj.thread;

/**
 * 线程实现
 *  继承Thread父类
 *  实现Runnable接口
 */
public class ThreadDemo01 {
    public static void main(String[] args) {
//        MyThread t1 = new MyThread("a");
//        MyThread t2 = new MyThread("b");
//
//        //线程启动是通过start()
//        t1.start();
//        t2.start();

        MyRunnable r1 = new MyRunnable("c");
        MyRunnable r2 = new MyRunnable("d");
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}

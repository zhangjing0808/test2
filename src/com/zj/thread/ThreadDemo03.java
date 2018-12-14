package com.zj.thread;

/**
 * 线程常用方法
 */
class RunnableDemo implements Runnable {
    private String name;

    public RunnableDemo(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
//            try {
//                Thread.sleep(1000);
//            }catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(name + ":" + i);
            if (i == 10) {
                System.out.println("礼让");
                Thread.yield();
            }
//            System.out.println("当前线程对象:" + Thread.currentThread().getName());
        }
    }
}
public class ThreadDemo03 {
    public static void main(String[] args) {
        RunnableDemo r1 = new RunnableDemo("a");
        Thread t1 = new Thread(r1);
        System.out.println(t1.isAlive());//判断线程是否启动
        t1.start();
//        for (int i = 0; i < 50; i++) {
//            if (i > 10) {
//                try {
//                    t1.join();
//                }catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//            System.out.println("主线程："+ i);
//        }
//        System.out.println(t1.isAlive());


        RunnableDemo r2 = new RunnableDemo("b");
        Thread t2 = new Thread(r2);
        t2.start();

    }
}

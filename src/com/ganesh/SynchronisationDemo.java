package com.ganesh;

public class SynchronisationDemo {

    public static void main(String[] args) {


        MyThread m1=new MyThread();
        MyThread m2=new MyThread();
        MyThread m3=new MyThread();
        MyThread m4=new MyThread();

        m1.setName("Ganesh");
        m2.setName("Kartik");
        m3.setName("Ankit");
        m4.setName("Ashu");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
    }
}


class MyThread extends Thread{

    @Override
    public void run() {

        // To get the current thread 
        System.out.print("Thread entered into run() and Going to sleep.");



        Thread.sleep(4000);

        System.out.print("");



    }

    printMe(){



    }


}
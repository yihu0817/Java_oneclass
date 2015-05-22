package com.scxh.java.ex027.thread.product_consumer;

public class ProducerConsumer {
    /**
     * @param args
     */
    public static void main(String[] args) {        
        ProductBox pb = new ProductBox();
        Producer p = new Producer(pb);
        Consumer c = new Consumer(pb);
        
        Thread pThread = new Thread(p);
        Thread cThread = new Thread(c);
     
        pThread.setPriority(Thread.MAX_PRIORITY);
        
        pThread.start();
        cThread.start();
    }

}
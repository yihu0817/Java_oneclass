package com.scxh.java.ex027.thread.product_consumer;

/**
 * 消费者
 */
class Consumer implements Runnable {

    ProductBox productbox = null;
    
    public Consumer(ProductBox productbox) {
        this.productbox = productbox;
    }

    public void run() {
        for (int i=0; i<10; i++) {
            Product p = productbox.pop();
            System.out.println("客户购买第" + p+ "个面包");
            
            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
package com.scxh.java.ex027.thread.product_consumer;

/**
 * 生产者
 */
class Producer implements Runnable {

    ProductBox productbox = null;
    
    public Producer(ProductBox productbox) {
        this.productbox = productbox;
    }

    public void run() {
        for (int i=0; i<10; i++) {
            Product p = new Product(i+1);
            productbox.push(p);
            System.out.println("面包师生产第 " + p+ " 面包");
            
            try {
                Thread.sleep((int)(Math.random() * 200));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
}
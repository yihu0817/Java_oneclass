package com.scxh.java.ex027.thread.product_consumer;


///**
// * 产品盒对象
// */
//class ProductBox {
//
////    Product[] productbox = new Product[6];  //可以放6个面包的面包盒
//    
//	int maxBoxLength = 6;
//    ArrayList<Product> productbox  = new  ArrayList<Product>();
//    
//    int index = 0;
//  
//    /**
//     * 生产面包放面包盒
//     * @param p
//     */
//    public synchronized void push(Product p) {
//        while (index == maxBoxLength) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        notify();        
//        productbox.add(p);
//        index ++;
//    }
//    /**
//     * 消费者从面包盒取面包
//     * @return
//     */
//    public synchronized Product pop() {
//        while (index == 0) {
//            try {
//                this.wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//        this.notify();
//        index --;
//        int randIndex = (int)(Math.random()*index);
////        System.out.println("randIndex  :"+randIndex);
//        return productbox.remove(randIndex);
//        
//    }
//}


/**
 * 产品盒对象
 */
class ProductBox {

    Product[] productbox = new Product[6];  //可以放6个面包的面包盒
    
    
    int index = 0;
  
    /**
     * 生产面包放面包盒
     * @param p
     */
    public synchronized void push(Product p) {
        while (index == productbox.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();        
        productbox[index] = p;
        index ++;
    }
    /**
     * 消费者从面包盒取面包
     * @return
     */
    public synchronized Product pop() {
        while (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        index --;
        return productbox[index];
        
    }
}
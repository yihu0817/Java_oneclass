package com.scxh.java.ex027.thread.product_consumer;

/**
 * 产品对象
 */
class Product {
    int id;

    public Product(int id) {
        this.id = id;
    }
    
    public String toString(){
        return "" + id;
    }
}


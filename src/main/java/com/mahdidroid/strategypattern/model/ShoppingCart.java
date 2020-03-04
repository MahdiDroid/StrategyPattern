package com.mahdidroid.strategypattern.model;

import com.mahdidroid.strategypattern.services.Payment;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingCart {

    List<Product> products ;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(Product product){
        products.remove(product);
    }

    public int calculateCost(){
        int sum = 0;
        for (Product product:products){
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment paymentStrategy){
        int amount = calculateCost();
        paymentStrategy.pay(amount);

    }

}

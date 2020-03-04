package com.mahdidroid.strategypattern;

import com.mahdidroid.strategypattern.model.CreditCardAlgorithm;
import com.mahdidroid.strategypattern.model.PaypalAlgorithm;
import com.mahdidroid.strategypattern.model.Product;
import com.mahdidroid.strategypattern.model.ShoppingCart;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StrategypatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategypatternApplication.class, args);
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("123",11));
        shoppingCart.addProduct(new Product("1789",55));
        shoppingCart.addProduct(new Product("889",44));

        shoppingCart.pay(new CreditCardAlgorithm("pop","60379914"));
        shoppingCart.pay(new PaypalAlgorithm("mehdi@gmail.com","6678"));





    }

}

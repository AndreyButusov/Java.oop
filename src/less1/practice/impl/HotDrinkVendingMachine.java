package less1.practice.impl;

import less1.practice.Product;
import less1.practice.impl.HotDrink;
import less1.practice.VendingMachine;

import java.time.LocalDate;
import java.util.List;

public class HotDrinkVendingMachine extends VendingMachine {


    public HotDrinkVendingMachine() {
        super();
    }

    public HotDrinkVendingMachine(List<Product> products) {
        super(products);
    }

    public Product getProduct(int name, int volume, int temper) {
        for (Product product : products) {
            if (product.getName().equals(name) && product.getName().equals(volume) && product.getName().equals(temper)) {
                products.remove(product);
                return product;
            }
        }
        System.out.println("Продукт не найден: " + name);
        return null;
    }

    @Override
    public void addProducts(List<Product> Products) {
        this.products.addAll(Products);
    }
}

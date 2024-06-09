package less1.practice.impl;

import less1.practice.Product;
import less1.practice.VendingMachine;

import java.time.LocalDate;
import java.util.List;

public class HotDrink extends Product {

    private int temper;

    public HotDrink(String name, double price, LocalDate releaseDate) {
        super(name, price, releaseDate);
        this.temper = 50;
    }

    public HotDrink(String name, double price, LocalDate releaseDate, int temper) {
        super(name, price, releaseDate);
        this.temper = temper;
    }

    public int getTemper() {
        return temper;
    }

    public String toString() {
        return "BHotDrink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", releaseDate=" + releaseDate +
                "temper=" + temper +
                '}';
    }
}

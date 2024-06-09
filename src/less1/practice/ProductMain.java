package less1.practice;

import less1.practice.impl.BottleOfWater;
import less1.practice.impl.EPackage;
import less1.practice.impl.HotDrink;
import less1.practice.impl.HotDrinkVendingMachine;
import less1.practice.impl.WaterVendingMachine;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {
        Product bottle1 = new BottleOfWater("Rodnik", 55, LocalDate.of(2024, 5, 1));

        Product bottle2 = new BottleOfWater("Rodnik Gaz", 55, LocalDate.of(2024, 5, 1),
                true, EPackage.GLASS.getMaterial(), 0.5F);

        Product hProduct1 = new HotDrink("Coffee N", 100, LocalDate.of(2024, 6, 1), 50);

        Product hProduct2 = new HotDrink("Coffee B", 120, LocalDate.of(2024, 6, 2), 55);

        Product hProduct3 = new HotDrink("Coffee A", 140, LocalDate.of(2024, 6, 3), 53);

        VendingMachine vm = new WaterVendingMachine();

        VendingMachine vm1 = new HotDrinkVendingMachine();

        System.out.println(vm.getProducts());

        vm.addProducts(List.of(bottle1, bottle1, bottle1, bottle2, bottle2, bottle2));

        vm1.addProducts(new ArrayList<>());
        vm1.addProducts(List.of(hProduct1, hProduct3, hProduct2, hProduct1, hProduct2));

        System.out.println(vm1.getProducts());

        //vm.getProduct("Родники");

        //System.out.println(vm.getProducts());
    }
}

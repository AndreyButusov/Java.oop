import java.util.List;

public class program {

    public static void main(String[] args) {

        Human Buyer1 = new Human("Саша");
        Human Buyer2 = new Human("Оля");
        Human Buyer3 = new Human("Петя");
        Human Buyer4 = new Human("Ваня");
        Human Buyer5 = new Human("Юля");

        Market Market = new Market();

        Market.acceptToMarket(List.of(Buyer1, Buyer2, Buyer3, Buyer4));

        Market.giveOrders(Buyer1, List.of(EProduct.Apple, EProduct.Meat, EProduct.Fish));
        Market.giveOrders(Buyer2, List.of(EProduct.Apple, EProduct.Meat, EProduct.Fish, EProduct.Cheese));
        Market.giveOrder(Buyer3, EProduct.Chocolate);
        Market.giveOrder(Buyer4, EProduct.Water);

        Market.releaseFromMarket(Buyer1);
        Market.releaseFromMarket(Buyer2);

        Market.acceptToMarket(Buyer1);
        Market.releaseFromMarket(Buyer1);

        Market.acceptToMarket(Buyer5);
        Market.giveOrder(Buyer5, EProduct.Fish);

        Market.releaseFromMarket();
        
    }
}
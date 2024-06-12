import java.util.ArrayList;
import java.util.List;

// Реализовать класс Market и
// все методы, которые он
// обязан реализовывать.
// Методы из интерфейса
// QueueBehaviour, имитируют
// работу очереди,
// MarketBehaviour – помещает и
// удаляет человека из очереди,
// метод update – обновляет
// состояние магазина
// (принимает и отдает заказы)

public class Market implements MarketBehaviour, QueueBehaviour {

    private List<Human> actors = new ArrayList<Human>();

    private List<Human> actorsAtOffice = new ArrayList<Human>();

    private int tempBuy = 0;

    public void acceptToMarket(Human actor) {   // входит в магазин
        if (!actors.contains(actor)) {
            actors.add(actor);
            System.out.printf("%s вошёл в магазин.\n", actor.getName());
        } 
        else {
            System.out.printf("%s уже в магазине.\n", actor.getName());
        }
        update();
    }

    public void acceptToMarket(List<Human> group) { // группа входит в магазин
        for (Human actor : group) {
            actors.add(actor);
        }
        System.out.println("Группа покупателей вошла в магазин.");
        update();
    }

    @Override
    public void releaseFromMarket(Human actor) {    // выход из магазина
        int nameActor = actors.indexOf(actor);
        actors.remove(nameActor);
        System.out.printf("%s вышёл из магазина.\n", actor.getName());
        update();
    }

    public void releaseFromMarket() {               // выход из магазина
        List<Human> temp = new ArrayList<>();
        for (Human human : actors) {
            if (human.isTakeOrder()) {
                System.out.printf("%s вышёл из магазина, совершив покупку.\n", human.getName());
                temp.add(human);
            } else if(!human.isMakeOrder()){
                System.out.printf("%s вышёл из магазина, не совершив покупку.\n", human.getName());
                temp.add(human);
            }
        }
        actors.removeAll(temp);
        update();
    }

    @Override
    public void update() {
        while (actorsAtOffice.size() > 0) {
            while (actorsAtOffice.size() > 0) {
                takeOrders();
                tempBuy++;
            }
        }
        System.out.printf("STATUS: %d покупок совершено, в магазине %d посетителя(-ей).\n", tempBuy, actors.size());
    }

    @Override
    public void giveOrders(Human actor, List<EProduct> products) { // сделать покупку / добавить продукты в корзину
        if (actor.isMakeOrder()) {
            System.out.printf("%s добавил товар в корзину.\n", actor.getName());
        }else{
            System.out.printf("%s сделал покупки.\n", actor.getName());
            tempBuy++;
        }
        int namActor = actors.indexOf(actor);
        Human tempActor = actors.remove(namActor);
        tempActor.saveOrder(products);
        actors.add(tempActor);
    }

    public void giveOrder(Human actor, EProduct product) { // сделать покупку / добавить продукт в корзину
        if (actor.isMakeOrder()) {
            System.out.printf("%s дополнил корзину.\n", actor.getName());
        }else{
            System.out.printf("%s сделал покупку.\n", actor.getName());
            tempBuy++;
        }
        int namActor = actors.indexOf(actor);
        Human tempActor = actors.remove(namActor);
        tempActor.saveOrder(product);
        actors.add(tempActor);
    }

    @Override
    public void releaseFromQueue(Human actor) {// выход из очереди
        System.out.printf("%s вышел из очереди ничего не купив.\n", actor.getName());
        int nameActor = actors.indexOf(actor);
        actorsAtOffice.remove(nameActor);
    }

    public void releaseFromQueue() {// выход из очереди последнего
        System.out.printf("%s вышел из очереди ничего не купив.\n", actors.get(0).getName());
        actorsAtOffice.remove(0);
        
    }

    @Override
    public void takeInQueue(Human actor) {// вход в очередь
        System.out.printf("%s встал в очередь.\n", actor.getName());
        if (actor.isMakeOrder()) {
            actorsAtOffice.add(actor);
        }
    }

    @Override
    public void takeOrders() {// берём первый заказ из списка и удалить его
        Human actorWithOrder = actorsAtOffice.remove(0);
        System.out.printf("%s сделал покупку и вышел из очереди.\n", actorWithOrder.getName());
        actorWithOrder.setTakeOrder(true);
    }

    public int countActors(){ // кол-во покупателей в магазине
        return actors.size();
    }
}
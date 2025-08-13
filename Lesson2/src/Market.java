import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> queue = new ArrayList<>();




    @Override
    public void acceptToMarket(Actor actor) {
        System.out.println(actor +" зашёл в магазин");
        actor.setTakeOrder(false);
        actor.setMakeOrder(false);
        takeInqueue(actor);

    }

    @Override
    public void releaseFromMarket(List<Actor> actorList) {
        this.queue = actorList;
        for (Actor actor : this.queue){//после первого прогона for крашится, не понимаю почему
            if (actor.isTakeOrder == true){
                actorList.remove(actor);
                System.out.println(actor.getName()+" покинул магазин");

            }
        }

    }

    @Override
    public void update() {
        giveOrder();
        takeOrder();
        releaseFromQueue();


    }

    @Override
    public void takeInqueue(Actor actor) {
        this.queue.add(actor);
        System.out.println(actor.getName() + " встал в очередь");
        System.out.println("Текущая очередь");
        for (Actor ac : this.queue){
            System.out.println(ac);
        }

    }

    @Override
    public void takeOrder() {
        for (Actor actor : this.queue){
            if (actor.isMakeOrder == false){
                actor.setMakeOrder(true);
            }
        }
        System.out.println("Заказы сделаны");


    }

    @Override
    public void giveOrder() {
        for (Actor actor : this.queue){
            if (actor.isMakeOrder == true){
                actor.setTakeOrder(true);
            }
        }
        System.out.println("Заказы выданы");
        releaseFromQueue();

    }

    @Override
    public void releaseFromQueue() {
        System.out.println("Получившие заказы покинули очередь");
        releaseFromMarket(this.queue);
    }
}

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new HotDrinks("Чай", 50, 70));
        list.add(new HotDrinks("Чай", 50, 80));
        list.add(new HotDrinks("Чай", 50, 90));
        list.add(new HotDrinks("Кофе", 100, 70));
        list.add(new HotDrinks("Кофе", 100, 80));
        list.add(new HotDrinks("Кофе", 100, 90));
        System.out.println("К заказу доступны следующие позиции:");
        for (Product product : list){
            System.out.println(product);
        }
        HotDrinksVendingMachine HDMachine = new HotDrinksVendingMachine(list);
        System.out.println("Выбран заказ:");
        Product order = HDMachine.getProduct("Чай", 80);
        System.out.println(order);
        System.out.println("Заказ выдан на сумму:");
        System.out.println(order.getPrice()+ " рублей");
    }
}
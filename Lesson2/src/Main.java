import java.io.Console;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void action(Market market) {
        System.out.println("Добавить человека в очередь(1) или обновить магазин(2)?");
        Scanner sc = new Scanner(System.in);
        Console console = System.console();
        int chek = sc.nextInt();
        if (chek == 1) {
            System.out.println("Введите имя посетителя: ");
            //String actorName = sc.nextLine(); почему-то не читает, а сразу выполняет код дальше
            String actorName = console.readLine();
            Human actor = new Human(actorName);

            market.acceptToMarket(actor);
        } else {
            if (chek == 2){
            market.update();
            System.out.println("Магазин обновлён");
            }
        }
        action(market);
    }
        public static void main(String[] args) {


            Market market = new Market();
            action(market);

        }
}
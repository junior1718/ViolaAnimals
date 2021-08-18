
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("""
                Привет, Виолетта!
                Это интерактивная программа-игра,
                где ты познакомишься с удивительным миром животных!)
                Не забывай кормить животных, чтобы они не ушли!
                                
                Для начала игры введи "start"
                $\040""");


        while (!sc.nextLine().equalsIgnoreCase("start")) System.out.print("Для начала игры введи \"start\"\n$ ");
            System.out.println("Игра начинается...\n\n");


        int days = 1;
        while (true) {
            System.out.println("\n\n\nДень " + days + "\n");
            System.out.println("Статус дня:\n"+Zoo.getStatus() + "\n");
            Command.printGreetings(days);
            try {
                while (!Command.readCommand(sc.nextLine())) {
                    System.out.print("""

                            В твоём распоряжении есть несколько команд. Введи help для получения списка команд.
                            $\040""");
                }
                }
            catch (Exception e) { break; }
            Zoo.endDay();
            days++;
        }
    }
}

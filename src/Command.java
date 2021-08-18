import Animals.*;

import java.util.Scanner;

public class Command {

    static void printGreetings(int days) {
        if (days == 1) System.out.println("Поздравляю! Ты стала владельцем мини-зоопарка.");
        System.out.print("""
                В твоём распоряжении есть несколько команд. Введи help для получения списка команд.
                $\s""");
    }

    static void printCommands() {
        System.out.println("""
                Служебные команды:
                help: вывод доступных команд
                info: информация о состоянии зоопарка и его жителях
                
                Команды, после которых начнётся следующий день:
                add: добавить животное
                delete: безжалостно выбросить бедное животное
                food: накормить выбранное животное
                water: напоить выбранное животное
                exit: выход из игры""");
    }

    static boolean readCommand(String command) throws Exception {
        boolean flag = false;
        switch (command) {
            case "help" -> {
                printCommands();
                return false;
            }
            case "info" -> {
                System.out.println(Zoo.printInfo());
                return false;
            }
            case "add" -> {
                System.out.println(Zoo.addAnimal(createAnimal()));
                return true;
            }
            case "delete" -> {
                System.out.println(Zoo.deleteAnimal());
                return true;
            }
            case "food" -> {
                System.out.println(Zoo.foodAnimal());
                return true;
            }
            case "water" -> {
                System.out.println(Zoo.waterAnimal());
                return true;
            }
            case "exit" -> throw new Exception("Игра завершена!");
        }
        System.out.print("Такой команды не найдено, попробуй ещё раз\n$ ");
        return false;
    }

    private static Animal createAnimal() {
        System.out.print("Введи тип животного [кошка, собака, крыса, тигр]\n$ ");
        String id = new Scanner(System.in).nextLine();
        System.out.print("Введи имя/кличку животного (нельзя давать разным животным одинаковые клички)\n$ ");
        String name = new Scanner(System.in).nextLine();

        if (id.equalsIgnoreCase("тигр")) return new Tiger(name);
        if (id.equalsIgnoreCase("кошка")) return new Cat(name);
        if (id.equalsIgnoreCase("собака")) return new Dog(name);
        if (id.equalsIgnoreCase("крыса")) return new Rat(name);
        else {
            System.out.println("Такого типа нет! Введи тип ещё раз[кошка, собака, крыса, тигр]\n" +
                    "$ ");
            return createAnimal();
        }
    }
}

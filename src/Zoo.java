import Animals.Animal;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Zoo {
    private static HashMap<String, Animal> animals;

    static String getStatus() {
        if (animals == null) {
            animals = new HashMap<>();
            return "В твоём зоопарке нет животных";
        }
        else {
            if (animals.size() > 0)
                if (animals.size() < 2) return "Один тоже в поле воин! Пусть этот кысапыс будет рад :)";
                else if (animals.size() < 4) return ("Ты собрала классную dream-team! И тебе есть, куда расти :)");
                    else return ("Воу-воу, вот это действительно большой зоопарк!");
            else return "Хмм. Как-то животных не осталось...";
        }
    }

    static String printInfo() {
        StringBuilder result = new StringBuilder(("Размер зоопарка: " + animals.size() + "\n"));
        if (animals.size() > 0) {
            List<Animal> animalsValue = new ArrayList<>(animals.values());
            for (Animal animal : animalsValue) {
                result.append(animal.getInfo());
            }
        }
        return result.toString();
    }

    public static String addAnimal(Animal an) {
        try {
            animals.put(an.getName(), an);
        } catch (Exception e) {
            return "Что-то пошло не так";
        }

        return "Животное успешно добавлено";
    }

    public static String deleteAnimal(){
        System.out.print("Введи имя/кличку животного\n$ ");
        Animal animal;

        try {
            animal = animals.get(new Scanner(System.in).nextLine());
            animals.remove(animal.getName());
        } catch (Exception e) {
            return "Что-то пошло не так. Скорее всего, имени животного нет в списке";
        }

        return animal.getName() + " - успешно удалено из зоопарка";
    }

    public static @NotNull
    String foodAnimal() {
        System.out.print("Введи имя/кличку животного\n$ ");
        animals.get(new Scanner(System.in).nextLine()).addFood();
        return "Кормление выполнено";
    }

    public static @NotNull
    String waterAnimal() {
        System.out.print("Введи имя/кличку животного\n$ ");
        animals.get(new Scanner(System.in).nextLine()).addWater();
        return "Поение выполнено";
    }

    public static void endDay() {
        List<Animal> animalsValue = new ArrayList<>(animals.values());
        for (Animal animal : animalsValue) {
            animal.endDay();
        }
    }
}

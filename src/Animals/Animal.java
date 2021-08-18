package Animals;

public abstract class Animal {

    public String getInfo() {
        return "Имя: " + getName() + " Тип: " +  getId() + "\nВода: " + getWater()  + " Еда: " + getFood() + "\n";
    }

    public static String getId() {
        return id;
    }

    public int getWater() {
        return water;
    }

    public int getFood() {
        return food;
    }

    static String id;

    int water = 10;
    int food = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    Animal(String name) {
        this.name = name;
        voice();
    }


    abstract void voice();

    public void addFood() {
        food += 3;
    }

    public void addWater() {
        water += 3;
    }

    public void endDay() {
        water -= 1;
        food -= 1;
    }
}

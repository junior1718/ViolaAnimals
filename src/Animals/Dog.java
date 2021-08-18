package Animals;

public class Dog extends Animal implements Domestic{
    public Dog(String name) {
        super(name);
        id = "собака";
    }

    @Override
    void voice() {
        System.out.println("Гав-гав!");
    }
}

package Animals;

public class Rat extends Animal implements Domestic{
    public Rat(String name) {
        super(name);
        id = "крыса";
    }

    @Override
    void voice() {
        System.out.println("Пи-пи-пи!");
    }
}

package Animals;

public class Cat extends Animal implements Domestic{


    public Cat(String name) {
        super(name);
        id = "кошка";
    }

    @Override
    void voice() {
        System.out.println("Мяу-мяу!");
    }
}

package Animals;

public class Tiger extends Animal implements Wild{



    public Tiger(String name) {
        super(name);
        id = "тигр";
    }

    @Override
    void voice() {
        System.out.println("Ррр!");
    }
}

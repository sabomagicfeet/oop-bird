public class Parrot extends Bird {
    Parrot(String name, String color) {
        super(name, color);
    }

    @Override
    public void speak() {
        System.out.println("Mamamamamama Papapapapapa");
    }
}

public class Tea extends Drink{
    private  String color;
    private String taste;
    public Tea(String name, int temperature, double volume, double price, int count, String color, String taste) {
        super(name, temperature, volume, price, count);
        this.color = color;
        this.taste = taste;
    }


    @Override
    public String toString() {
        return String.format("%s чай со вкусом %s %s",color, taste, super.toString());
    }
}

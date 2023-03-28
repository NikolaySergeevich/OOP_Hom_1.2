public class Coffee extends Drink{
    private  String coffeeBeans;
    public Coffee(String name, int temperature, double volume, double price, int count, String coffeeBeans) {
        super(name, temperature, volume, price, count);
        this.coffeeBeans = coffeeBeans;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), coffeeBeans);
    }
}

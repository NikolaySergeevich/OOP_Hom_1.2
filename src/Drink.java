import java.util.Scanner;

public class Drink {
    private  String name;
    private int temperature;
    private  double volume;
    private double price;
    private  int count;
    private int countSugar;

    public Drink(String name, int temperature, double volume, double price, int count) {
        this.name = name;
        this.temperature = temperature;
        this.volume = volume;
        this. price = price;
        this.count = count;
        this.countSugar = 0;
    }

    public int getCountSuga() {
        return countSugar;
    }

    public boolean setCountSuga() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во порций сахара от 1 до 5");
        this.countSugar = sc.nextInt();
        return countSugar>0 && countSugar<6;
    }

    public void setCountSuga0() {
        this.countSugar = 0;
    }

    public boolean setCount() {
        this.count --;
        return  count > 0;
    }
    public boolean setCountt() {
        this.count ++;
        return  count > 0;
    }

    public String getName() {
        return name;
    }

    public int getTemperature() {
        return temperature;
    }

    public double getVolume() {
        return volume;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("%s: %dt, %.1f л., %.2f р., %d порции сахара", name, temperature, volume, price, countSugar);
    }
}

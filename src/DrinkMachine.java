import java.util.ArrayList;
import java.util.List;

public class DrinkMachine {
    private List<Drink> drinks = new ArrayList<>();
    private double money = 0;

    public DrinkMachine addDrink(Drink drink) {
        drinks.add(drink);
        return this;
    }

    /**
     * Ищет по имени напиток
     *
     * @param name
     * @return
     */
    public Drink findDrink(String name) {
        for (Drink elem : drinks) {
            if (elem.getName().equals(name)) {
                return elem;
            }
        }
        return null;
    }

    /**
     * Даёт право выбрать кол-во сахара
     *
     * @param elem
     * @return
     * @throws Exception
     */
    public Drink takeCountSugar(Drink elem) throws Exception {
        try {
            if (!elem.setCountSuga()) {
                System.out.println("Ваша попа слипнется от такого кол-ва сахара");
                elem.setCountSuga0();
            }
        } catch (Exception e) {
            System.out.println("Введены не коректные данные");
//            throw new Exception("Введены не коректные данные", e);
        }
        return elem;
    }

    /**
     * Процесс покупки
     *
     * @param name
     * @return
     * @throws Exception
     */
    public Drink sellDrink(String name) throws Exception {
        Drink elem = findDrink(name);
        try {
            if (!elem.setCount()) {
                drinks.remove(elem);
            }
            this.money += elem.getPrice();
        } catch (NullPointerException e) {
            System.out.println("Товар не найден");
            throw new Exception("Товар не найден", e);
        }
        elem = takeCountSugar(elem);
        return elem;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (Drink item : drinks) {
            res.append(item);
            res.append("\n");
        }
        res.append(String.format("В автомате сейчас %.2f рублей", money));
        return res.toString();
    }
}

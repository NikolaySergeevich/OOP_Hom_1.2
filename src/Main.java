public class Main {
    public static void main(String[] args) {
        DrinkMachine popey = new DrinkMachine();
        popey.addDrink(new Drink("Вода", 25, 0.2, 0.20, 3))
                .addDrink(new Drink("Капучино", 70, 0.3, 3.20, 2))
                .addDrink(new Tea("Нури", 80, 0.3, 3.10, 5, "Чёрный", "Малина"))
                .addDrink(new Tea("Липтон", 80, 0.3, 3.10, 6, "Зелёный", "Лимон"))
                .addDrink(new Coffee("Лате", 88, 0.4, 5.50, 3, "Арабика"))
                .addDrink(new Coffee("Эспрессо", 85, 0.4, 5.10, 2, "Робуста"))
                .addDrink(new Coffee("Кофе", 90, 0.4, 6.0,3, "Либерика "));
        System.out.println(popey);
        System.out.println();
        System.out.println("--------");
        PrintSell(popey, "Эспрессо");
        PrintSell(popey, "Эспрессо");
        PrintSell(popey, "Эспрессо");
        System.out.println("-------------");
        System.out.println(popey);

    }

    /**
     * Процесс покупки и выдачи напитка
     * @param machine
     * @param name
     */
    public static void PrintSell (DrinkMachine machine, String name){
        try{
            System.out.println(machine.sellDrink(name));
        } catch (Exception e) {

//            System.out.println("Товар не найден");
        }
    }
}
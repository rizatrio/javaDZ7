import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурзик", 5, false);
        cats[1] = new Cat("Барсик", 10, false);
        cats[2] = new Cat("Пушок", 25, false);

        Plate plate = new Plate(30);
        plate.info();
        for (Cat cat : cats) {
            if (!cat.isSatiety() && cat.getAppetite() < plate.getFood()) {
                cat.eat(plate);
                cat.setSatiety(true);
                System.out.println("Котик " + cat.getName() + " покушал.");
            } else {
                System.out.println("Котик " + cat.getName() + " не поел!");
            }
        }
        plate.info();
        System.out.println("Сколько грамм еды добавить еще в тарелку?");
        int n = scanner.nextInt();
        plate.increaseFood(n);
        plate.info();

    }
}

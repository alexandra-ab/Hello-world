package lesson_eight.zoo;

public class Runner {
    public static void main(String[] args) {
        Zookeeper petr = new Zookeeper("Петр");
        Animal lion = new Lion("Муфаса", "Лев", 4, "Мясо", 30, 60);
        Animal penguin = new Penguin("Шкипер", "Пингвин", 2, "Рыба", 60, 30);
        Animal elephant = new Elephant("Дамбо", "Слон", 5, "Арахис", 40, 7);

        petr.setAnimal(lion);
        petr.getAnimalInfo();
        petr.feedAnimal();
        petr.helpToWalk();
        petr.setAnimal(penguin);
        petr.getAnimalInfo();
        petr.feedAnimal();
    }
}
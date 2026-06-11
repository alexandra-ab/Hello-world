package lesson_eight.zoo;

public class Elephant extends Animal{
    public Elephant(String name, String species, int age, String favoriteFood, int levelHunger, int levelEnergy) {
        super(name, species, age, favoriteFood, levelHunger, levelEnergy);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " говорит как слон)");
    }

    @Override
    public void feed(String food) {
        if (food.equals(this.favoriteFood)) {
            System.out.println(this.name + " ест арахис.");
        } else {
            System.out.println(this.name + " не ест такую еду.");
        }
    }
}

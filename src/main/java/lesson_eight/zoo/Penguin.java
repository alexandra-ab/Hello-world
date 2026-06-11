package lesson_eight.zoo;

public class Penguin extends Animal{
    public Penguin(String name, String species, int age, String favoriteFood, int levelHunger, int levelEnergy) {
        super(name, species, age, favoriteFood, levelHunger, levelEnergy);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " говорит как пингвин)");
    }

    @Override
    public void feed(String food) {
        if (food.equals(this.favoriteFood)) {
            System.out.println(this.name + " ест рыбу.");
        } else {
            System.out.println(this.name + " не ест такую еду.");
        }
    }
}

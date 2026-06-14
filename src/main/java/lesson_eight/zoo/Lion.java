package lesson_eight.zoo;

public class Lion extends Animal{
    public Lion(String name, String species, int age, String favoriteFood, int levelHunger, int levelEnergy) {
        super(name, species, age, favoriteFood, levelHunger, levelEnergy);
    }

    @Override
    public void voice() {
        System.out.println(this.name + " рычит.");
    }

    @Override
    public void feed(String food) {
        if (food.equals(this.favoriteFood)) {
            System.out.println(this.name + " ест мясо.");
            this.levelHunger -= 10;
        } else {
            System.out.println(this.name + " не ест такую еду.");
        }
    }
}

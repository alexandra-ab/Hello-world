package lesson_eight.zoo;

public abstract class Animal {
    protected String name;
    protected String species;
    private int age;
    protected String favoriteFood;
    protected int levelHunger;
    protected int levelEnergy;

    public Animal(String name, String species, int age, String favoriteFood, int levelHunger, int levelEnergy) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.favoriteFood = favoriteFood;
        this.levelHunger = levelHunger;
        this.levelEnergy = levelEnergy;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public abstract void voice();

    public abstract void feed(String food);

    public boolean isHangry() {
        return levelHunger > 60;
    }

    public boolean isTired() {
        return levelEnergy < 50;
    }

    public void walk() {
        if (levelEnergy >= 10) {
            levelEnergy -= 10;
            levelHunger += 10;
            System.out.println(this.name + " гуляет.");
            if (this.isHangry()) {
                this.voice();
            }
        } else {
            System.out.println(this.name + " устал, он хочет поесть или поспать.");
        }
    }

    public void sleep() {
        levelEnergy += 10;
        levelHunger += 10;
        if (levelEnergy > 100) {
            levelEnergy = 100;
        }
        if (levelHunger > 100) {
            levelHunger = 100;
        }
        System.out.println(this.name + "спит.");
    }

    public void askFood() {
        if (levelHunger > 60) {
            System.out.println(this.name + " хочет есть.");
        } else {
            System.out.println(this.name + " не голоден.");
        }
    }
}

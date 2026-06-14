package lesson_eight.zoo;

public class Zookeeper {
    private String name;
    private Animal animal;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void getAnimalInfo() {
        System.out.println(this.name + " ухаживает за " + animal.getSpecies() + " по имени " + animal.getName());
    }

    public void feedAnimal() {
        if (this.animal.isHangry()) {
            this.animal.feed(animal.getFavoriteFood());
        }
    }

    public void helpToSleep() {
        this.animal.sleep();
    }

    public void helpToWalk() {
        this.animal.walk();
    }
}

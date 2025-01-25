package main.AssistedProblems.AnimalHierarchy;;

public class AnimalHierarchy {
    public static void main(String[] args){
        Animal animal = new Animal("Animal", 10);
        Dog dog = new Dog("Doge", 12);
        Cat cat = new Cat("Lily", 3);
        Bird bird = new Bird("Brian", 4);

        animal.makeSound();
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

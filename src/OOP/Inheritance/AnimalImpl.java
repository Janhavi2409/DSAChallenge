package OOP.Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }

    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    @Override
    void eat() {
        super.eat();
    }

    @Override
    void sleep() {
        super.sleep();
    }

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    @Override
    void eat() {
        System.out.println("Cat is drinking milk");
    }

    @Override
    void sleep() {
        super.sleep();
    }

    void play() {
        System.out.println("Cat is playing");
    }
}

public class AnimalImpl {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();
        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.play();
    }
}
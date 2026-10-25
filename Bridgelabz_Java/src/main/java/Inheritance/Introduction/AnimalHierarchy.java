package Inheritance.Introduction;
/*
Problem: Animal Hierarchy
Description:
Create a hierarchy where Animal is the superclass, and Dog, Cat,
and Bird are subclasses. Each subclass has a unique behavior.

Tasks:
1. Define a superclass Animal with attributes name and age,
   and a method makeSound().
2. Define subclasses Dog, Cat, and Bird, each with a unique
   implementation of makeSound().

Goal:
Learn inheritance, method overriding, and polymorphism.
*/

class Animal {

    // Common attributes shared by all animals
    protected String name;
    protected int age;

    // Constructor to initialize animal details
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // General behavior inherited by all subclasses
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Dog inherits the properties and methods of Animal
class Dog extends Animal {

    // Pass name and age to the parent class constructor
    public Dog(String name, int age) {
        super(name, age);
    }

    // Override the parent class method with dog-specific behavior
    @Override
    public void makeSound() {
        System.out.println(name + " says Woof!");
    }
}

// Cat inherits the properties and methods of Animal
class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    // Provide a cat-specific implementation
    @Override
    public void makeSound() {
        System.out.println(name + " says Meow!");
    }
}

// Bird inherits the properties and methods of Animal
class Bird extends Animal {

    public Bird(String name, int age) {
        super(name, age);
    }

    // Provide a bird-specific implementation
    @Override
    public void makeSound() {
        System.out.println(name + " says Tweet!");
    }
}

public class AnimalHierarchy {

    public static void main(String[] args) {

        // Create an object of the current class to call its non-static method
        AnimalHierarchy obj = new AnimalHierarchy();

        // Parent-class references hold subclass objects (polymorphism)
        Animal dog = new Dog("Buddy", 3);
        Animal cat = new Cat("Kitty", 2);
        Animal bird = new Bird("Tweety", 1);

        // The same method produces different results for each object
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

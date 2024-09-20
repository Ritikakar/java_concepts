package main;

class Animal{
    String name;

    Animal(String name)
    {
        this.name = name;
    }

    void eat()
    {
        System.out.println(name+ " is eating");
    }
}

class Dog extends Animal
{
    Dog(String name)
    {
        super(name);
    }

    void bark()
    {
        System.out.println(name + " is barking");
    }

    
}

public class InheritanceConcepts 
{
    public static void main(String[] args) {

        Dog obj = new Dog("Tommy");
        obj.bark();
        obj.eat();
        
        Animal obj1 = new Dog("max");
        obj.bark();
        obj1.eat();
    }    
}

/*
Q5. Create a class Animal with method sound().
Create subclasses:
     Dog
     Cat
Each class overrides sound().
In the main method:
    1. Store objects of Dog and Cat in Animal references.
    2. Call sound().
*/

package lab6tasks;

public class Animal {
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    @Override //used since convention
    void sound(){
        System.out.println("Dogs make 'BARK' sound");
    }
}

class Cat extends Animal{
    @Override //used since convention
    void sound(){
        System.out.println("Cats make 'MEOW' sound");
    }
}

class MAINNNNN{
    public static void main(String[] args) {
        Animal d = new Dog();
        d.sound();
        Animal c = new Cat();
        c.sound();
    }
}
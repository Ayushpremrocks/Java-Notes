package d_oops;
class Animals {
    void sound() {
        System.out.println("Some animal sound");
    }
}

class Dog extends Animal {
    //@Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();  // prints: Dog barks
    }
}

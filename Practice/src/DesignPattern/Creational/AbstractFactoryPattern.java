package DesignPattern.Creational;

public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory fp = new FactoryProducer().getFactory(false);
        Animal animal = fp.getAnimal("Cat");
        animal.animalName();
    }
}


// Super factory, to return factories
class FactoryProducer {
    AbstractFactory getFactory(boolean isWildAnimalFactory) {
        if (isWildAnimalFactory) return new WildAnimalFactory();
        else return new DomesticAnimalFactory();
    }
}

interface AbstractFactory {
    Animal getAnimal(String animalName);
}

//Factories, returning animal
class WildAnimalFactory implements AbstractFactory {
    @Override
    public Animal getAnimal(String animalName) {
        switch (animalName) {
            case "Lion":
                return new Lion();
            case "Tiger":
                return new Tiger();
            default:
                return new NoAnimalFound();
        }
    }
}


class DomesticAnimalFactory implements AbstractFactory {
    @Override
    public Animal getAnimal(String animalName) {
        switch (animalName) {
            case "Dog":
                return new Dog();
            case "Cat":
                return new Cat();
            case "Rabit":
                return new Rabit();
            default:
                return new NoAnimalFound();
        }
    }
}

interface Animal {
    void animalName();
}

class Lion implements Animal {
    @Override
    public void animalName() {
        System.out.println("i'm Lion wild animal");
    }
}

class Tiger implements Animal {
    @Override
    public void animalName() {
        System.out.println("i'm Tiger wild animal");
    }
}


class Dog implements Animal {
    @Override
    public void animalName() {
        System.out.println("i'm Dog domestic animal");
    }
}


class Cat implements Animal {
    @Override
    public void animalName() {
        System.out.println("i'm Cat domestic animal");
    }
}

class Rabit implements Animal {
    @Override
    public void animalName() {
        System.out.println("i'm Rabit domestic animmal");
    }
}

class NoAnimalFound implements Animal {
    @Override
    public void animalName() {
        System.out.println("Oops!! incorrect animal name");
    }
}
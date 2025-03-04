package Animals;

import Animals.Pet;

public class Cat extends Pet {

    @Override
    public String toString() {
        return "Animals.Cat{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
    public Cat() {
    }
}

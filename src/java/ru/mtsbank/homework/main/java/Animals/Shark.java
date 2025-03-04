package Animals;

import Animals.Predator;

public class Shark extends Predator {
    @Override
    public String toString() {
        return "Animals.Shark{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
    public Shark() {
    }
}

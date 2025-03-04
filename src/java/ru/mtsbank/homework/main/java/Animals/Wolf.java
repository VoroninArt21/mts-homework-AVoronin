package Animals;

import Animals.Predator;

public class Wolf extends Predator {
    @Override
    public String toString() {
        return "Animals.Wolf{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
    public Wolf() {
    }
}

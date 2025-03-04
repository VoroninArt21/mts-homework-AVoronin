package Animals;

public class Dog extends Pet {
    @Override
    public String toString() {
        return "Animals.Dog{" +
                "breed='" + breed + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", character='" + character + '\'' +
                '}';
    }
    public Dog() {
    }
}

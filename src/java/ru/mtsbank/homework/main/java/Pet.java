public class Pet extends AbstractAnimal{
    public Pet(String breed, String name, double cost, String character){
        this.setBreed(breed);
        this.setName(name);
        this.setCost(cost);
        this.setCharacter(character);
    }
    public Pet() {
    }
}

public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;

    protected Double cost;
    protected String character;

    public String getBreed(){
        return this.breed;
    }

    public String getName(){
        return this.name;
    }
    public Double getCost(){
        return this.cost;
    }

    public String getCharacter(){
        return this.character;
    }

}
public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;

    protected Double cost;
    protected String character;
    @Override
    public String getBreed(){
        return this.breed;
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public Double getCost(){
        return this.cost;
    }
    @Override
    public String getCharacter(){
        return this.character;
    }

}
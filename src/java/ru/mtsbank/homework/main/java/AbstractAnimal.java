public abstract class AbstractAnimal implements Animal {
    protected String breed;
    protected String name;
    protected Double cost;
    protected String character;

    public String getBreed(){
        return breed;
    }
    public String getName(){
        return name;
    }
    public Double getCost(){
        return cost;
    }
    public String getCharacter(){
        return character;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public void setCharacter(String character){
        this.character = character;
    }
}
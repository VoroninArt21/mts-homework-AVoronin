public class Main {
    public static void main(String[] args){
        CreateAnimalService createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal();

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(10);
        CreateAnimalServiceImpl createAnimalServiceImpl1 = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal();

    }
}

import Service.CreateAnimalServiceImpl;

public class Main {
    public static void main(String[] args){
        CreateAnimalServiceImpl createAnimalService = new CreateAnimalServiceImpl();
        createAnimalService.createAnimal(); //вызвать метод из интерфейса, а не из класса

        CreateAnimalServiceImpl createAnimalServiceImpl = new CreateAnimalServiceImpl();
        createAnimalServiceImpl.createAnimal(10);
        CreateAnimalServiceImpl createAnimalServiceImpl1 = new CreateAnimalServiceImpl();
        createAnimalServiceImpl1.createAnimal();

    }
}

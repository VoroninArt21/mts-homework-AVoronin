public interface CreateAnimalService {

    default void createAnimal()
    {
        int count = 0;
        while (count < 10) {
            AbstractAnimal objectName = null; //создаем объект с параметрами из класса AbstractAnimal
            count++;
        }
        System.out.println("Создано" + count + "животных.");
    }
}

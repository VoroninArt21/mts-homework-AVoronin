public class CreateAnimalServiceImpl implements CreateAnimalService, Cloneable {
    public void createAnimal(int N){
        int animals = N;

        for(int i=0;animals<N;i++){
            animals++;
        }
        System.out.println("Создано "+ animals + " животных.");
    }

 /*   public void createAnimal(){
        //TODO дописать
        int animals = A;
        do
        {
            animals++;
        }
        while (animals=10);
    }

    public void createAnimal(int B){

    }*/
}
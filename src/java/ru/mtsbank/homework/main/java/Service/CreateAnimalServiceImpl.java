package Service;

import Animals.*;
import Service.Animal;
import Service.CreateAnimalService;

public class CreateAnimalServiceImpl implements CreateAnimalService {


    public void createAnimal(int N){
        Animal animal[] = new Animal[N];
        int animalType = (int)(Math.random()*4);
        for(int i=0;i<N;i++){
            switch (animalType) {
                case 0:
                    animal[i] = new Wolf();
                    break;
                case 1:
                    animal[i] = new Shark();
                    break;
                case 2:
                    animal[i] = new Dog();
                    break;
                case 3:
                    animal[i] = new Cat();
                    break;
                default:
                    System.out.println("Check your animals");
            }
            i++;
            System.out.println("Создан "+ animal[i]);
        }
        System.out.println("Создано "+ animal.length + " животных с помощью for.");
    }



   @Override
   public void createAnimal(){
        Animal[] animal = new Animal[10];
        int i = 0;
        do
        {
            int animalType = (int)(Math.random()*4);
            switch (animalType) {
                case 0:
                    animal[i] = new Wolf();
                    break;
                case 1:
                    animal[i] = new Shark();
                    break;
                case 2:
                    animal[i] = new Dog();
                    break;
                case 3:
                    animal[i] = new Cat();
                    break;
                default:
                    System.out.println("Check your animals");
            }
            System.out.println("Создан "+ animal[i]);
            i++;
        }
        while (i <animal.length);
        System.out.println("Создано "+ animal.length + " животных с помощью do_while.");
    }
}
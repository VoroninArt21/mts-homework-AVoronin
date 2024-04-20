public interface CreateAnimalService {
    default void createAnimal()
    {
        Animal[] animal = new Animal[10];
        int i = 0;
        while (i < animal.length) {
            int animalType = (int) (Math.random()*4);   //0-3
            switch(animalType){
                case 0:
                    animal[i]= new Wolf();
                    break;
                case 1:
                    animal[i]= new Shark();
                    break;
                case 2:
                    animal[i]= new Dog();
                    break;
                case 3:
                    animal[i]= new Cat();
                    break;
                default:
                    System.out.println("Check your animals");
            }
            System.out.println("Создано " + animal[i]);
            i++;
        }
    }
}

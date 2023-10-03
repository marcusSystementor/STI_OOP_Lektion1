import java.util.ArrayList;

public class App {
    public static void main(String[] args)  {



        DogArray arrayOfDogs = new DogArray();

        
        
        Dog dog = new Dog();
        arrayOfDogs.dogList.add(dog);
         dog.setName("Fido");
         
            dog.getAge();
           // dog.age = 2;
           dog.color = "Brun";
           dog.race = "Tax";
           dog.isVaccinated = true;
           // dog.name = "Fido";
           dog.weight = 5.5;

           dog.run();

           Dog dog2 = new Dog();

           dog2.setName("Fido");

         //   dog2.name = "Brutus";
            dog2.race = "Whippet";

            dog2.run();

            ArrayList<Dog> dogList = new ArrayList<>();
            dogList.add(dog);
            dogList.add(dog2);

            for (int i = 0; i < dogList.size(); i++) {
             System.out.println(dogList.get(i).toString());
            }




            ArrayList<String> list = new ArrayList<>();



           Dog fido = new Dog("Doglas");

           System.out.println(fido.toString());
    }


}

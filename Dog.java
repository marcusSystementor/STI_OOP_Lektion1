public class Dog {

    // Instansvariabler
    private String name; // private - kan bara nås från klassen
    private int age;
    String race; // kan nås av andra klasser.
    String color;
    double weight;
    boolean isVaccinated;


    // Default konstuktor, dvs inga parametrar.
    public Dog () {


    }

    // Konstruktor med en parameter, när vi skapar ett objekt av klassen Dog kan vi välja att sätta namn direkt.
    public Dog(String name) {
        this.name = name;
        // En konstruktor är som en metod så vi kan kalla på andra saker från den också, här kallar vi på metoden run()
        run();
    }


    public void run() {
        System.out.println(name + " runs fast");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    } 

    
    // toString-metoden, vi kan här välja vad vi vill att vi vill skriva ut när vi kallar på metoden med objektnamn.toString();
    public String toString() {
        return name + age;
    }

    
}

package main.HybridInheitance.RestaurantManagement;

public class Person implements Worker{
    String name;
    String id;

    public Person(String name, String id){
        this.name = name;
        this.id = id;
    }

    public void performDuties(){
        System.out.println("I am a person. I just exist!");
    }
}

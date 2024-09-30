//Write a Java program to create a class called "Dog" with instance variables "breed," "age," and "weight."
// Include a method to calculate
//the dog's age in human years and a method to print the dog's breed, age, and weight.
public class Dog {
    String breed;
    int age;
    float weight;
    public Dog(){

    }
    public Dog(String breed, int age, float weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;

    }
    public void age(int age){
        this.age = age;
        System.out.println("Age of dogs is "+age);
    }
    public void details(String breed, int age, float weight){
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        System.out.println("Breed is "+breed + " and age is "+age + " and weight is "+weight);
    }
}

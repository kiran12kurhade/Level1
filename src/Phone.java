
//Write a Java program to create a class called "Phone" with instance variables "make," "model," and "storage."
//Include a method to calculate the price of the phone based on the make, model, and storage capacity and a method to print the phone's make, model, and storage capacitypublic
class Phone {
    String model;
    int make;
    double storage;

    public Phone (){

    }
    public Phone(String model, int make, double storage) {
        this.model = model;
        this.make = make;
        this.storage = storage;
    }
    public void priceOfPhone(){
        
    }
    public void details(String model, int make, double storage) {
        this.model = model;
        this.make = make;
        this.storage = storage;
        System.out.println("Model: " + model+ "Make: " + make+ "Storage: " + storage);
    }

}

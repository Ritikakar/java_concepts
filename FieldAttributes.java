package main;

class Car
{
    String brand;
    String model;
    int year;

    Car(String brand_name, String model_name, int release_year)
    {
        this.brand = brand_name;
        this.model = model_name;
        this.year = release_year;
    }

    void displayDetails()
    {
        System.out.println("car: " + brand + " " + model + " " + year);
    }
}

public class FieldAttributes {

    public static void main(String[] args) {

        System.out.println("car details: ============");
        Car obj = new Car("Hyundai", "Sonata", 1999);
        obj.displayDetails();

    }
    
}

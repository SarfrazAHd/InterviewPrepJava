package DesignPattern.Creational;

// - Creational Design pattern
// - Build the complex objec step by step with simple object

// 1.If we have N nuber of configuration for an Object & that need to be passed in constructor,
//  then code become complex and hard to maintain the order
// 2. Sometimes we don't required to set optional configuration then to avoid Nullisation in constructor

public class BuilderPattern {
    public static void main(String[] args) {

        Phone phone = new PhoneBuilder()
                .setBrand("samsung")
                .setModel("Abc")
                .getPhone();

        System.out.println(phone);
    }
}

class PhoneBuilder {
    private String brand;
    private String model;
    private float price;
    private String ram;
    private String camera;

    public PhoneBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public PhoneBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public PhoneBuilder setPrice(float price) {
        this.price = price;
        return this;
    }

    public PhoneBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setCamera(String camera) {
        this.camera = camera;
        return this;
    }

    Phone getPhone() {
        return new Phone(brand, model, price, ram, camera);
    }
}


class Phone {
    private String brand;
    private String model;
    private float price;
    private String ram;
    private String camera;

    public Phone(String brand, String model, Float price, String ram, String camera) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", ram='" + ram + '\'' +
                ", camera='" + camera + '\'' +
                '}';
    }
}

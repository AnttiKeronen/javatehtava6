package main;

class Plane extends Vehicle {
    public Plane(String manufacturer, String model, int maxSpeed) {
        super(manufacturer, model, maxSpeed);
        setEngine(new Engine("Suihkumoottori", 500));
    }

    public void fly() {
        System.out.println(getManufacturer() + " " + getModel() + " lentää kohteeseen!");
    }
}


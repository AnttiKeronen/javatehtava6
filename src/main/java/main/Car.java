package main;

class Car extends Vehicle {
    public Car(String manufacturer, String model, int maxSpeed) {
        super(manufacturer, model, maxSpeed);
        setEngine(new Engine("V8", 300));
    }

    public void drive() {
        System.out.println(getManufacturer() + " " + getModel() + " paahtaa tietä eteenpäin!");
    }
}


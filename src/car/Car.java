package car;

public class Car {
    private String model;
    private Engine engine;

    public Car(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void startMove(int km) {
        int count = km / 1000;
        int currentDurability = engine.getDurability() - (count * 10);
        System.out.println("Durability rate: " + currentDurability);
    }
    public void showEngineInfo() {
        System.out.println("Car " + model + " with durability rate: " + engine.getDurability());
    }

}

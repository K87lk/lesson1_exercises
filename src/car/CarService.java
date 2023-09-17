package car;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class CarService {
    private Car car;
    private Engine engine;

    public CarService(Car car) {
        this.car = car;
    }
    public CarService() {

    }
    public void repairEngine(Car car) {
        engine.setDurability(100);
    }
    public Engine findWornEngine(Car[] cars) {
       return Arrays.stream(cars).map(i -> new Engine())
               .min(Comparator.comparingInt(Engine::getDurability))
               .orElseThrow(NoSuchElementException::new);
    }

}

package airplane;

import airplane.Airplane;

public class AirplaneService {

    private Airplane airplane;

    public AirplaneService(Airplane airplane) {
        this.airplane = airplane;
    }
    public  int price(Airplane airplane) {
        int fuelAmount = airplane.getFuel() + 100;
        return fuelAmount * 56;
    }
    public  String getYearDifference(Airplane airplane, int currentYear) {
        if(currentYear - airplane.getYear() > 30) {
            return "Самолет пора в утиль";
        }
        return "Самолет еще полетает";
        }
    public  int countAirplanesOver50(Airplane[] airplanes) {
        int count = 0;
        for (Airplane airplane: airplanes) {
            if(airplane.getWeight() > 50000)
                count++;
        }
        return count;
    }
}

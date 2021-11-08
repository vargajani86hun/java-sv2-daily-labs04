package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {
    private List<Passenger> passengers = new ArrayList<>();
    private int maxPassengers;

    public Plane(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < maxPassengers) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int amount = 0;
        for (Passenger p : passengers) {
            amount += p.getPacks();
        }
        return amount;
    }
}

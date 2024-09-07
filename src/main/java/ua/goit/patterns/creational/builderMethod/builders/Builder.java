package ua.goit.patterns.creational.builderMethod.builders;

import ua.goit.patterns.creational.builderMethod.cars.CarType;
import ua.goit.patterns.creational.builderMethod.components.Engine;
import ua.goit.patterns.creational.builderMethod.components.GPSNavigator;
import ua.goit.patterns.creational.builderMethod.components.Transmission;
import ua.goit.patterns.creational.builderMethod.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}

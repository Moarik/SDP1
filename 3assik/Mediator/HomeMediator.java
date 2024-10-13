package Mediator;

public interface HomeMediator {
    void registerSensor(Sensor sensor);
    void update(Sensor sensor);
    void printReport();
}

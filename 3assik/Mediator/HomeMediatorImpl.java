package Mediator;

import java.util.ArrayList;
import java.util.List;

public class HomeMediatorImpl implements HomeMediator {
    private List<Sensor> sensors;

    public HomeMediatorImpl() {
        sensors = new ArrayList<>();
    }

    @Override
    public void registerSensor(Sensor sensor) {
        sensors.add(sensor);
        sensor.setMediator(this);
    }

    @Override
    public void update(Sensor sensor) {
        // Обработка обновления данных от сенсора
        System.out.println("Sensor updated: " + sensor.getClass().getSimpleName());
    }

    @Override
    public void printReport() {
        System.out.println("Generating report from all sensors...");
        // Дополнительная логика для генерации отчета
    }
}

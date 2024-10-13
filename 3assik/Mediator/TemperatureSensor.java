package Mediator;

public class TemperatureSensor implements Sensor {
    private double temperature;
    private HomeMediator mediator;

    public TemperatureSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setData(double temperature) {
        this.temperature = temperature;
        mediator.update(this);
    }

    public double getTemperature() {
        return temperature;
    }

    // Обязательно добавьте метод для установки медиатора
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}

package Mediator;

public class LightSensor implements Sensor {
    private double lightLevel;
    private HomeMediator mediator;

    public LightSensor(HomeMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void setData(double lightLevel) {
        this.lightLevel = lightLevel;
        mediator.update(this);
    }

    public double getLightLevel() {
        return lightLevel;
    }

    // Метод для установки медиатора
    public void setMediator(HomeMediator mediator) {
        this.mediator = mediator;
    }
}

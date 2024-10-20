package BehavioralPatterns2.Observer;

public class NewsSubscriberLaptop implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Новость на ноутбуке [" + category + "]: " + news);
    }
}
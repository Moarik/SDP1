package BehavioralPatterns2.Observer;

public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Новость на смартфоне [" + category + "]: " + news);
    }
}
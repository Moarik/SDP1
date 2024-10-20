package BehavioralPatterns2.Observer;

public class NewsSubscriberTablet implements Observer {
    @Override
    public void update(String category, String news) {
        System.out.println("Новость на планшете [" + category + "]: " + news);
    }
}
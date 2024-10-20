package BehavioralPatterns2.Observer;

public interface NewsPublisher {
    void addSubscriber(Observer observer);
    void removeSubscriber(Observer observer);
    void notifySubscribers(String category, String news);
}

package BehavioralPatterns2.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisherImpl implements NewsPublisher {
    private List<Observer> subscribers;

    public NewsPublisherImpl() {
        this.subscribers = new ArrayList<>();
    }

    // Метод для добавления подписчиков
    @Override
    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    // Метод для удаления подписчиков
    @Override
    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    // Уведомляем подписчиков о новой новости
    @Override
    public void notifySubscribers(String category, String news) {
        for (Observer observer : subscribers) {
            observer.update(category, news);
        }
    }

    // Метод для публикации новости
    public void publishNews(String category, String news) {
        System.out.println("Публикация новости: " + news);
        notifySubscribers(category, news);
    }
}

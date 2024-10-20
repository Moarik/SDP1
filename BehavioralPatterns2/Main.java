package BehavioralPatterns2;

import BehavioralPatterns2.Observer.*;
import BehavioralPatterns2.State.*;
import BehavioralPatterns2.Strategy.*;
import BehavioralPatterns2.Template.*;
import BehavioralPatterns2.Visitor.*;

public class Main {
    public static void main(String[] args) {
        // ======= Задача 1: Паттерн Наблюдатель (Observer) =======

        // Создаем издателя новостей
        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        // Создаем подписчиков
        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        // Добавляем подписчиков к издателю
        newsPublisher.addSubscriber(smartphoneSubscriber);
        newsPublisher.addSubscriber(laptopSubscriber);
        newsPublisher.addSubscriber(tabletSubscriber);

        // Публикуем новости
        newsPublisher.publishNews("Спорт", "Новая победа футбольной команды!");
        newsPublisher.publishNews("Наука", "Открытие новой планеты.");
        newsPublisher.publishNews("Технологии", "Новый смартфон на рынке.");

        // ======= Задача 2: Паттерн Состояние (State) =======

        // Создаем плеер
        Player player = new Player();

        // Воспроизведение аудио
        player.play();
        // Пауза
        player.pause();
        // Остановка
        player.stop();

        // ======= Задача 3: Паттерн Стратегия (Strategy) =======

        // Создаем заказ на сумму 1000
        Order order = new Order(1000);

        // Устанавливаем стратегию оплаты банковской картой
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Оплата картой: " + order.calculateFinalPrice());

        // Устанавливаем стратегию оплаты электронным кошельком
        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Оплата кошельком: " + order.calculateFinalPrice());

        // Устанавливаем стратегию оплаты наложенным платежом
        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Оплата наложенным платежом: " + order.calculateFinalPrice());

        // ======= Задача 4: Паттерн Шаблонный метод (Template Method) =======

        // Проверка качества продуктов питания
        QualityCheck foodCheck = new FoodQualityCheck();
        foodCheck.performCheck();

        // Проверка качества электроники
        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        electronicsCheck.performCheck();

        // ======= Задача 5: Паттерн Посетитель (Visitor) =======

        // Создаем файлы для сканирования
        File textFile = new TextFile("document.txt");
        File exeFile = new ExecutableFile("program.exe");

        // Создаем посетителей
        AntivirusVisitor antivirusVisitor = new AntivirusVisitor();
        ReportVisitor reportVisitor = new ReportVisitor();

        // Сканируем файлы антивирусом
        textFile.accept(antivirusVisitor);
        exeFile.accept(antivirusVisitor);

        // Генерируем отчет по результатам сканирования
        textFile.accept(reportVisitor);
        exeFile.accept(reportVisitor);
    }
}

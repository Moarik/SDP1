import Chain.*;
import Command.*;
import Iterator.*;
import Mediator.*;
import Memento.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Задача 1: Цепочка обязанностей
        // Создаем цепочку обработчиков платежей
        PaymentHandler paymentA = new PaymentA(100);  // Обработчик для платежей до 100
        PaymentHandler paymentB = new PaymentB(300);  // Обработчик для платежей до 300
        PaymentHandler paymentC = new PaymentC(1000); // Обработчик для платежей до 1000

        // Устанавливаем цепочку обработки
        paymentA.setNext(paymentB);
        paymentB.setNext(paymentC);

        // Платеж на сумму 210
        int amountToPay = 210;
        paymentA.pay(amountToPay); // Начинаем с первого обработчика

        // Задача 2: Команда
        // Создаем телевизор и команды для управления им
        Television television = new Television();
        Command turnOn = new TurnOnCommand(television);         // Команда для включения
        Command turnOff = new TurnOffCommand(television);       // Команда для выключения
        Command volumeUp = new VolumeUpCommand(television);     // Команда для увеличения громкости
        Command volumeDown = new VolumeDownCommand(television); // Команда для уменьшения громкости
        Command nextChannel = new NextChannelCommand(television); // Команда для следующего канала
        Command previousChannel = new PreviousChannelCommand(television); // Команда для предыдущего канала

        // Создаем пульт дистанционного управления и устанавливаем команды
        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, turnOn);
        remote.setCommand(1, turnOff);
        remote.setCommand(2, volumeUp);
        remote.setCommand(3, volumeDown);
        remote.setCommand(4, nextChannel);
        remote.setCommand(5, previousChannel);

        // Тестируем команды с помощью пульта
        remote.pressButton(0); // Включить телевизор
        remote.pressButton(2); // Увеличить громкость
        remote.pressButton(4); // Переключиться на следующий канал

        // Задача 3: Итератор
        // Создаем список фильмов
        List<String> movieList = new ArrayList<>();
        movieList.add("Inception");
        movieList.add("The Matrix");
        movieList.add("Interstellar");

        // Создаем коллекцию фильмов и итератор
        ListMovieCollection movieCollection = new ListMovieCollection(movieList);
        ListMovieIterator movieIterator = movieCollection.createIterator();

        // Выводим список фильмов
        System.out.println("Movies in List:");
        while (movieIterator.hasNext()) {
            System.out.println(movieIterator.next()); // Печатаем каждый фильм
        }

        // Задача 4: Посредник
        // Создаем медиатор для управления сенсорами
        HomeMediator mediator = new HomeMediatorImpl();
        Sensor temperatureSensor = new TemperatureSensor(mediator); // Сенсор температуры
        Sensor lightSensor = new LightSensor(mediator);           // Сенсор света

        // Устанавливаем данные для сенсоров
        temperatureSensor.setData(22.5); // Устанавливаем температуру
        lightSensor.setData(300);         // Устанавливаем уровень света

        // Печатаем отчет с данными сенсоров
        mediator.printReport();

        // Задача 5: Снимок
        // Создаем редактор текста и хранителя для состояний
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Изменяем текст и сохраняем состояния
        editor.setText("Version 1");
        caretaker.addTextState(new TextMemento(editor.getText())); // Сохраняем первую версию текста

        editor.setText("Version 2");
        caretaker.addTextState(new TextMemento(editor.getText())); // Сохраняем вторую версию текста

        // Восстанавливаем состояния и выводим их на экран
        editor.undo();
        System.out.println("Restored: " + editor.getText()); // Восстанавливаем и выводим предыдущую версию

        editor.undo();
        System.out.println("Restored: " + editor.getText()); // Восстанавливаем и выводим предыдущую версию
    }
}

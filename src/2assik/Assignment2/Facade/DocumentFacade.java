package Assignment2.Facade;

import Assignment2.Bridge.RenderEngine;
import Assignment2.Document;
import Assignment2.Decorator.WatermarkDecorator;
import Assignment2.Flyweight.DocumentFactory;

public class DocumentFacade {

    // Метод для отображения документа
    public void displayDocument(String documentTitle) {
        Document document = DocumentFactory.getDocument(documentTitle);  // Получаем документ из фабрики
        document.display();  // Вызываем метод для отображения документа
    }

    // Метод для отображения документа с водяным знаком
    public void displayDocumentWithWatermark(String documentTitle) {
        Document document = DocumentFactory.getDocument(documentTitle);  // Получаем документ из фабрики
        Document watermarkedDocument = new WatermarkDecorator(document);  // Оборачиваем документ декоратором
        watermarkedDocument.display();  // Вызываем метод для отображения документа с водяным знаком
    }

    // Метод для рендеринга документа через выбранный движок рендеринга
    public void renderDocument(String documentTitle, RenderEngine engine) {
        Document document = DocumentFactory.getDocument(documentTitle);  // Получаем документ из фабрики
        engine.render(documentTitle);  // Передаем заголовок документа в движок рендеринга
    }
}

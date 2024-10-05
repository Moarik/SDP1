package Assignment2;

// Реальный документ, который требует загрузки
public class RealDocument implements Document {
    private String title;

    public RealDocument(String title) {
        this.title = title;
        loadFromDisk();  // Загружаем документ при создании
    }

    private void loadFromDisk() {
        System.out.println("Загрузка документа с диска: " + title);  // Сообщение о загрузке документа
    }

    @Override
    public void display() {
        System.out.println("Отображение документа: " + title);  // Сообщение об отображении документа
    }
}

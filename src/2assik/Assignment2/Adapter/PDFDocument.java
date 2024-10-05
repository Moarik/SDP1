package Assignment2.Adapter;

// Класс для работы с PDF документами
public class PDFDocument {
    private String fileName;

    public PDFDocument(String fileName) {
        this.fileName = fileName;
        loadPDF();  // Загружаем PDF при создании
    }

    private void loadPDF() {
        System.out.println("Загрузка PDF-документа: " + fileName);
    }

    public void displayPDF() {
        System.out.println("Отображение PDF-документа: " + fileName);
    }
}

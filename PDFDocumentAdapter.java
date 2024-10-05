public class PDFDocumentAdapter implements Document {
    private PDFDocument pdfDocument;

    public PDFDocumentAdapter(String filename) {
        this.pdfDocument = new PDFDocument(filename);
    }

    @Override
    public void display() {
        pdfDocument.display();
    }
}

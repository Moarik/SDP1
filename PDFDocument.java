public class PDFDocument implements Document {
    private String filename;

    public PDFDocument(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        System.out.println("Displaying PDF: " + filename);
    }
}

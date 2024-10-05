public class DocumentFacade {
    public void displayDocument(String name) {
        Document document = DocumentFactory.getDocument(name);
        document.display();
    }

    public void displayDocumentWithWatermark(String name) {
        System.out.println("Watermark added.");
        displayDocument(name);
    }

    public void renderDocument(String name, RenderEngine engine) {
        engine.render(name);
    }
}

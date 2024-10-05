public class ProxyDocument implements Document {
    private RealDocument realDocument;
    private String name;

    public ProxyDocument(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        if (realDocument == null) {
            realDocument = new RealDocument(name);
        }
        realDocument.display();
    }
}

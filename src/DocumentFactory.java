public class DocumentFactory {
    public static Document getDocument(String name) {
        return new ProxyDocument(name);
    }
}

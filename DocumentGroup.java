import java.util.ArrayList;
import java.util.List;

public class DocumentGroup implements Document {
    private List<Document> documents = new ArrayList<>();

    public void addDocument(Document document) {
        documents.add(document);
    }

    @Override
    public void display() {
        for (Document doc : documents) {
            doc.display();
        }
    }
}

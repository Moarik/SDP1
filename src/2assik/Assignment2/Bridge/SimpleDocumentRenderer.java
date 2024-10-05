package Assignment2.Bridge;

import Assignment2.Document;

public class SimpleDocumentRenderer extends DocumentRenderer {

    public SimpleDocumentRenderer(RenderEngine engine) {
        super(engine);
    }

    @Override
    public void render(String document) {
        // Вызов метода рендеринга документа через переданный движок
        System.out.println("Рендеринг документа: " + document + " с использованием SimpleRenderEngine");
        engine.render(document);  // Вызов рендеринга через движок
    }
}

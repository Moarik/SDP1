public class SimpleRenderEngine implements RenderEngine {
    @Override
    public void render(String documentName) {
        System.out.println("Rendering " + documentName + " with Simple Render Engine.");
    }
}

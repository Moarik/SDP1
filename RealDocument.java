public class RealDocument implements Document {
    private String title;

    public RealDocument(String name) {
        this.title = name;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading " + title);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + title);
    }
}

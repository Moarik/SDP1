package Memento;

import java.util.Stack;

public class TextEditor {
    private String text;
    private Stack<TextMemento> history = new Stack<>();

    public void setText(String text) {
        // Сохраняем текущее состояние перед изменением
        history.push(new TextMemento(this.text));
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void undo() {
        if (!history.isEmpty()) {
            this.text = history.pop().getText();
        }
    }
}

package Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private List<TextMemento> textStates;

    public Caretaker() {
        textStates = new ArrayList<>();
    }

    public void addTextState(TextMemento textMemento) {
        textStates.add(textMemento);
    }

    public TextMemento getTextState(int index) {
        return textStates.get(index);
    }
}

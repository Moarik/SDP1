package Command;

public class RemoteControl {
    private Command[] buttons = new Command[6];

    public void setCommand(int slot, Command command) {
        buttons[slot] = command;
    }

    public void pressButton(int slot) {
        if (buttons[slot] != null) {
            buttons[slot].execute();
        } else {
            System.out.println("No command assigned to this button.");
        }
    }
}

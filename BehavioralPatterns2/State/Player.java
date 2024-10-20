package BehavioralPatterns2.State;

public class Player {
    private PlayerState state;

    public Player() {
        this.state = new StoppedState(); // Initial state
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}

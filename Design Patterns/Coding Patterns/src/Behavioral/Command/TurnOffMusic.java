package Behavioral.Command;

public class TurnOffMusic implements Command {
    private MusicPlayer music;
    public TurnOffMusic(MusicPlayer music) {
        this.music = music;
    }
    @Override
    public void execute() {
        this.music.turnOff();
    }

    @Override
    public void undo() {
        this.music.turnOff();
    }
}

package Behavioral.Command;

public class TurnOnMusic implements Command{
  private MusicPlayer music;
  public TurnOnMusic(MusicPlayer music) {
      this.music = music;
  }
    @Override
    public void execute() {
      this.music.turnOn();
    }

    @Override
    public void undo() {
      this.music.turnOff();
    }
}

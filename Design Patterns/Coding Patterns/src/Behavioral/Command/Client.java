package Behavioral.Command;

public class Client {

    public static void main(String[] args) {
        RemoteControll remoteControll = new RemoteControll();
        Light light = new Light();
        TurnOnLight turnOnLight = new TurnOnLight(light);
        TurnOffLight turnOffLight = new TurnOffLight(light);
        TV tv = new TV();
        TurnOnTV turnOnTV = new TurnOnTV(tv);
        TurnOffTV turnOffTV = new TurnOffTV(tv);
        MusicPlayer musicPlayer = new MusicPlayer();
        TurnOnMusic turnOnMusic = new TurnOnMusic(musicPlayer);
        TurnOffMusic turnOffMusic = new TurnOffMusic(musicPlayer);
        remoteControll.addCommand(0,turnOnLight, turnOffLight);
        remoteControll.addCommand(1,turnOnMusic, turnOffMusic);
        remoteControll.addCommand(2,turnOnTV, turnOffTV);
        System.out.println(remoteControll);
        remoteControll.onPressed(0);
        remoteControll.offPressed(0);
        remoteControll.offPressed(1);
        remoteControll.onPressed(1);
        remoteControll.offPressed(2);
        remoteControll.onPressed(2);


    }
}

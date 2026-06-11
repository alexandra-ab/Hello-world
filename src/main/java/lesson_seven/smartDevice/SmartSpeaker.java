package lesson_seven.smartDevice;

public class SmartSpeaker extends SmartDevice {
    private String currentSong;

    public SmartSpeaker(String name) {
        super(name);
        this.currentSong = " ";
    }

    public void playMusic(String song) {
        if (!isOn) {
            System.out.println("Устройство не включено.");
        } else {
            this.currentSong = song;
            System.out.println("Играет " + song);
        }
    }

    @Override
    public void performAction() {
        if (!isOn) {
            System.out.println("Включите устройство для проигрывания музыки.");
        } else {
            System.out.println("Играет музыка: " + this.currentSong);
        }
    }
}
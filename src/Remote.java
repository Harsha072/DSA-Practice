public class Remote implements DVDInterface{
    @Override
    public void playButton() {
        System.out.println("play");
    }

    @Override
    public void stopButton() {
        System.out.println("Stop");
    }

    @Override
    public void rewindeButton() {
        System.out.println("rewind....");
    }
}

package solo_run.android_tv;

public class HBOGoPlayer extends VodPlayer {
    @Override
    public void play(final String title) {
        System.out.println("Playing " + title + " on HBO");
    }
}
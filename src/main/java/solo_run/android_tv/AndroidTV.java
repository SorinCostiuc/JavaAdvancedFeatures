package solo_run.android_tv;

public class AndroidTV {
    public static void main(String[] args) {
        try {
            final String player = args[0]; //"Netflix" / "HBO"
            VodPlayer vodPlayer;
            if (player.equals("Netflix")) {
                vodPlayer = new NetflixPlayer();
            } else if (player.equals("HBO")) {
                vodPlayer = new HBOGoPlayer();
            } else {
                vodPlayer = new DefaultPlayer();
            }
            playEpisode(vodPlayer, "GOT_S1E1");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Something is wrong");
        }
    }

    static void playEpisode(VodPlayer vodPlayer, String title) {
        // we don't know what implementation we are dealing with
        vodPlayer.play(title);
    }
}
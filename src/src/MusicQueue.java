import java.util.ArrayList;

public class MusicQueue {
    private ArrayList<Song> listOfUpcomingMusic;
    private ArrayList<Song> recentlyPlayed;
    private String currentSong;

    public MusicQueue(){

        listOfUpcomingMusic = new ArrayList<>();
        recentlyPlayed = new ArrayList<>();
    }

    public void skipSong(){
        recentlyPlayed.add(0,getCurrentSong());
        getListOfUpcomingMusic().remove(0);

    }

    public void add(Song song){
        listOfUpcomingMusic.add(song);
        System.out.println("Song added: " + song.getSongName() + " by " + song.getArtist() + "(" + song.getSongYoutubeURL() + ")");
    }

    public void printQueue(ArrayList<Song> songList){
        for (int i = 0 ; i < songList.size(); i++){
            System.out.println("\tSong " + (i+1) + ": " + songList.get(i).getSongInfo() + "(" + songList.get(i).getSongYoutubeURL() + ")" );
        }
    }



    public Song getCurrentSong() {
        return getListOfUpcomingMusic().get(0);
    }

    public ArrayList<Song> getListOfUpcomingMusic() {
        return listOfUpcomingMusic;
    }

    public ArrayList<Song> getRecentlyPlayed() {
        return recentlyPlayed;
    }

    public void setListOfUpcomingMusic(ArrayList<Song> listOfUpcomingMusic) {
        this.listOfUpcomingMusic = listOfUpcomingMusic;
    }

    public void setRecentlyPlayed(ArrayList<Song> recentlyPlayed) {
        this.recentlyPlayed = recentlyPlayed;
    }
}

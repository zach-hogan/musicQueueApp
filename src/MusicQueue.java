import java.util.ArrayList;

public class MusicQueue {
    private ArrayList<String> listOfUpcomingMusic;
    private ArrayList<String> recentlyPlayed;
    private String currentSong;

    public MusicQueue(){
        listOfUpcomingMusic = new ArrayList<>();
    }

    public boolean checkIfHas(String songToAdd){
        if (listOfUpcomingMusic.contains(songToAdd)){
            return true;
        }
        return false;
    }

    public void add(String songToAdd){
        if (checkIfHas(songToAdd)){
            System.out.println();
        }
        else{
            listOfUpcomingMusic.add(songToAdd);
            System.out.println("Song added: " + songToAdd);
        }
    }

    public void printUpcomingQueue(){
        for (int i = 0 ; i < getListOfUpcomingMusic().size(); i++){
            System.out.println("Song " + (i+1) + ": " + getListOfUpcomingMusic().get(i));
        }
    }



    public String getCurrentSong() {
        return getListOfUpcomingMusic().get(0);
    }

    public ArrayList<String> getListOfUpcomingMusic() {
        return listOfUpcomingMusic;
    }

    public ArrayList<String> getRecentlyPlayed() {
        return recentlyPlayed;
    }

    public void setListOfUpcomingMusic(ArrayList<String> listOfUpcomingMusic) {
        this.listOfUpcomingMusic = listOfUpcomingMusic;
    }

    public void setRecentlyPlayed(ArrayList<String> recentlyPlayed) {
        this.recentlyPlayed = recentlyPlayed;
    }
}

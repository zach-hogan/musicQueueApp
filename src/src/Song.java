public class Song {
    private String artist;
    private String songName;


    Song(String songName, String artist){
        setArtist(artist);
        setSongName(songName);

    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }


    public String getArtist() {
        return artist;
    }

    public String getSongName() {
        return songName;
    }

    public String getSongYoutubeURL() {
        String artistString = artist.replace(' ', '+');
        String songNameString = songName.replace(' ', '+');
        return "https://www.youtube.com/results?search_query=" + artistString+"+-+"+songNameString;
    }

    public String getSongInfo() {
        return songName + " by " + artist;
    }
}

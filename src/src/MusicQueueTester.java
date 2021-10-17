import java.util.Scanner;

public class MusicQueueTester {
    public static void main(String[] args){
        MusicQueue musicQueuer = new MusicQueue();
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter a song to add to the queue");
        String newSongToAdd = scnr.nextLine();
        while(newSongToAdd.substring(0,1) != "\n"){

            musicQueuer.add(newSongToAdd);
            System.out.println("Current Queue: ");
            musicQueuer.printUpcomingQueue();
            System.out.println("Current Song: " + musicQueuer.getCurrentSong() + "\nEnter a song to add to the queue");
            newSongToAdd = scnr.nextLine();

        }
    }
}

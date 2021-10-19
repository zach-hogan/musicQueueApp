import java.util.Scanner;

public class MusicQueueTester {
    public static void main(String[] args){
        MusicQueue musicQueuer = new MusicQueue();
        Scanner scnr = new Scanner(System.in);


        int menuChoice = 0;
        while(menuChoice != 5){
            System.out.println("Menu: \n1. Add song to queue\n2. Skip song\n3. Look at queue\n4. Show Recently Played\n5. Close App");
            menuChoice = scnr.nextInt();
            scnr.nextLine();
            if (menuChoice == 1){
                System.out.println("Enter a song name to add to the queue");
                String newSongToAdd = scnr.nextLine();
                System.out.println("Enter the artist name to add to the queue");
                String newArtistToAdd = scnr.nextLine();
                musicQueuer.add(new Song(newSongToAdd,newArtistToAdd));
            }
            else if(menuChoice == 2){
                musicQueuer.skipSong();
            }
            else if (menuChoice == 3){
                System.out.println("Current Queue: ");
                musicQueuer.printQueue(musicQueuer.getListOfUpcomingMusic());
            }
            else if (menuChoice == 4) {
                System.out.println("Recently Played: (In order from most recent to least recent) ");
                musicQueuer.printQueue(musicQueuer.getRecentlyPlayed());
            }
            else
                System.out.println("Closing app");
            }

        }

    }


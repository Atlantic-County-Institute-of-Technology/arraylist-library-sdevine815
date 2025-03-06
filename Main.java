import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Library player = new Library();
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print("MUSIC PLAYER\n(0) Play\n(1) Skip\n(2) Add\n(3) Remove\n(4) Sort\n(5) Shuffle\n(6) Find\n(7) Show Queue\n(8) Exit\n> ");
            int option = Integer.parseInt(scanner.nextLine());

            if(option == 0){
                //PLAY
                String song = player.getNextItem();
                player.skipNextItem();
                System.out.println("Now playing: " + song);
                
            } else if(option == 1){
                //SKIP
                player.skipNextItem();

            } else if(option == 2){
                //ADD
                System.out.print("Enter song name to add\n> ");
                String song = scanner.nextLine();
                player.addItem(song);

            } else if(option == 3){
                //REMOVE
                System.out.print("Enter song name to remove\n> ");
                String song = scanner.nextLine();
                player.removeItem(song);
            } else if(option == 4){
                //SORT
                player.sortAlphabet();
            } else if(option == 5){
                //SHUFFLE
                player.shuffle();
            } else if(option == 6){
                //FIND
                System.out.print("Enter song name to find\n> ");
                String song = scanner.nextLine();
                int pos = player.find(song);
                
                if(pos < 0) System.out.println("Not found");
                else System.out.println("Position in Queue: " + pos);
            } else if(option == 7){
                System.out.println(player);
            } else if(option == 8){
                //EXIT
                break;
            }
        }
        scanner.close();

    }
}
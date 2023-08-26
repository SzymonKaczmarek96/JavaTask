package home;

import java.util.Arrays;

public class Room {

    private Bed bed;

    private Window[] window;


    public Room(Bed bed, Window[] window) {
        this.bed = bed;
        this.window = window;
    }


    public Room(){
       this.bed = new Bed(5);
        this.window = new Window[2];

        for(int i=0;i < window.length;i++) {
            window[i] = new Window();
        }


    }

    public void cleanRoom() {


        for(Window windows: window){
            windows.openWindow();
        }

        bed.changedOfBedding();


    }

    @Override
    public String toString() {
        return "Room{" +
                "bed=" + bed +
                ", window=" + Arrays.toString(window) +
                '}';
    }
}

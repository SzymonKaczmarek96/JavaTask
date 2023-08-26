package home;

import java.util.Arrays;

public class Home {

    private Room[] rooms;


    public Home(Room[] rooms){
        this.rooms = rooms;


    }


    @Override
    public String toString() {
        return "Home{" +
                "rooms=" + Arrays.toString(rooms) +
                '}';
    }
}

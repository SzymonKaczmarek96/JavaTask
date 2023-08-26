package home;




public class Main {
    public static void main(String[] args) {

        Window[] allWindow = new Window[4];

        for(int i = 0 ; i < allWindow.length ; i++) {

            allWindow[i] = new Window();
        }


        for (Window window: allWindow) {

            window = new Window();
            window.closeWindow();

        }

        Bed bed = new Bed(4);

        Room room1 = new Room(bed,allWindow);

        Room room2 = new Room();

        System.out.println(room1);
        System.out.println(room2);

        room1.cleanRoom();

        room2.cleanRoom();

        System.out.println(room1);
        System.out.println(room2);

        Room[] rooms = {room1, room2};



        Home home = new Home(rooms);

        System.out.println(home);






    }

}
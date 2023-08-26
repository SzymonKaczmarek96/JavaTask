package home;

public class Window {

    private boolean open;


    public Window () {
        this.open = false;
    }

    public boolean openWindow() {
        open = true;
        return open;

    }

    public boolean closeWindow() {
        open = false;
        return open;

    }


    @Override
    public String toString() {
        String checkWindow = open ? "open":"close";
        return "Window is " + checkWindow;

    }





}

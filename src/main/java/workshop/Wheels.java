package workshop;

public class Wheels {

    private boolean presure;

    private boolean flatTyre;


    public Wheels() {
        this.presure = true;
        this.flatTyre = true;
    }


    public void flatTireBecomesReality() {

        presure = false;
        flatTyre = false;

    }


    public boolean checkPresure() {
        return presure;
    }

    public void repairWheel() {
        presure = true;
        flatTyre = true;
    }




    @Override
    public String toString() {
        String checkPresure = presure ? "OK" : "NOT OK";
        String checkTyres = flatTyre ? "OK" : "NOT OK";
        return "Presure in tyre: " + checkPresure + " tyres: " + checkTyres;
    }
}

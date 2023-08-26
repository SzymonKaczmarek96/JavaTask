package home;

public class Bed {

    private int howManyDays;


    public Bed(int howManyDays) {
        this.howManyDays = howManyDays;
    }

    public int changedOfBedding() {
        howManyDays = 0;
        return howManyDays;
    }

    @Override
    public String toString() {
        return String.valueOf(howManyDays);

    }
}

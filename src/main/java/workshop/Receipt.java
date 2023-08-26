package workshop;

public class Receipt {

    private int price;

    private int howManyWheels;

    private String serviceName;

    public Receipt() {
        this.howManyWheels = 1;
        this.serviceName = "We was repaired " + String.valueOf(howManyWheels) + " wheel";
        this.price = howManyWheels * 100;
    }

    @Override
    public String toString() {
        return "Receipt: " +
                "price = " + price + "$ " + serviceName
                ;
    }
}

package Post;

public class List {

   private Address address;

   private boolean priority;

   private String status;

   private double priceList;


    public List(Address address) {
        this.address = address;
        this.priority = true;
        this.status = "created";
    }





    public boolean isPriority() {
        return priority;
    }

    public double priceList(boolean checkPriority) {

        if(checkPriority) {

            priceList = 8.5;

            return priceList;
        }

        priceList = 6.0;

        return priceList;


    }

    @Override
    public String toString() {
        return
                 address +
                ", priority = " + priority +
                ", status = " + status + ", "  + "price = " + priceList + "$";

    }
}

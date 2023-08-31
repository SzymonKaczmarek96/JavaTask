package Post;

public class Letters {

   private Address address;

   private boolean priority;

   private String status;

   private double priceList;




    public Letters(Address address) {
        this.address = address;
        this.priority = true;
        this.status = "created";
    }



    public Letters(){

    }





    public String sendAllLetters() {

        return status = "sent";

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

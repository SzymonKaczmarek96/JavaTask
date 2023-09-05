package Post;

public class Letter {

   private Address senderAddress;

   private Address receiverAddress;

   private boolean priority;

   private String status;

   private double priceList;




    public Letter(Address senderAddress, Address receiverAddress) {
        this.senderAddress = senderAddress;
        this.receiverAddress = receiverAddress;
        this.priority = true;
        this.status = "created";
    }



    public Letter(){

    }





    public String sendLetter() {

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
                 "Sender: " + senderAddress + ", " + "Receiver:  " + receiverAddress +
                ", priority = " + priority +
                ", status = " + status + ", "  + "price = " + priceList + "$";

    }
}

package Post;

import java.util.Random;

public class Pack {

    private String sender;
    private String recipient;

    private double weight;

    private boolean priority;

    private String status;


    public Pack(String sender,String recipient,double weight) {



        if(sender == null || sender.isEmpty() || recipient == null || recipient.isEmpty()) {

            throw new IllegalArgumentException("Sender and recipient have to be entered");

        }


        if (weight < 1 || weight > 100000) {

            throw new IllegalArgumentException("Weight must be between 1 and 100000");

        }

        this.sender = sender;

        this.recipient = recipient;

        this.weight = weight;

        this.priority = false;

        this.status = "created";



    }


    public Pack(String sender, String recipient, double weight, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.priority = priority;
        this.status = "created";
    }




    public boolean isPriority() {
        return priority;
    }

    public double getWeight (){
        return weight;
    }

    public void isStatus(String status) {
        this.status = status;

    }



    public static String createRandom() {
        Random random = new Random();
        String[] nameList = {"Kacper","Aleksandra","Szymon","Piotr","Aleksander","Mateusz","Krzysztof"};

        int randomName = random.nextInt(nameList.length);

        return nameList[randomName];



    }


    public double packPrice(double getWeight) {

        final double priorityPrice = 0.1;

        final double noPriority = 0;


        if (isPriority()) {

             return checkWeight(priorityPrice,getWeight);

        }

        return checkWeight(noPriority,getWeight);
    }


    private double checkWeight(double bonusPrice, double getWeight) {

        double priceForPack;

        if(getWeight < 500) {

            priceForPack = 5;

            return priceForPack + (priceForPack*bonusPrice);

        }

        if(getWeight > 500 && getWeight <= 1000) {


            priceForPack = 8;

            return priceForPack + (priceForPack*bonusPrice);

        }


        if(getWeight > 1000 && getWeight <= 2000) {

            priceForPack = 12;

            return priceForPack + (priceForPack*bonusPrice);
            


        }
        
        if (getWeight > 2000) {


            double overweight = (getWeight - 2000) / 1000;

            double roundedUp = Math.ceil(overweight);

            priceForPack = 12 + roundedUp;

            return priceForPack + (priceForPack * bonusPrice);
        }



        return 0;

    }



    @Override
    public String toString() {
        String checkPriority = priority ? "Yes" : "No";
        return
                "sender='" + sender + '\'' +
                ",recipient='" + recipient + '\'' +
                ",weight=" + weight +
                ",priority=" + checkPriority + ",status= " + status +
                '}';
    }
}

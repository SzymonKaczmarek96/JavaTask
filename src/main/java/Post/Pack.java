package Post;

import java.util.Random;

public class Pack {

    private Random random = new Random();
    private String sender;
    private String recipient;

    private double weight;

    private PriorityAndStatus priority;

    private PriorityAndStatus status;

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

        this.priority = PriorityAndStatus.NOTPRIORITY;

        this.status = PriorityAndStatus.CREATED;



    }


    public Pack(String sender, String recipient, double weight, boolean priority) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
        this.priority = PriorityAndStatus.NOTPRIORITY;
        this.status = PriorityAndStatus.CREATED;
    }

    public Pack () {

        this.sender = createRandom();
        this.recipient = createRandom();
        this.weight = random.nextDouble(1,100000);
        this.priority = randomPriority();
        this.status = PriorityAndStatus.CREATED;

    }




    public PriorityAndStatus isPriority() {
        return priority;
    }

    public double getWeight (){
        return weight;
    }

    public PriorityAndStatus setStatus() {
        return PriorityAndStatus.SENT;

    }



    private String createRandom() {

        String[] nameList = {"Kacper","Aleksandra","Szymon","Piotr","Aleksander","Mateusz","Krzysztof"};

        int randomName = random.nextInt(nameList.length);

        return nameList[randomName];



    }


    public double calculatePackPrice() {

        final double priorityPrice = 0.1;

        final double noPriority = 0;


        if (isPriority().equals(PriorityAndStatus.PRIORITY)) {

             return checkWeight(priorityPrice);

        }

        return checkWeight(noPriority);
    }


    private double calculateBasePrice() {

        double priceForPack;

        if(weight < 500) {

            priceForPack = 5;

        }else if(weight > 500 && weight <= 1000) {

            priceForPack = 8;

        }else if(weight > 1000 && weight <= 2000) {

            priceForPack = 12;
            
        }else {

            double overweight = (weight - 2000) / 1000;

            double roundedUp = Math.ceil(overweight);

            priceForPack = 12 + roundedUp;


        }

        return priceForPack;
    }

    private double checkWeight(double bonusPrice) {

        double basePrice = calculateBasePrice();

        return basePrice + (basePrice * bonusPrice);

    }

    private PriorityAndStatus randomPriority() {
        boolean draw = random.nextBoolean();

        if(draw) {
            return PriorityAndStatus.PRIORITY;
        }

        return PriorityAndStatus.NOTPRIORITY;
    }



    @Override
    public String toString() {

        return
                "sender='" + sender + '\'' +
                ",recipient='" + recipient + '\'' +
                ",weight=" + weight +
                ",priority=" + priority.toString() + ",status= " + status +
                '}';
    }
}

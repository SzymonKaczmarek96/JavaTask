package Post;

import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Random random = new Random();

        try {

            Pack pack = new Pack("Andrzej", "Karolina", 10000);


            System.out.println(pack);
            double priceForSend = pack.packPrice(pack.getWeight());

            System.out.println(priceForSend + "$");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        String randomSender = Pack.createRandom();

        String randomRecipient = Pack.createRandom();

        double randomWeight = random.nextDouble(1,100000);

        boolean randomPriority = random.nextBoolean();


        Pack pack1 = new Pack(randomSender,randomRecipient,randomWeight,randomPriority);

        System.out.println(pack1);





    }
}

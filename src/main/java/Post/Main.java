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


        // create random package

        String randomSender = Pack.createRandom();

        String randomRecipient = Pack.createRandom();

        double randomWeight = random.nextDouble(1,100000);

        boolean randomPriority = random.nextBoolean();


        final Pack pack1 = new Pack(randomSender,randomRecipient,randomWeight,randomPriority);

        System.out.println(pack1);

        Pack pack2 = pack1;




        System.out.println(pack1.packPrice(pack1.getWeight()) + "$");
        System.out.println(pack2.packPrice(pack2.getWeight()) + "$");

        // when we use final, after initialization we cannot assign new values



        // 100 random packages

        Pack[] packs = new Pack[100];

        for (int i = 0; i < packs.length; i++) {
            String rs = Pack.createRandom();
            String rd = Pack.createRandom();
            double rw = random.nextDouble(1,100000);
            boolean rp = random.nextBoolean();



            Pack packForTable = new Pack(rs,rd,rw,rp);
            packs[i] = packForTable;
        }


        double priceForTheAllPacks = 0;

        for(Pack displayPack: packs) {

            System.out.println(displayPack);

            System.out.println(displayPack.packPrice(displayPack.getWeight()) + "$");

            priceForTheAllPacks += displayPack.packPrice(displayPack.getWeight());




        }

        System.out.println("It's a price for the all packs " + Math.ceil(priceForTheAllPacks) + "$");


        // post office

        PostOffice postOffice = new PostOffice();

//        Pack pack3;
//
//
////        pack3 = postOffice.createPackage();
//
//        postOffice.postAPackage(pack3,50);
//
//
//        postOffice.displayProfits();
//
//
//        postOffice.checkLastShippedPackage(pack3);




        Address address = new Address("Baltycka",30,63000);




        List list = new List(address);

        list.priceList(list.isPriority());

        System.out.println(list);















    }
}

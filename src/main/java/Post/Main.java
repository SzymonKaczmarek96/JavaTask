package Post;


import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {


        try {

            Pack pack = new Pack("Andrzej", "Karolina", 10000);


            System.out.println(pack);
            double priceForSend = pack.calculatePackPrice();

            System.out.println(priceForSend + "$");
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }




        Pack pack1 = new Pack();

        System.out.println(pack1);

        Pack pack2 = pack1;




        System.out.println(pack1.calculatePackPrice() + "$");
        System.out.println(pack2.calculatePackPrice() + "$");


        Pack[] packs = new Pack[100];

        for (int i = 0; i < packs.length; i++) {

            Pack packForTable = new Pack();
            packs[i] = packForTable;
        }


        double priceForTheAllPacks = 0;

        for(Pack displayPack: packs) {

            System.out.println(displayPack);

            System.out.println(displayPack.calculatePackPrice()+ "$");

            priceForTheAllPacks += displayPack.calculatePackPrice();




        }

        System.out.println("It's a price for the all packs " + Math.ceil(priceForTheAllPacks) + "$");




        PostOffice postOffice = new PostOffice();


        postOffice.postAPackage(pack2,50);

        postOffice.checkLastShippedPackage();




        Address senderAddress = new Address("Baltycka",30,63000);
        Address receiverAddress = new Address("Gdynska",15,62030);




        Letter letter = new Letter(senderAddress,receiverAddress);

        letter.priceList(letter.isPriority());

        System.out.println(letter);

        PostOffice postOffice1 = new PostOffice(letter);


        postOffice1.sendList(letter, 30);

        System.out.println(letter);

        postOffice1.postman();


        System.out.println(letter);



        List<String> nameList = new ArrayList<>();

        List<String> secondList = new ArrayList<>();

        nameList.add("Szymon");
        nameList.add("Ola");
        nameList.add("Karolina");
        nameList.add("Dawid");
        nameList.add("Andrzej");

        secondList.add("Jadwiga");
        secondList.add("Piotr");

        System.out.println(nameList);

        System.out.println(secondList);



        String name = nameList.get(0);

        System.out.println(name);

        nameList.add(1,"Pawel");

        nameList.remove(1);

        secondList.addAll(nameList);

        for (String nameInList: secondList) {
            System.out.println(nameInList.toUpperCase());
        }

        for (String nameInList: secondList) {
            if(nameInList.endsWith("a")) {
                System.out.println(nameInList);
            }
        }

        System.out.println(nameList);

        System.out.println(secondList);















    }
}

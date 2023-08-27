package Post;

import java.util.Scanner;

public class PostOffice {

    private double profits;

    public void postAPackage(Pack pack, double payForSend) {

        if(pack.packPrice(pack.getWeight()) > payForSend) {

            System.out.println("You don't have enough money, to send package");

        } else {

            pack.isStatus("shipped");
            System.out.println("Package have been shipped ");
            profits += pack.packPrice(pack.getWeight());




        }



    }

    public void displayProfits() {

        System.out.println(profits + "$");
    }

    public Pack createPackage(){

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter name of sender");

        String sender = scanner.nextLine();

        System.out.println("Enter name of recipient");

        String recipient = scanner.nextLine();

        System.out.println("Enter package weight");

        double weight = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Is priority? Y/N");

        String checkingPriority = scanner.nextLine().toUpperCase();

        boolean priority = checkPriority(checkingPriority);

        Pack pack = new Pack(sender,recipient,weight,priority);

        return pack;









    }

    private boolean checkPriority(String userAnswer) {

        if (userAnswer.equals("Y")) {

            return true;
        } else {
            return false;
        }


    }

    public void checkLastShippedPackage(Pack pack) {

        if(pack != null) {
            System.out.println("Last package: ");
            System.out.println(pack);
        } else {

            System.out.println("We don't have information about last shipped package");

        }



    }


}

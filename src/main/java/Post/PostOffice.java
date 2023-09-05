package Post;


import java.util.Scanner;

public class PostOffice {

    private Letter[] letters;

    private double profits;

    private String lastSent;



    public PostOffice(Letter lists) {
        this.letters = new Letter[]{lists};


    }

    public PostOffice(){
        this.lastSent = null;
    }





    public double postAPackage(Pack pack, double payForSend) {

        if(pack.calculatePackPrice() > payForSend) {

            System.out.println("You don't have enough money, to send package");

            return 0;

        } else {

            pack.setStatus("shipped");
            System.out.println("Package have been shipped ");
            profits += pack.calculatePackPrice();




        }

        lastSent = String.valueOf(pack);

        return profits - payForSend;


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

    public void checkLastShippedPackage() {

        if(lastSent != null) {
            System.out.println("Last package: " + lastSent);

        } else {

            System.out.println("We don't have information about last shipped package");

        }



    }


    public void sendList(Letter letter, double payForList ) {

        Letter allLetter = new Letter();

        int freePlace = findFreePlace();

        if (payForList < allLetter.priceList(true)) {

            System.out.println("You don't have enough money, to send letters");
        } else {
             if (freePlace >= 10) {

                System.out.println("We can only send 10 letters");


            }


        }
    }


        private int findFreePlace() {
            for(int i = 0; i< letters.length; i++) {

                if(letters[i] == null)
                    return i;

            }
            return -1;

        }


        public void postman() {

            for(Letter sentLetter : letters) {
                if(sentLetter != null){
                    sentLetter.sendLetter();
                }
            }





        }



}







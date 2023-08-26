package workshop;

public class Repair {


    private Receipt receipt;

    public Receipt getReceipt(Receipt receipt) {
        return receipt;
    }

    public void repairACar(Car car) {
        Wheels[] wheel = car.getWheels();

        for(Wheels wheels: wheel){
            if(!wheels.checkPresure()){
                wheels.repairWheel();
                System.out.println("The tire was repair");




            }else {
                System.out.println("The tire was not punctured");
            }
        }

        System.out.println(getReceipt(new Receipt()));





    }




}

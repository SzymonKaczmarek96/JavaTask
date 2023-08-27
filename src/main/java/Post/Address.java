package Post;

public class Address {

    private String streetName;

    private int houseNumber;


    private int zipCode;



    public Address(String streetName,int houseNumber,int zipCode) {

        if(zipCode > 99999 || zipCode < 10000) {

            throw new IllegalArgumentException("Error, wrong zip code");
        }


        if(houseNumber < 0) {

            throw new IllegalArgumentException("House number must be bigger than 0");
        }


        this.streetName = streetName;

        this.houseNumber = houseNumber;

        this.zipCode = zipCode;


    }

    @Override
    public String toString() {
        return "Address = " +
                "streetName = '" + streetName + '\'' +
                ", houseNumber = " + houseNumber +
                ", zipCode = " + zipCode;

    }
}

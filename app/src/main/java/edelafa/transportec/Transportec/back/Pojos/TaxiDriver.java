package edelafa.transportec.Transportec.back.Pojos;

public class TaxiDriver extends BasePojo{

    public String name;

    public String lastName;

    public String age;

    public String address;

    public String folioNumber;

    public String phoneNumber;

    public String taxiNumber;

    public TaxiDriver(String name, String lastName, String age, String address, String folioNumber, String phoneNumber, String taxiNumber){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.folioNumber = folioNumber;
        this.phoneNumber = phoneNumber;
        this.taxiNumber = taxiNumber;
    }

}

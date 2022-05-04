package task5;

public class Main {
    public static void main(String[] args) {
        Address address = new Address();
        address.setIndex(5646);
        address.setCountry("Ukraine");
        address.setCity("Lviv");
        address.setStreet("Grove Street");
        address.setHouse(25);
        address.setApartment(381);

        System.out.println(address.getIndex() + " " +
                           address.getCountry() + " " +
                           address.getCity() + " " +
                           address.getStreet() + " " +
                           address.getHouse() + " " +
                           address.getApartment());


        System.out.println(address); // через toString


    }
}

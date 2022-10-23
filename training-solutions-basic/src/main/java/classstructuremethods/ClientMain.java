package classstructuremethods;

public class ClientMain {

    public static void main(String[] args) {

        Client client = new Client();

        client.setName("Cormac");
        System.out.println(client.getName());

        client.setYear(1933);
        System.out.println(client.getYear());

        client.setAddress("USA");
        System.out.println(client.getAddress());

        client.migrate("Rhode Island");
        System.out.println(client.getAddress());

    }
}

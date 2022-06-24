package chapters.chapter8;

public class ShipmentTest {
    public static void main(String[] args) {

        Shipment shipment1 = new Shipment(5, 10, 8, 15, 25000);
        Shipment shipment2 = new Shipment(10, 7, 9, 6, 20000);
        double vol;

        vol = shipment1.volume();
        System.out.println("OбЬeм shipment1 равен : " + vol);
        System.out.println("вес shipment1 равен  : " + shipment1.weight);
        System.out.println("цена shipment1 равен $ " + shipment1.cost);
        System.out.println();

        vol = shipment2.volume();
        System.out.println("OбЬeм shipment2 равен : " + vol);
        System.out.println("вес shipment1 равен  : " + shipment2.weight);
        System.out.println("цена shipment1 равен $ " + shipment2.cost);

    }
}

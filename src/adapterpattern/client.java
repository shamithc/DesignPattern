package adapterpattern;

public class client {

    public static void main(String[] args) {
//        ICar iCar = new TataCar();
//        iCar.drive();
        IToyCar iToyCar = new ToyCarImpl();

        CarAdapter carAdapter = new CarAdapter(iToyCar);
        carAdapter.drive();


    }
}

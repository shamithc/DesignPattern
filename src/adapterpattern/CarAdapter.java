package adapterpattern;

public class CarAdapter implements ICar {

    private IToyCar iToyCar;

    public CarAdapter(IToyCar iToyCar) {
        this.iToyCar = iToyCar;
    }


    @Override
    public void drive() {
        iToyCar.push();
    }
}

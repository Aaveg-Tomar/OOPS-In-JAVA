package Interface;

public class ElectricEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Electric Start");
    }

    @Override
    public void stop() {
        System.out.println("Electric Stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Electric accelerate");

    }
}

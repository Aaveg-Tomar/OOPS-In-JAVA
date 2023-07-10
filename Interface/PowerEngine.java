package Interface;

public class PowerEngine implements Engine{
    @Override
    public void start() {
        System.out.println("Power start");
    }

    @Override
    public void stop() {
        System.out.println("power Stop");

    }

    @Override
    public void accelerate() {
        System.out.println("Power accelerate");

    }
}

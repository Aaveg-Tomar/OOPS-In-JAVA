package Interface;

public class Car implements Brake, Engine , Music {

    @Override
    public void brake() {
        System.out.println("I am a brake");

    }

    @Override
    public void start() {
        System.out.println("I am a start");

    }

    @Override
    public void stop() {
        System.out.println("I am Stop");

    }

    @Override
    public void accelerate() {
        System.out.println("I am a accelerate");

    }
}

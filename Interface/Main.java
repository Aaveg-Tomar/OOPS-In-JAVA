package Interface;

public class Main {
    public static void main(String[] args) {
//        Car cr = new Car();
//        cr.accelerate();
//        cr.brake();
//        cr.start();
//        cr.stop();
//
//        MediaMusic mu = new MediaMusic();
//        mu.start();
//        mu.stop();

        NiceCar cr = new NiceCar();
        cr.start();
        cr.startMusic();
        cr.upgradedEngine();
        cr.start();

    }
}

package Interface;

public class MediaMusic implements Music{
    @Override
    public void stop() {
        System.out.println("stop music");

    }

    @Override
    public void start() {
        System.out.println("rock Music");

    }
}

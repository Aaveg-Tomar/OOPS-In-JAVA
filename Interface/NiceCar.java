package Interface;

public class NiceCar {
    private Engine engine;
    private Music player = new MediaMusic();

   public NiceCar()
    {
        engine = new PowerEngine();
    }

    public NiceCar(Engine engine)
    {
        this.engine = engine;
    }

    public void start()
    {
        engine.start();
    }
    public void stop()
    {
        engine.stop();
    }

    public void startMusic()
    {
        player.start();
    }

    public void stopMusic()
    {
        player.stop();
    }

    public void upgradedEngine()
    {
        engine = new ElectricEngine();
    }
}

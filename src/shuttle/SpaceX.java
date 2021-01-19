package shuttle;

import java.util.Random;

public class SpaceX implements IStart {
    Random random = new Random();

    @Override
    public boolean startCheck() {
        return random.nextBoolean();
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели SpaceX запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX.");
    }
}

package shuttle;

import java.util.Random;

public class Shuttle implements IStart {

    Random random = new Random();

    @Override
    public boolean startCheck() {
        int randomNum = random.nextInt(11);
        if( randomNum > 3 ) {
            System.out.println("Предстартовая проверка пройдена успешно.");
            return true;
        } else {
            System.out.println("Предстартовая проверка не пройдена.");
            return false;
        }
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла.");
    }
}

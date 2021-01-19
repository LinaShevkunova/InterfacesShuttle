package shuttle;

public class Spaceport {

    void starting(IStart istart) {
        if (istart.startCheck() == false) {
            System.out.println("Предстартовая проверка не пройдена.");
        } else {
            istart.startEngines();
            {
                for (int i = 10; i > 0; i--)
                    System.out.println(i);
                istart.start();
            }
        }
    }
}

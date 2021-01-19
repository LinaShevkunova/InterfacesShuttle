package shuttle;

public class Main {
    public static void main(String[] args) {

        Spaceport spaceport = new Spaceport();

        Shuttle shuttle = new Shuttle();
        spaceport.starting(shuttle);
        System.out.println("__________________");
        SpaceX spaceX = new SpaceX();
        spaceport.starting(spaceX);


    }
}

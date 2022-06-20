package classes.boxing_game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("MIKE", 25, 110, 100, 25);
        Fighter f2 = new Fighter("ALI", 20, 110, 95, 40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();

    }

}

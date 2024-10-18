import java.util.Scanner;

public class OWHeroInfo {
    public static void main(String[] args) {
        System.out.println("Welcome to the OW Hero Info Getter! Here is the name of all the current heroes in the  game as of October 18, 2024.");
        System.out.println("");

        System.out.println("Tanks: ");
        TankHeroes tank = new TankHeroes();
        System.out.println("");

        System.out.println("DPS: ");
        DamageHeroes dps = new DamageHeroes();
        System.out.println("");

        System.out.println("Supports: ");
        SupportHeroes support = new SupportHeroes();
        System.out.println("");
    }

}
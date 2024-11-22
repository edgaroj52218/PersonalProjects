import java.util.Scanner;

//import javax.swing.plaf.synth.SynthSplitPaneUI;

public class OWHeroInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Overwatch statistics!\nInput the name of the hero you want to view their stats,\nor input \"Tank\", \"DPS\", \"Support\" for the name off all heroes from that class.");
        String userinput = scan.nextLine();

        TankHeroes tank = new TankHeroes();
        DamageHeroes dps = new DamageHeroes();
        SupportHeroes support = new SupportHeroes();
        if (userinput.equalsIgnoreCase("Tank")) {
            System.out.println(tank);
        }
        else if (userinput.equalsIgnoreCase("DPS")) {
            System.out.println(dps);
        }
        else if (userinput.equalsIgnoreCase("Support")) {
            System.out.println(support);
        }
        else {
            System.out.println("Input not recognized.");
        }

        scan.close();
    }

}
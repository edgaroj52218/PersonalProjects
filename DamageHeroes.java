//import java.time.DateTimeException;
import java.util.ArrayList;

public class DamageHeroes {
    ArrayList<String> dpsheroes;
    public DamageHeroes() {
        this.dpsheroes = new ArrayList<String>();
        //name of all current dps heroes
        dpsheroes.add("Ashe");
        dpsheroes.add("Bastion");
        dpsheroes.add("Cassidy");
        dpsheroes.add("Echo");
        dpsheroes.add("Genji");
        dpsheroes.add("Hanzo");
        dpsheroes.add("Junkrat");
        dpsheroes.add("Mei");
        dpsheroes.add("Pharah");
        dpsheroes.add("Reaper");
        dpsheroes.add("Sojourn");
        dpsheroes.add("Soldier: 76");
        dpsheroes.add("Sombra");
        dpsheroes.add("Symmetra");
        dpsheroes.add("Torbjorn");
        dpsheroes.add("Tracer");
        dpsheroes.add("Venture");
        dpsheroes.add("Widowmaker");
        //print all damage heroes
        for (int i = 0; i < dpsheroes.size(); i++) {
            System.out.println(dpsheroes.get(i));
        }
    }
    public static void main(String[] args) {
        // Create an instance of TankHeroes
        new DamageHeroes();
    }
}

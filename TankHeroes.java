import java.util.ArrayList;

public class TankHeroes {
    ArrayList<String> tankheroes;

    public TankHeroes() {
        this.tankheroes = new ArrayList<>();

        //name of all current tank heroes
        tankheroes.add("D.va");
        tankheroes.add("Doomfist");
        tankheroes.add("Junker Queen");
        tankheroes.add("Mauga");
        tankheroes.add("Orisa");
        tankheroes.add("Ramattra");
        tankheroes.add("Reinhardt");
        tankheroes.add("Roadhog");
        tankheroes.add("Sigma");
        tankheroes.add("Winston");
        tankheroes.add("Wrecking Ball");
        tankheroes.add("Zarya");        
        
        //print all tank heroes
        for (int i = 0; i < tankheroes.size(); i++) {
            System.out.println(tankheroes.get(i));
        }
    }
    public static void main(String[] args) {
        // Create an instance of TankHeroes
        new TankHeroes();
    }
}
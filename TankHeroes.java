import java.util.ArrayList;

public class TankHeroes {
    ArrayList<String> tankheros;

    public TankHeroes() {
        tankheroes = new ArrayList<>();

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
        System.out.println(tankheroes);
    }
    
        public void getHeroStats(String heroName) {
            heroName = heroName.toLowerCase();

            if (tankheroes.contains(heroName.substring(0,1).toUpperCase() + heroName.substring(1))); {

                System.out.println((heroName + "Stats: "));
            }
        }
    }
}
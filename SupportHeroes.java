import java.util.ArrayList;

public class SupportHeroes {
    ArrayList<String> supportHeroes;
    public SupportHeroes() {
        this.supportHeroes = new ArrayList<String>();
        //list of current support heroes
        supportHeroes.add("Ana");
        supportHeroes.add("Baptiste");
        supportHeroes.add("Brigitte");
        supportHeroes.add("Illari");
        supportHeroes.add("Juno");
        supportHeroes.add("Kiriko");
        supportHeroes.add("Lifeweaver");
        supportHeroes.add("Lucio");
        supportHeroes.add("Mercy");
        supportHeroes.add("Moira");
        supportHeroes.add("Zenyatta");

        //print all support heroes
        for (int i = 0; i < supportHeroes.size(); i ++) {
            System.out.println(supportHeroes.get(i));
        }
    }
        public static void main (String[] args) {
            new SupportHeroes();
        }
    }    

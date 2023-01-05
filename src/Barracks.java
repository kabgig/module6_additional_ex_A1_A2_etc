import java.util.ArrayList;

public class Barracks {

    ArrayList<Soldier> home;

    public Barracks() {
        this.home = new ArrayList<>();
    }

    public void add(Soldier a) {
        if (home.size() > 3)
            System.out.println("no space");
        else home.add(a);
    }

    public void visit() {
        for (var a : home){
            System.out.println(a.phrase);
        }
    }
}

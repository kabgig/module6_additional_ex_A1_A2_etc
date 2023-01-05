import java.util.ArrayList;

public class EX2_Barracks {

    ArrayList<EX2_Soldier> home;

    public EX2_Barracks() {
        this.home = new ArrayList<>();
    }

    public void add(EX2_Soldier a) {
        if (home.size() > 3)
            System.out.println("full");
        else home.add(a);
    }

    public void visit() {
        for (var a : home){
            System.out.println(a.phrase);
        }
    }
}

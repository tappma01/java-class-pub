package exercise6;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private HashSet<Kangaroo> mob;
    
    public KangarooMob(Kangaroo kangaroo){
        mob.add(kangaroo);
    }
    public void addKangaroo(Kangaroo kangaroo){
        mob.add(kangaroo);
    }
    public HashSet getArmy(){
        return mob;
    }
    
    public HashSet getChief(){
        return mob.get(mob.size() - 1);
    }
    
}

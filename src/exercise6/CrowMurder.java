package exercise6;
import java.util.ArrayList;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private  ArrayList<Crow> murder;
    
    public CrowMurder(Crow crow){
        murder.add(crow);
    }
    
    public void addCrow(Crow crow){
        murder.add(crow);
    }
    
    public ArrayList getMurder(){
        return murder;
    }
    
    public Crow getChief(){
        return murder.get(murder.size() - 1);
    }
    
}

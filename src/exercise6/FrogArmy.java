package exercise6;

import java.util.ArrayList;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {

    private  ArrayList<Frog> army;
    
    public FrogArmy(Frog frog){
        army.add(frog);
    }
    
    public void addFrog(Frog frog){
        army.add(frog);
    }
    
    public ArrayList getArmy(){
        return army;
    }
    
    public Frog getChief(){
        return army.get(army.size() - 1);
    }
    
}


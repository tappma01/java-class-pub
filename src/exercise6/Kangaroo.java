package exercise6;

/**
 * Class Kangaroo
 * @author yasiro01
 */
public class Kangaroo {
    private String name;
    private int age;
    private int babies = 1;
    
    public Kangaroo(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setIq(int newBabies){
        babies = newBabies;
    }
    
    public String getName(){
        return name;
}
    public int getAge(){
        return age;
}
    public int getBabies(){
        return babies;
}
    @Override
    public String toString(){
        return "Kangaroo{name=" + name + " age=" + age + " babies=" + babies + "}";
    }
}

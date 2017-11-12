package exercise6;

/**
 * Class Crow
 * @author yasiro01
 */
public class Crow {
    private String name;
    private int age;
    private int iq = 100;
    
    public Crow(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setIq(int newIq){
        iq = newIq;
    }
    
    public String getName(){
        return name;
}
    public int getAge(){
        return age;
}
    public int getIq(){
        return iq;
    } 
    @Override
    public String toString(){
        return "Crow{name=" + name + " age=" + age + " iq=" + iq + "}";
    }
}


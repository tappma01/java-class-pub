package exercise6;

/**
 * Class Owl
 * @author yasiro01
 */
public class Owl {
    private String name;
    private int age;
    private String wisdom = "medium";
    
    public Owl(String name, int age, String wisdom){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setWisdom(String newWisdom){
        wisdom = newWisdom;
    }
    
    public String getName(){
        return name;
}
    public int getAge(){
        return age;
}
    public String getWisdom(){
        return wisdom;
}
    @Override
    public String toString(){
        return "Owl{name=" + name + " age=" + age + " wisdom=" + wisdom + "}";
    }
}

package exercise6;

/**
 * Class Frog
 * @author yasiro01
 */
public class Frog {
    private String name;
    private int age;
    private String color = "Green";
    
    public Frog(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void setColor(String newColor){
        color = newColor;
    }
    
    public String getName(){
        return name;
}
    public int getAge(){
        return age;
}
    public String getColor(){
        return color;
}
    @Override
    public String toString(){
        return "Frog{name=" + name + " age=" + age + " color=" + color + "}";
    }
}

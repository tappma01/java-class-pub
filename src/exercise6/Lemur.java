package exercise6;

/**
 * Class Lemur
 * @author yasiro01
 */
public class Lemur {
    private String name;
    private int age;
    private int tailLength = 20;
    
    public Lemur(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void setName(String newName){
        name = newName;
    }
    public void setAge(int newAge){
        age = newAge;
    }
    public void settailLength(int newTailLength){
        tailLength = newTailLength;
    }
    
    public String getName(){
        return name;
}
    public int getAge(){
        return age;
}
    public int getTailLength(){
        return tailLength;
}
    @Override
    public String toString(){
        return "Lemur{name=" + name + " age=" + age + " tail length=" + tailLength + "}";
    }
}

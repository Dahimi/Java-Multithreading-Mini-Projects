package human;
import java.util.*;

public class Human {
    public static int nextId = 0;
    private int id;
    private List<Human> children = new ArrayList<>();
    protected int age;
    protected String name;
    protected int course;

    protected int[] size;

   

    public static final int FIRST = 1;
    public static final int SECOND = 2;
    public static final int THIRD = 3;
    public static final int FOURTH = 4;
    

    public Human(String name , int age ) {
       this.name = name;
       this.age = age ;
        this.id = nextId;
        nextId++;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public List<Human> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void addChild(Human human ){
        children.add(human);
    }
    public void removeChild(Human human){
        children.remove(human);
    }
    public int getCourse() {
        return course;
    }

    public void live() {
       
           
    }

    public void fight() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void printSize() {
        System.out.println("Height: " + size[0] + " Weight: " + size[1]);
    }
}
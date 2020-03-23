/**
 * 
 */
import java.util.*;
/**
 * @author pc
 *
 */
public class Snake {
	 private boolean isAlive ;
	 private List<SnakeSection> sections ;
	    private SnakeDirection direction ;
	    public Snake(int x , int y){
	        isAlive = true;
	        SnakeSection head = new SnakeSection(x,y);
	        sections = new ArrayList<SnakeSection>();
	        sections.add(head);
	    }
	    public int getX(){
	        return sections.get(0).getX();
	    }
	    public int getY(){
	        return sections.get(0).getY();
	    }
	    public boolean isAlive(){
	        return isAlive ;
	    }
	    public SnakeDirection getDirection(){
	        return direction;
	    }
	    public void setDirection(SnakeDirection direction){
	        this.direction = direction ;
	    }
	    public List<SnakeSection> getSections(){
	        return sections;
	    }
	    public void move(){
	        
	    }
}

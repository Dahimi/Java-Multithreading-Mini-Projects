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
	    private SnakeSection head  ;
	    public Snake(int x , int y){
	        isAlive = true;
	         head = new SnakeSection(x,y);
	        sections = new ArrayList<SnakeSection>();
	       
	    }
	    public int getX(){
	        return head.getX();
	    }
	    public int getY(){
	        return head.getY();
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
	    	if(isAlive == false) return;
	    	switch(this.direction) {
	    	case UP : move(0,-1);
	    		break ;
	    	case RIGHT : move(1,0);
	    		break ;
	    	case DOWN : move(0,1);
	    		break ;
	    	case LEFT : move(1,0);
	    		break ;
	    		
	    	}
	        
	    }
	    public void move(int x , int y){
	        
	    }
	    public void checkBorders(SnakeSection head) {
			   isAlive =(head.getX() >= Room.game.getWidth() || head.getX() < 0) ? false :( (head.getY() < 0 || head.getY() >= Room.game.getHeight() ) ? false : true)  ;
			    	   
	}		
			 public void checkBody(SnakeSection head) {
				 isAlive = ! sections.contains(head);
			 }
}
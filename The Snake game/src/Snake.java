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
	    public void move()  {
	    	if(isAlive == false) return;
	    	switch(this.direction) {
	    	case UP : move(-1,0);
	    		break ;
	    	case RIGHT : move(0,1);
	    		break ;
	    	case DOWN : move(1,0);
	    		break ;
	    	case LEFT : move(0,-1);
	    		break ;
	    		
	    	}
	        
	    }
	    public void move(int x , int y)  {
	    	 
	         SnakeSection formerHead = null;
	         checkBorders(head);
	         checkBody(head);
	         
	         if(isAlive) {
	         try {
				formerHead = head.clone();
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	         sections.add(0, formerHead);
	         head.setX(getX() + x);
	         head.setY(getY() + y); 
	         if(Room.game.getMouse().getX() == this.getX() &&  Room.game.getMouse().getY() == this.getY() ) {
	        	 Room.game.eatMouse();
	         }
	         else sections.remove(sections.size()-1);
	       
	         }
	       
	         
	    }
	    public void checkBorders(SnakeSection head) {
			   isAlive =(head.getX() >= Room.game.getHeight()-1 || head.getX() < 0) ? false :( (head.getY() < 0 || head.getY() >= Room.game.getWidth()-1 ) ? false : true)  ;
			    	   
	}		
			 public void checkBody(SnakeSection head) {
				 if(isAlive) {
				 isAlive = ! sections.contains(head);
			 }}
}
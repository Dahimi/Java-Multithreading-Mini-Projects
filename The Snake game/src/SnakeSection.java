
public class SnakeSection implements Cloneable{
	 @Override
	protected SnakeSection clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (SnakeSection)super.clone();
	}
	private int x ;
	private int y ;
	   public  SnakeSection(int x , int y){
	        this.x = x ;
	        this.y = y;
	    }
	   public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}

		@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SnakeSection other = (SnakeSection) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

		public int getX(){
	        return x;
	    }
	    public int getY(){
	        return y;
	    }
}

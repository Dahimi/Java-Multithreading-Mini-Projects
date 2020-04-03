package Game_Package;

public class Canvas {
	private int width ;
	private int height;
	private char[][] matrix ;
	public Canvas(int width, int height) {
	
		this.width = width;
		this.height = height;
		this.matrix = new char[height+2][width+2];
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public char[][] getMatrix() {
		return matrix;
	}
	public void setMatrix(char[][] matrix) {
		this.matrix = matrix;
	}
	public void setPoint(double x , double y , char c) {
	if	(x < 0 || y < 0 || y >= matrix.length || x >= matrix[0].length ) return;
	int x_rounded = round(x);
	int y_rounded = round(y);
	matrix[y_rounded][x_rounded] = c ;
	}
	public void drawMatrix(double x, double y, int[][] matrix ,char c) {
		for(int i =0; i < matrix.length ; i++)
			for(int j = 0 ; j < matrix[0].length ;j++ ) {
				if(matrix[i][j] != 0)
				setPoint(x + j , y + i, c);
			}
	}
	private int round(double x) {
		if(x - (int) x >= 0.5) return (int) x + 1 ;
		return (int) x;
	}
	public void clear() {
		this.matrix = new char[height+2][width + 2];
	}
	public void print() {
		for(int i = 0 ; i < matrix.length ; i++) {
			for(int j = 0 ; j < matrix[0].length ; j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.println();
		}
	}

}

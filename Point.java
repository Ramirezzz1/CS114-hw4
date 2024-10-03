package comparables;
import java.util.ArrayList;

public class Point implements Comparable<Point>{
	private int x;
	private int y;
	
	private static ArrayList<Point> ALL_POINTS = new ArrayList<>();
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		ALL_POINTS.add(this);
	} 
	
	public double xCoord() {
		return x;
	}
	
	public double yCoord() {
		return y;
	}
	
	public void move(int newX, int newY) {
		x = newX;
		y = newY;
	}
	
	@Override
	public String toString() {
		return String.format("(%s,%s)", x,y);
	}
		
	public static int howManyPoints() {
		// TO DO
		return ALL_POINTS.size();
	}
	
	public static Point getPoint(int index) {
		// TO DO
		if(index<=0||index>ALL_POINTS.size()) {
			return null;
		}
		return ALL_POINTS.get(index-1); //STUB
	}
	public static boolean isSuchPoint(int x, int y) {
		// TO DO
		for(Point p : ALL_POINTS) {
			if(p.x == x && p.y == y) {
				return true;
			}
		}
		return false; //STUB
	}
	
	public static Point firstPoint() {
		// TO DO
		if(ALL_POINTS.isEmpty()) {
			return null;
		}
		return ALL_POINTS.get(0); //STUB
	}
	public static Point lastPoint() {
		// TO DO
		if(ALL_POINTS.isEmpty()) {
			return null;
		}
		return ALL_POINTS.get(ALL_POINTS.size()-1); //STUB
	}
	
	public static Point[] getAllpoints() {
		// TO DO
		return ALL_POINTS.toArray(new Point[ALL_POINTS.size()]); //STUB
	}

	@Override
	public int compareTo(Point o) {
		// TODO Auto-generated method stub
		if(this.y>o.y) {
			return 1;
			
		} else if(this.y < o.y) {
			return -1;
		}
		
		if(this.x>o.x) {
			return 1;
			
		}else if (this.x < o.x) {
			return -1;
		}
		return 0;
	}
}  
	


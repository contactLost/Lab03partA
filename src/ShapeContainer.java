import java.util.*;
/**This class creates a collection of shapes
 * @date 30.10.19
 * @author Tuna Dalbeler
 */
public class ShapeContainer {

	private ArrayList<Shape> shapeList;

	ShapeContainer(){
		shapeList = new ArrayList<Shape>();
	}

	/**This method adds a shape to collection
	 * @param s Shape
	 */
	public void add(Shape s) {
		shapeList.add(s);

	}
	
	/** This method computes all shapes' area and returns the area
	 * @return area The area of all shapes.
	 */
	public double getArea() {
		double area;
		area = 0.0;
		int size = (shapeList.size());
		
		if( size != 0) {
			for(int i = 0; i < size; i++) {
				area = area + shapeList.get(i).getArea();
			}
		}
		else {System.out.println("No shape");
				area = -1;
			}
		return area;
	}
	/**Returns the string representation of all shapes in collection
	 * @return str String rep.
	 */
	public String toString() {
		String str;
		str = "";
		int size = (shapeList.size());
		
		if( size != 0) {
			for(int i = 0; i < size; i++) {
			//	str = str + i + " " + shapeList.get(i).getSHAPETYPE() + " " + shapeList.get(i).getArea() + "\n";
				str = str + i + " " + shapeList.get(i).toString() + "\n";
			}
		}
		else {System.out.println("No shape");
				str = "";
			}
		
		return str;
	}
}//Class end
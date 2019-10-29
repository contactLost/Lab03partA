
public class Circle extends Shape{

	private int radius;
	private final String SHAPETYPE = "Circle";
	

	Circle(int radius){	
		this.radius = radius;
	}
	
	

	/** This method computes the area of circle and returns the area.
	 * @return area Area of circle
	 */
	public double getArea() {
		double area;
		area = Math.PI * (double) radius * (double) radius;
		return area;
	}

	//Getters and Setters
	
	/**This method returns the radius
	 * @return the radius
	 */
	public int getRadius() {
		return radius;
	}

	/**This method sets the radius
	 * @param radius the radius to set
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/**This method returns the Shape Type
	 * @return SHAPETYPE
	 */
	public String getSHAPETYPE() {
		return SHAPETYPE;
	}

	/**This method returns a string representation of the Circle
	 * @return str String
	 */
	public String toString() {
		String str;
		
		str = SHAPETYPE + " " + getArea();
		
		return str;
	}



	@Override
	public abstract void  setLocation(double x,double y);



	

}

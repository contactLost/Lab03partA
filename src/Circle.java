/**This class creates a circle object
 * @author Tuna Dalbeler
 */ 
public class Circle extends Shape{

	private int radius;
	private final String SHAPETYPE = "Circle";
	private boolean select;

	Circle(int radius){ 
		this.radius = radius;
		x = 0;
		y = 0;
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

	/** This method returns true if the shape selected
	 * 
	 */
	@Override
	public boolean getSelected() {
		if(select) {		//Select = true then return true
			return true;
		}
		else{				//Select = false then retrun false
			return false;
		}
	}

	/**This method sets the select condition
	 * 
	 */
	@Override
	public void setSelected(boolean bool) {
		select = bool;
	}

	/**This method returns a string representation of the Circle
	 * @return str String
	 */
	public String toString() {
		String str;

		str = SHAPETYPE + " " + getArea() + " Selected: " + getSelected();;

		return str;
	}



	@Override
	public Shape contains(int x, int y) {

		double distanceofPoint = 0;
		double radiusD = (int) radius;

		distanceofPoint = Math.sqrt((double)((x-this.x)*(x-this.x)) + (double)((y-this.y)*(y-this.y)) );

		if(distanceofPoint < radiusD) {
			return this;
		}

		return null;
	}

}


public class Rectangle extends Shape{

	//Properties

	protected int width;
	protected int height;
	private final String SHAPETYPE = "Rectangle";



	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;

	}

	/** Computes the shapes area and returns it.
	 * @return area
	 */
	public double getArea() {	 
		double area;
		area = width * height;	
		return area;
	}



	//Getters and Setters

	/** Returns the width
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/** Sets the width
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/** Returns the height
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/** Sets the height
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**This method returns the Shape type
	 * @return SHAPETYPE
	 */
	public String getSHAPETYPE() {
		return SHAPETYPE;
	}
	
	//Other methods
	
	/**This method returns a string representation of the rectangle
	 * @return str String
	 */
	public String toString() {
		String str;
		
		str = SHAPETYPE + " " + getArea();
		
		return str;
	}


}
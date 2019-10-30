/**This class creates a Rectangle object
 * @author Tuna Dalbeler
 */ 
public class Rectangle extends Shape{

	//Properties

	protected int width;
	protected int height;
	private final String SHAPETYPE = "Rectangle";
	protected boolean select;



	public Rectangle(int width, int height) {

		this.width = width;
		this.height = height;
		select = false;
		x = 0;
		y = 0;

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

		str = SHAPETYPE + " " + getArea()+ " Selected: " + getSelected();

		return str;
	}

	/** This method returns true if the shape selected
	 * 
	 */
	@Override
	public boolean getSelected() {
		if(select) {		//Select = true then return true
			return true;
		}
		else{				//Select = false then return false
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

	@Override
	public Shape contains(int x, int y) {

		boolean containsX = false;
		boolean containsY = false;

		if(x < this.x +(width/2) && x > this.x-(width/2)) {
			containsX = true;
		}

		if(y < this.y + (height/2) && y > this.y-(height/2) ) {
			containsY = true;
		}

		if(containsX && containsY) {
			return this;
		}

		return null;
	}


}
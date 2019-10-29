
public class Square extends Rectangle {
	
	private final String SHAPETYPE = "Square";
	
	Square(int side) {
		
		super(side,side);
		
	}

	/**This method returns the shape type
	 * @return the SHAPETYPE
	 */
	public String getSHAPETYPE() {
		return SHAPETYPE;
	}

	/**This method returns a string representation of the rectangle
	 * @return str String
	 */
	public String toString() {
		String str;
		
		str = SHAPETYPE + " " + getArea();
		
		return str;
	}
}

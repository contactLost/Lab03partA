
public abstract class Shape implements Locatable{

	protected double x;
	protected double y;
	
	public abstract double getArea();

	protected abstract String getSHAPETYPE();
	
	public double getX() {
		return x;
	}
	
	public double getY(){
		return y;
	}
	
	public void setLocation(double x, double y){
		this.x = x;
		this.y = y;
	}
}

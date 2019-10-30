/**This class holds the abstract shape
 * @author Tuna Dalbeler
 */ 
public abstract class Shape implements Locatable, Selectable{

 protected int x;
 protected int y;
 
 public abstract double getArea();

 protected abstract String getSHAPETYPE();
 
 /**This method returns the x coordinate of the shape
  * @return x
  */ 
 public double getX() {
  return x;
 }
 
  /**This method returns the y coordinate of the shape
  * @return y
  */ 
 public double getY(){
  return y;
 }
 
  /**This method sets the x and y coordinate of the shape
  * @param x X coordinate
  * @param y Y coordinate
  */ 
 public void setLocation(int x, int y){
  this.x = x;
  this.y = y;
 }
}

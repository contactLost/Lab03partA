
public interface Selectable {

	boolean getSelected();
	
	void setSelected(boolean bool);
	
	Shape contains(int x, int y);
}

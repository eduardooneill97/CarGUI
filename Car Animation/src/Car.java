import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
	private int xPos;
	private int yPos;
	private int width;
	private int height;
	
	public Car(int x, int y){
		this.setxPos(x);
		this.setyPos(y);
	}
	
	public int getxPos() {
		return xPos;
	}
	public void setxPos(int xPos) {
		this.xPos = xPos;
	}
	public int getyPos() {
		return yPos;
	}
	public void setyPos(int yPos) {
		this.yPos = yPos;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	public void draw(Graphics2D g2) {
		Rectangle body = new Rectangle(this.getxPos(), this.getyPos()+10, 60, 10);
		Ellipse2D.Double fTire = 
				new Ellipse2D.Double(this.getxPos()+10, this.getyPos()+20, 10, 10);
		Ellipse2D.Double rTire = 
				new Ellipse2D.Double(this.getxPos()+40, this.getyPos()+20, 10, 10);
		
		Line2D.Double backWindShield = 
				new Line2D.Double(this.getxPos()+10,this.getyPos()+10,this.getxPos()+20,this.getyPos());
		Line2D.Double ceiling = 
				new Line2D.Double(this.getxPos()+20,this.getyPos(),this.getxPos()+40,this.getyPos());
		Line2D.Double frontWindShield = 
				new Line2D.Double(this.getxPos()+40,this.getyPos(),this.getxPos()+50,this.getyPos()+10);
		
		g2.draw(body);
		g2.draw(fTire);
		g2.draw(rTire);
		g2.draw(backWindShield);
		g2.draw(frontWindShield);
		g2.draw(ceiling);

	}

}

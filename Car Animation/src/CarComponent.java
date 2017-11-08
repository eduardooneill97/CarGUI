import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarComponent extends JComponent {
	Car car1 = new Car(0,0);
	private int start = 1;
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		if(!(car1.getxPos()==0 && car1.getxPos()==getWidth() && start == 1)) {
			car1.setxPos(car1.getxPos()+2*car1.getDirection());
			if(start == 1)start = 0;			
		}
		if(car1.getxPos()+2 > getWidth()) {
			car1.setxPos(getWidth());
		}
		else if(car1.getxPos()-2 < -1*car1.getWidth()) {
			car1.setxPos(car1.getWidth()*-1);
		}
			
		if(car1.getxPos()==car1.getWidth()*-1 || car1.getxPos()==getWidth()) {
			car1.setDirection(car1.getDirection()*-1);
			car1.setyPos(car1.getyPos()+car1.getHeight());
		}
		
		
		car1.draw(g2);
	}

}

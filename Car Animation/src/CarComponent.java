import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;

public class CarComponent extends JComponent {
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Car car1 = new Car(getWidth()-60,getHeight()-30);
		car1.draw(g2);	
		
	}

}

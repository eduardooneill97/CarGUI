import javax.swing.JFrame;

public class CarViewer {
	public static void main(String[]args) {
		JFrame frame = new JFrame();
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		CarComponent component = new CarComponent();
		
		
		frame.add(component);		
		frame.setVisible(true);
		
	}

}

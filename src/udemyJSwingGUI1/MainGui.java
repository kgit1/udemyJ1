package udemyJSwingGUI1;
import javax.swing.*;

public class MainGui extends JFrame {
	public static void main(String[] args) {
		
		new MainGui();
		
		
		
	}
	public MainGui(){
		this.setSize(400,400);
		this.setTitle("Calculator");		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Hello world");
		panel.add(label);
		JButton button = new JButton("Click me");
		panel.add(button);
		this.add(panel);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}

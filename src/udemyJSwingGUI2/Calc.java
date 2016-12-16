package udemyJSwingGUI2;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calc extends JFrame {

	private JPanel Panel1;
	private JTextField tfFirstNumber;
	private JTextField tfSecondNumber;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
//		setPreferredSize(new Dimension(400, 400));
//		setMaximumSize(new Dimension(800, 800));
//		setMinimumSize(new Dimension(400, 400));
		setSize(328, 206);
		setBackground(Color.GREEN);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		Panel1 = new JPanel();
//		Panel1.setMaximumSize(new Dimension(600, 600));
//		Panel1.setMinimumSize(new Dimension(400, 400));
//		Panel1.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Panel1);
		
		JButton bAddition = new JButton("+");
		bAddition.setBounds(186, 32, 41, 20);
		bAddition.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		Panel1.setLayout(null);
		Panel1.add(bAddition);
		
		tfSecondNumber = new JTextField();
		tfSecondNumber.setBounds(22, 80, 128, 20);
		Panel1.add(tfSecondNumber);
		tfSecondNumber.setColumns(10);
		
		tfFirstNumber = new JTextField();
		tfFirstNumber.setBounds(22, 32, 128, 20);
		Panel1.add(tfFirstNumber);
		tfFirstNumber.setColumns(10);
		
		JLabel lFirstNumber = new JLabel("First Number");
		lFirstNumber.setBounds(35, 14, 89, 14);
		Panel1.add(lFirstNumber);
		
		JLabel lSecondNumber = new JLabel("Second Number");
		lSecondNumber.setBounds(32, 63, 92, 14);
		Panel1.add(lSecondNumber);
		
		JButton bSubstraction = new JButton("-");
		
		bSubstraction.setBounds(237, 32, 41, 20);
		Panel1.add(bSubstraction);
		
		JButton bMultiplication = new JButton("*");
		bMultiplication.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		bMultiplication.setBounds(186, 63, 41, 20);
		Panel1.add(bMultiplication);
		
		JButton bDivision = new JButton("/");
		bDivision.setBounds(237, 63, 41, 20);
		Panel1.add(bDivision);
		
		JLabel lAnswer = new JLabel("1");
		lAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 24));
		lAnswer.setBounds(10, 111, 172, 45);
		Panel1.add(lAnswer);
		
		JButton bAnswer = new JButton("=");
		bAnswer.setBounds(189, 130, 89, 23);
		Panel1.add(bAnswer);
		
		bSubstraction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int number1 = 0;
				int number2 = 0;
				try{
				number1 = Integer.parseInt(tfFirstNumber.getText());
				number2 = Integer.parseInt(tfSecondNumber.getText());
				} catch(Exception e1){
					JOptionPane.showMessageDialog(getComponent(0), "First number error", "ERROR", JOptionPane.ERROR_MESSAGE);
				}
				try{
					number2 = Integer.parseInt(tfSecondNumber.getText());
					} catch(Exception e1){
						JOptionPane.showMessageDialog(getComponent(0), "Second number error", "ERROR", JOptionPane.ERROR_MESSAGE);
					}
				
				int answer = number1-number2;
				lAnswer.setText(""+answer);
			}			
		});
	}
}

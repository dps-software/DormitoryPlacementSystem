import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class GUIMain {
	
	private static Software software;
	public static void main(String []args) {
	software = new Software();
	JFrame mainFrame = new JFrame("DPS");
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainFrame.setSize(800,600);
		
	
	JPanel mainPanel = new JPanel();
		
	JButton button1 = new JButton("Registered List");
	JButton button2 = new JButton("Reserved List");
	JButton button3 = new JButton("Payment List");

	mainPanel.add(button1);
	mainPanel.add(button2);
	mainPanel.add(button3);
	

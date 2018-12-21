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
		
	RegisteredList registeredList = software.registered;
	ReservedList reservedList = software.reserved;
	PaymentList paymentList = software.payment;
	
		
	mainFrame.add(mainPanel);
	mainFrame.setVisible(true);
	
	JButton takefromreserve = new JButton("Take From Reserve");
	
	button1.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			
			mainPanel.removeAll();
			mainPanel.add(button1);
			mainPanel.add(button2);
			mainPanel.add(button3);
			
			List<Student> studentList = registeredList.registeredList;
			
			String[] cols = {"Name", "Age", "Home City"};
			String[][] data = new String[studentList.size()][3];
			for(int i=0; i<studentList.size(); i++) {
				String[] row = new String[3];
				row[0] = studentList.get(i).getStudentName();
				row[1]= String.valueOf(studentList.get(i).getAge());
				row[2] = studentList.get(i).getHomeCity();
				
				
				data[i] = row;
			}
			
			JTable table = new JTable(data, cols);
			JScrollPane scrollPane = new JScrollPane(table);
			
			mainPanel.add(takefromreserve);
			mainPanel.add(scrollPane);
			
			
			mainFrame.revalidate();
			
		}
		});
		
		button2.addActionListener(new ActionListener(){
		
			@Override
		public void actionPerformed(ActionEvent e) {
		   List<Student> studentList = reservedList.reservedList;
			
			String[] cols = {"Name", "Age", "Home City"};
			String[][] data = new String[studentList.size()][3];
			
			for(int i=0; i<studentList.size(); i++) {
				String[] row = new String[3];
				row[0] = studentList.get(i).getStudentName();
				row[1]= String.valueOf(studentList.get(i).getAge());
				row[2] = studentList.get(i).getHomeCity();
				
				data[i] = row;
			}
			JTable table = new JTable(data, cols);
			JScrollPane scrollPane = new JScrollPane(table);
			
			mainPanel.add(scrollPane);
			mainFrame.revalidate();
		
		} 
			
	       JButton export = new JButton("Export");
	

	       button3.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent e) {
			
			mainPanel.removeAll();
			mainPanel.add(button1);
			mainPanel.add(button2);
			mainPanel.add(button3);
			
			List<Student> studentList = paymentList.paymentList;
				
			String[] cols = {"Name", "Payment"};
			String[][] data = new String[studentList.size()][2];
			for(int i=0; i<studentList.size(); i++) {
				String[] row = new String[2];
				row[0] = studentList.get(i).getStudentName();
				row[1]= String.valueOf(studentList.get(i).getPayment());
				
				data[i] = row;
			}
		});
		
		
	

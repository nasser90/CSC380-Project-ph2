import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.ComponentOrientation;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;

public class Main extends JFrame {

	private JPanel Pane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JPanel mainPane;
	private JPanel customerPane;
	private JPanel productsPane;
	private JPanel sectionPane;
	private JPanel salesPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		connectDb("select * from customer");
			
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	private static void connectDb(String q){
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con = DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/mydb","root","123");  
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery(q);  
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
		}
		catch(Exception e){ System.out.println(e);}  
	}
	
	
	/**
	 * Create the frame.
	 */
	public Main() {
		setResizable(false);
		setTitle("Supermarket System");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 500);
		setLocationRelativeTo(null);
		Pane = new JPanel();
		Pane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Pane);
		Pane.setLayout(new CardLayout(0, 0));
		
		mainPane = new JPanel();
		Pane.add(mainPane, "name_332235960475044");
		mainPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Customers");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(false);
				customerPane.setVisible(true);
			}
		});
		
		JLabel lblSupermarketSystem = new JLabel("Supermarket System");
		lblSupermarketSystem.setFont(new Font("Times New Roman", Font.BOLD, 30));
		lblSupermarketSystem.setHorizontalAlignment(SwingConstants.CENTER);
		lblSupermarketSystem.setBounds(10, 52, 634, 35);
		mainPane.add(lblSupermarketSystem);
		btnNewButton.setBounds(218, 140, 103, 93);
		mainPane.add(btnNewButton);
		
		JButton btnProducts = new JButton("Products");
		btnProducts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnProducts.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(false);
				productsPane.setVisible(true);
			}
		});
		btnProducts.setBounds(339, 140, 103, 93);
		mainPane.add(btnProducts);
		
		JButton btnSections = new JButton("Sections");
		btnSections.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSections.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(false);
				sectionPane.setVisible(true);
			}
		});
		btnSections.setBounds(339, 244, 103, 93);
		mainPane.add(btnSections);
		
		JButton btnSells = new JButton("Sales");
		btnSells.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSells.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(false);
				salesPane.setVisible(true);
			}
		});
		btnSells.setBounds(218, 244, 103, 93);
		mainPane.add(btnSells);
		
		JButton btnNewButton_2 = new JButton("Check Connection");
		btnNewButton_2.setBounds(218, 348, 224, 49);
		mainPane.add(btnNewButton_2);
		
		
		customerPane = new JPanel();
		Pane.add(customerPane, "name_332244430622373");
		customerPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField.setBounds(250, 117, 261, 29);
		customerPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblCustomerName = new JLabel("Customer ID:");
		lblCustomerName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerName.setBounds(137, 123, 99, 14);
		customerPane.add(lblCustomerName);
		
		JLabel label = new JLabel("Customer Name:");
		label.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label.setBounds(137, 171, 99, 14);
		customerPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_1.setColumns(10);
		textField_1.setBounds(250, 165, 261, 29);
		customerPane.add(textField_1);
		
		JLabel lblCustomerEmail = new JLabel("Customer Email:");
		lblCustomerEmail.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerEmail.setBounds(137, 219, 99, 14);
		customerPane.add(lblCustomerEmail);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_2.setColumns(10);
		textField_2.setBounds(250, 213, 261, 29);
		customerPane.add(textField_2);
		
		JButton btnNewButton_1 = new JButton("Create");
		btnNewButton_1.setBounds(171, 299, 99, 41);
		customerPane.add(btnNewButton_1);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.setBounds(280, 299, 99, 41);
		customerPane.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setBounds(389, 299, 99, 41);
		customerPane.add(btnDelete);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				customerPane.setVisible(false);
			}
		});
		btnBack.setBounds(280, 383, 99, 41);
		customerPane.add(btnBack);
		
		JLabel lblCustomers = new JLabel("Customers");
		lblCustomers.setHorizontalAlignment(SwingConstants.CENTER);
		lblCustomers.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblCustomers.setBounds(116, 28, 407, 41);
		customerPane.add(lblCustomers);
		
		productsPane = new JPanel();
		Pane.add(productsPane, "name_332247459182255");
		productsPane.setLayout(null);
		
		JLabel lblProductId = new JLabel("Product ID:");
		lblProductId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductId.setBounds(122, 102, 99, 14);
		productsPane.add(lblProductId);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_3.setColumns(10);
		textField_3.setBounds(235, 96, 294, 29);
		productsPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_4.setColumns(10);
		textField_4.setBounds(235, 144, 294, 29);
		productsPane.add(textField_4);
		
		JLabel lblProductName = new JLabel("Product Name:");
		lblProductName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductName.setBounds(122, 150, 99, 14);
		productsPane.add(lblProductName);
		
		JLabel lblProductPrice = new JLabel("Product Price:");
		lblProductPrice.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductPrice.setBounds(122, 198, 99, 14);
		productsPane.add(lblProductPrice);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_5.setColumns(10);
		textField_5.setBounds(235, 192, 294, 29);
		productsPane.add(textField_5);
		
		JButton button = new JButton("Create");
		button.setBounds(158, 327, 99, 41);
		productsPane.add(button);
		
		JButton button_1 = new JButton("Edit");
		button_1.setBounds(267, 327, 99, 41);
		productsPane.add(button_1);
		
		JButton button_2 = new JButton("Delete");
		button_2.setBounds(376, 327, 99, 41);
		productsPane.add(button_2);
		
		JButton button_3 = new JButton("Back");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				productsPane.setVisible(false);
			}
		});
		button_3.setBounds(267, 391, 99, 41);
		productsPane.add(button_3);
		
		JLabel lblProductAvailableUnits = new JLabel("Available units:");
		lblProductAvailableUnits.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblProductAvailableUnits.setBounds(122, 246, 99, 14);
		productsPane.add(lblProductAvailableUnits);
		
		textField_6 = new JTextField();
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_6.setColumns(10);
		textField_6.setBounds(235, 240, 88, 29);
		productsPane.add(textField_6);
		
		JLabel lblSectionNumber = new JLabel("Section number:");
		lblSectionNumber.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSectionNumber.setBounds(332, 246, 99, 14);
		productsPane.add(lblSectionNumber);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_7.setColumns(10);
		textField_7.setBounds(441, 239, 88, 29);
		productsPane.add(textField_7);
		
		JLabel lblProducts = new JLabel("Products");
		lblProducts.setHorizontalAlignment(SwingConstants.CENTER);
		lblProducts.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblProducts.setBounds(122, 27, 407, 41);
		productsPane.add(lblProducts);
		
		sectionPane = new JPanel();
		Pane.add(sectionPane, "name_332313783851536");
		sectionPane.setLayout(null);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_8.setColumns(10);
		textField_8.setBounds(239, 99, 261, 29);
		sectionPane.add(textField_8);
		
		JLabel lblSectionNumber_1 = new JLabel("Section number:");
		lblSectionNumber_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSectionNumber_1.setBounds(126, 105, 99, 14);
		sectionPane.add(lblSectionNumber_1);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_9.setColumns(10);
		textField_9.setBounds(239, 147, 261, 29);
		sectionPane.add(textField_9);
		
		JLabel lblSectionName = new JLabel("Section name:");
		lblSectionName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSectionName.setBounds(126, 153, 99, 14);
		sectionPane.add(lblSectionName);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_10.setColumns(10);
		textField_10.setBounds(239, 195, 261, 29);
		sectionPane.add(textField_10);
		
		JLabel lblSectionLocation = new JLabel("Section location:");
		lblSectionLocation.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSectionLocation.setBounds(126, 201, 99, 14);
		sectionPane.add(lblSectionLocation);
		
		JButton button_4 = new JButton("Create");
		button_4.setBounds(160, 281, 99, 41);
		sectionPane.add(button_4);
		
		JButton button_5 = new JButton("Edit");
		button_5.setBounds(269, 281, 99, 41);
		sectionPane.add(button_5);
		
		JButton button_6 = new JButton("Delete");
		button_6.setBounds(378, 281, 99, 41);
		sectionPane.add(button_6);
		
		JButton button_7 = new JButton("Back");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				sectionPane.setVisible(false);
			}
		});
		button_7.setBounds(269, 365, 99, 41);
		sectionPane.add(button_7);
		
		JLabel lblSections = new JLabel("Sections");
		lblSections.setHorizontalAlignment(SwingConstants.CENTER);
		lblSections.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblSections.setBounds(10, 26, 634, 41);
		sectionPane.add(lblSections);
		
		salesPane = new JPanel();
		Pane.add(salesPane, "name_336582294757056");
		salesPane.setLayout(null);
		
		JLabel label_1 = new JLabel("Product ID:");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		label_1.setBounds(113, 101, 99, 14);
		salesPane.add(label_1);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_11.setColumns(10);
		textField_11.setBounds(226, 95, 294, 29);
		salesPane.add(textField_11);
		
		JLabel lblCustomerId = new JLabel("Customer ID:");
		lblCustomerId.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCustomerId.setBounds(113, 149, 99, 14);
		salesPane.add(lblCustomerId);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_12.setColumns(10);
		textField_12.setBounds(226, 143, 294, 29);
		salesPane.add(textField_12);
		
		JLabel lblQuantity = new JLabel("Date:");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantity.setBounds(113, 197, 99, 14);
		salesPane.add(lblQuantity);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_13.setColumns(10);
		textField_13.setBounds(226, 191, 294, 29);
		salesPane.add(textField_13);
		
		JLabel lblQuantity_1 = new JLabel("Quantity:");
		lblQuantity_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantity_1.setBounds(113, 245, 99, 14);
		salesPane.add(lblQuantity_1);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_14.setColumns(10);
		textField_14.setBounds(226, 239, 88, 29);
		salesPane.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 13));
		textField_15.setColumns(10);
		textField_15.setBounds(367, 238, 153, 29);
		salesPane.add(textField_15);
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTotal.setBounds(323, 245, 99, 14);
		salesPane.add(lblTotal);
		
		JButton button_8 = new JButton("Create");
		button_8.setBounds(174, 324, 99, 41);
		salesPane.add(button_8);
		
		JButton button_9 = new JButton("Edit");
		button_9.setBounds(283, 324, 99, 41);
		salesPane.add(button_9);
		
		JButton button_10 = new JButton("Delete");
		button_10.setBounds(392, 324, 99, 41);
		salesPane.add(button_10);
		
		JButton button_11 = new JButton("Back");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPane.setVisible(true);
				salesPane.setVisible(false);
			}
		});
		button_11.setBounds(283, 382, 99, 41);
		salesPane.add(button_11);
		
		JLabel lblNewLabel = new JLabel("Sales");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(15, 21, 628, 41);
		salesPane.add(lblNewLabel);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{Pane, mainPane, lblSupermarketSystem, btnNewButton, btnProducts, btnSections, btnSells, btnNewButton_2, customerPane, textField, lblCustomerName, label, textField_1, lblCustomerEmail, textField_2, btnNewButton_1, btnEdit, btnDelete, btnBack, lblCustomers, productsPane, lblProductId, textField_3, textField_4, lblProductName, lblProductPrice, textField_5, button, button_1, button_2, button_3, lblProductAvailableUnits, textField_6, lblSectionNumber, textField_7, lblProducts, sectionPane, textField_8, lblSectionNumber_1, textField_9, lblSectionName, textField_10, lblSectionLocation, button_4, button_5, button_6, button_7, lblSections, salesPane, label_1, textField_11, lblCustomerId, textField_12, lblQuantity, textField_13, lblQuantity_1, textField_14, textField_15, lblTotal, button_8, button_9, button_10, button_11, lblNewLabel}));
	}
}

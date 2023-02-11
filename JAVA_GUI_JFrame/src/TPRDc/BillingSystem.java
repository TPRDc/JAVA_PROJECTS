package TPRDc;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JScrollBar;

public class BillingSystem {

	private JFrame frame;
	private JTextField textFieldGarri;
	private JTextField textFieldRice;
	private JTextField textFieldBeans;
	private JTextField textFieldMillet;
	private JTextField textFieldBuns;
	
	 private JTextField textFieldCostGarri;
	 private JTextField textFieldCostRice;
	 private JTextField textFieldCostBeans;
	 private JTextField textFieldCostMillet;
	 private JTextField textFieldCostBuns;
	 private JTextField textFieldSubTotal;
	 private JTextField textFieldTax;
	 private JTextField textFieldTotal;
	 
	 double garri=200; 
	 double rice=350; 
	 double beans=300; 
	 double millet=260; 
	 double buns=20;
	 double tax =1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BillingSystem window = new BillingSystem();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BillingSystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				textFieldGarri.setEnabled(false);
				textFieldRice.setEnabled(false);
				textFieldBeans.setEnabled(false);
				textFieldMillet.setEnabled(false);
				textFieldBuns.setEnabled(false);
				
			}
		});
		frame.setTitle("Tprdc Online Billing System");
		frame.setBounds(0, 0, 1150, 700);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ImageIcon image =new ImageIcon("frame_icon.png");
        frame.setIconImage(image.getImage());
        
        frame.getContentPane().setBackground(Color.gray);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(21, 11, 1085, 87);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel onlineBilling = new JLabel("TPRDc ONLINE BILLING SYSTEM");
		onlineBilling.setFont(new Font("Arial Black", Font.PLAIN, 50));
		onlineBilling.setBounds(102, 11, 962, 54);
		panel.add(onlineBilling);
		
		JCheckBox chckbxGarri = new JCheckBox("Garri");
		chckbxGarri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxGarri.isSelected()) {
					textFieldGarri.setEnabled(true);
					textFieldGarri.requestFocus();
				}else {
					textFieldGarri.setEnabled(false);
					textFieldGarri.setText("0");
				}
			}
		});
		chckbxGarri.setBackground(new Color(128, 128, 128));
		chckbxGarri.setFont(new Font("Calibri", Font.BOLD, 26));
		chckbxGarri.setToolTipText("");
		chckbxGarri.setBounds(21, 156, 84, 37);
		frame.getContentPane().add(chckbxGarri);
		
		JCheckBox chckbxRice = new JCheckBox("Rice");
		chckbxRice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxRice.isSelected()) {
					textFieldRice.setEnabled(true);
					textFieldRice.requestFocus();
				}else {
					textFieldRice.setEnabled(false);
					textFieldRice.setText("0");
				}
			}
		});
		chckbxRice.setBackground(new Color(128, 128, 128));
		chckbxRice.setToolTipText("");
		chckbxRice.setFont(new Font("Calibri", Font.BOLD, 26));
		chckbxRice.setBounds(21, 221, 84, 37);
		frame.getContentPane().add(chckbxRice);
		
		JCheckBox chckbxBeans = new JCheckBox("Beans");
		chckbxBeans.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(chckbxBeans.isSelected()) {
					textFieldBeans.setEnabled(true);
					textFieldBeans.requestFocus();
				}else {
					textFieldBeans.setEnabled(false);
					textFieldBeans.setText("0");
				}
			}
		});
		chckbxBeans.setBackground(new Color(128, 128, 128));
		chckbxBeans.setToolTipText("");
		chckbxBeans.setFont(new Font("Calibri", Font.BOLD, 26));
		chckbxBeans.setBounds(21, 283, 91, 37);
		frame.getContentPane().add(chckbxBeans);
		
		JCheckBox chckbxMillet = new JCheckBox("Millet");
		chckbxMillet.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(chckbxGarri.isSelected()) {
					textFieldMillet.setEnabled(true);
					textFieldMillet.requestFocus();
				}else {
					textFieldMillet.setEnabled(false);
					textFieldMillet.setText("0");
				}
			}
		});
		chckbxMillet.setBackground(new Color(128, 128, 128));
		chckbxMillet.setToolTipText("");
		chckbxMillet.setFont(new Font("Calibri", Font.BOLD, 26));
		chckbxMillet.setBounds(21, 346, 91, 37);
		frame.getContentPane().add(chckbxMillet);
		
		JCheckBox chckbxBuns = new JCheckBox("Buns");
		chckbxBuns.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				if(chckbxBuns.isSelected()) {
					textFieldBuns.setEnabled(true);
					textFieldBuns.requestFocus();
				}else {
					textFieldBuns.setEnabled(false);
					textFieldBuns.setText("0");
				}
			}
		});
		chckbxBuns.setBackground(new Color(128, 128, 128));
		chckbxBuns.setToolTipText("");
		chckbxBuns.setFont(new Font("Calibri", Font.BOLD, 26));
		chckbxBuns.setBounds(21, 405, 84, 37);
		frame.getContentPane().add(chckbxBuns);
		
		textFieldGarri = new JTextField();
		textFieldGarri.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldGarri.setText("0");
		textFieldGarri.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldGarri.setToolTipText("0");
		textFieldGarri.setBounds(117, 156, 207, 37);
		frame.getContentPane().add(textFieldGarri);
		textFieldGarri.setColumns(10);
		
		textFieldRice = new JTextField();
		textFieldRice.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldRice.setText("0");
		textFieldRice.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldRice.setToolTipText("0");
		textFieldRice.setColumns(10);
		textFieldRice.setBounds(117, 221, 207, 37);
		frame.getContentPane().add(textFieldRice);
		
		textFieldBeans = new JTextField();
		textFieldBeans.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBeans.setText("0");
		textFieldBeans.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldBeans.setToolTipText("0");
		textFieldBeans.setColumns(10);
		textFieldBeans.setBounds(117, 283, 207, 37);
		frame.getContentPane().add(textFieldBeans);
		
		textFieldMillet = new JTextField();
		textFieldMillet.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldMillet.setText("0");
		textFieldMillet.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldMillet.setToolTipText("0");
		textFieldMillet.setColumns(10);
		textFieldMillet.setBounds(117, 346, 207, 37);
		frame.getContentPane().add(textFieldMillet);
		
		textFieldBuns = new JTextField();
		textFieldBuns.setHorizontalAlignment(SwingConstants.CENTER);
		textFieldBuns.setText("0");
		textFieldBuns.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldBuns.setToolTipText("0");
		textFieldBuns.setColumns(10);
		textFieldBuns.setBounds(117, 405, 207, 37);
		frame.getContentPane().add(textFieldBuns);
		
		JLabel LabelCostGarri = new JLabel("Cost of Garri");
		LabelCostGarri.setFont(new Font("Calibri", Font.BOLD, 26));
		LabelCostGarri.setBounds(346, 156, 193, 37);
		frame.getContentPane().add(LabelCostGarri);
		
		JLabel LabelCostRice = new JLabel("Cost of Rice");
		LabelCostRice.setFont(new Font("Calibri", Font.BOLD, 26));
		LabelCostRice.setBounds(346, 222, 193, 37);
		frame.getContentPane().add(LabelCostRice);
		
		JLabel LabelCostBeans = new JLabel("Cost of Beans");
		LabelCostBeans.setFont(new Font("Calibri", Font.BOLD, 26));
		LabelCostBeans.setBounds(346, 284, 207, 37);
		frame.getContentPane().add(LabelCostBeans);
		
		JLabel LabelCostMillet = new JLabel("Cost of Millet");
		LabelCostMillet.setFont(new Font("Calibri", Font.BOLD, 26));
		LabelCostMillet.setBounds(346, 347, 193, 37);
		frame.getContentPane().add(LabelCostMillet);
		
		JLabel LabelCostBuns = new JLabel("Cost of Buns");
		LabelCostBuns.setFont(new Font("Calibri", Font.BOLD, 26));
		LabelCostBuns.setBounds(346, 406, 193, 37);
		frame.getContentPane().add(LabelCostBuns);
		
		textFieldCostGarri = new JTextField();
		textFieldCostGarri.setToolTipText("0");
		textFieldCostGarri.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldCostGarri.setColumns(10);
		textFieldCostGarri.setBounds(511, 157, 207, 37);
		frame.getContentPane().add(textFieldCostGarri);
		
		textFieldCostRice = new JTextField();
		textFieldCostRice.setToolTipText("0");
		textFieldCostRice.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldCostRice.setColumns(10);
		textFieldCostRice.setBounds(511, 222, 207, 37);
		frame.getContentPane().add(textFieldCostRice);
		
		textFieldCostBeans = new JTextField();
		textFieldCostBeans.setToolTipText("0");
		textFieldCostBeans.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldCostBeans.setColumns(10);
		textFieldCostBeans.setBounds(511, 284, 207, 37);
		frame.getContentPane().add(textFieldCostBeans);
		
		textFieldCostMillet = new JTextField();
		textFieldCostMillet.setToolTipText("0");
		textFieldCostMillet.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldCostMillet.setColumns(10);
		textFieldCostMillet.setBounds(511, 347, 207, 37);
		frame.getContentPane().add(textFieldCostMillet);
		
		textFieldCostBuns = new JTextField();
		textFieldCostBuns.setToolTipText("0");
		textFieldCostBuns.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldCostBuns.setColumns(10);
		textFieldCostBuns.setBounds(511, 406, 207, 37);
		frame.getContentPane().add(textFieldCostBuns);
		
		JTextArea textAreaReceipt = new JTextArea();
		textAreaReceipt.setBackground(new Color(240, 240, 240));
		textAreaReceipt.setForeground(new Color(0, 0, 0));
		textAreaReceipt.setFont(new Font("Monospaced", Font.PLAIN, 15));
		textAreaReceipt.setTabSize(0);
		textAreaReceipt.setBounds(749, 159, 375, 501);
		frame.getContentPane().add(textAreaReceipt);
		textAreaReceipt.enableInputMethods(false);
		
		JButton ButtonReceipt = new JButton("Receipt");
		ButtonReceipt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String iGarri = String.format(textFieldGarri.getText());
			String iRice = String.format(textFieldRice.getText());	
			String iBeans = String.format(textFieldBeans.getText());	
			String iMillet = String.format(textFieldMillet.getText());	
			String iBuns = String.format(textFieldBuns.getText());	
			
			String costGarri = String.format(textFieldCostGarri.getText());
			String costRice = String.format(textFieldCostRice.getText());
			String costBeans = String.format(textFieldCostBeans.getText());
			String costMillet = String.format(textFieldCostMillet.getText());
			String costBuns = String.format(textFieldCostBuns.getText());
			
			String isubtotal = String.format(textFieldSubTotal.getText());
			String itax = String.format(textFieldTax.getText());
			String itotal = String.format(textFieldTotal.getText());
			
			int refs=1234555+(int)(Math.random()*7454444);
			
				Calendar timer =Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat Time =new SimpleDateFormat("HH:mm:ss");
				Time.format(timer.getTime());
				SimpleDateFormat Date =new SimpleDateFormat("dd-MM-yyyy");
				Date.format(timer.getTime());
				
				textAreaReceipt.append(
						"""
						TPRDc ONLINE BILLING SYSTEM
						
						Reference: """+refs+
						 """
						 
						==================================================================\t 
						 
						\nGarri: \t"""+iGarri+" => "+"Cost Of Garri: "+costGarri+
						"\nRice: \t"+iRice+" => "+"Cost Of Rice: "+costRice+
					    "\nBeans: \t"+iBeans+" => "+"Cost Of Beans: "+costBeans+
						"\nMillet: \t"+iMillet+" => "+"Cost Of Millet: "+costMillet+
						"\nBuns: \t"+iBuns+" => "+"Cost Of Buns: "+costBuns+
						 """
						 
						 ===================================================================\t						
						 
						 SUB TOTAL:\t............."""+isubtotal+
						"\nTAX:\t................."+itax+
						"\nTOTAL:\t..............."+itotal+
						 
						 """
						 
						 ==================================================================\t
						 
						 \n\t\t\tTime: """+Time.format(timer.getTime())+
						"\n\t\t\tDate: "+Date.format(timer.getTime())+
						 "\n\n\t\tThank you\n"
						);
			}
		});
		ButtonReceipt.setToolTipText("Receipt");
		ButtonReceipt.setVerticalAlignment(SwingConstants.TOP);
		ButtonReceipt.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonReceipt.setBounds(874, 109, 130, 37);
		frame.getContentPane().add(ButtonReceipt);
		
		JLabel lblSubtotal = new JLabel("Sub Total");
		lblSubtotal.setFont(new Font("Calibri", Font.BOLD, 26));
		lblSubtotal.setBounds(21, 479, 104, 37);
		frame.getContentPane().add(lblSubtotal);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Calibri", Font.BOLD, 26));
		lblTotal.setBounds(21, 566, 64, 37);
		frame.getContentPane().add(lblTotal);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Calibri", Font.BOLD, 26));
		lblTax.setBounds(21, 518, 48, 37);
		frame.getContentPane().add(lblTax);
		
		textFieldSubTotal = new JTextField();
		textFieldSubTotal.setToolTipText("0");
		textFieldSubTotal.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldSubTotal.setColumns(10);
		textFieldSubTotal.setBounds(135, 479, 443, 32);
		frame.getContentPane().add(textFieldSubTotal);
		
		textFieldTax = new JTextField();
		textFieldTax.setToolTipText("0");
		textFieldTax.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldTax.setColumns(10);
		textFieldTax.setBounds(135, 520, 443, 32);
		frame.getContentPane().add(textFieldTax);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setToolTipText("0");
		textFieldTotal.setFont(new Font("Calibri", Font.BOLD, 26));
		textFieldTotal.setColumns(10);
		textFieldTotal.setBounds(135, 561, 443, 32);
		frame.getContentPane().add(textFieldTotal);
		
		JButton ButtonTotalCost = new JButton("Total Cost");
		ButtonTotalCost.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double G = garri*Double.parseDouble(textFieldGarri.getText());
				double R = rice*Double.parseDouble(textFieldRice.getText());
				double B = beans*Double.parseDouble(textFieldBeans.getText());
				double M = millet*Double.parseDouble(textFieldMillet.getText());
				double BU = buns*Double.parseDouble(textFieldBuns.getText());
				
				String Cost_of_G =String.format("N%.2f", G);
				textFieldCostGarri.setText(Cost_of_G);
				
				String Cost_of_R =String.format("N%.2f", R);
				textFieldCostRice.setText(Cost_of_R);
				
				String Cost_of_B =String.format("N%.2f", B);
				textFieldCostBeans.setText(Cost_of_B);
				
				String Cost_of_M =String.format("N%.2f", M);
				textFieldCostMillet.setText(Cost_of_M);
				
				String Cost_of_BU =String.format("N%.2f", BU);
				textFieldCostBuns.setText(Cost_of_BU);
				
				double Sumup = G+R+B+M+BU;
				String Sum = String.format("N%.2f", Sumup);
				textFieldSubTotal.setText(Sum);
				
				double itax = (tax*Sumup/100);
				String ctax = String.format("N%.2f", itax);
				textFieldTax.setText(ctax);
				
				double total=Sumup+itax;
				String itotal = String.format("N%.2f", total);
				textFieldTotal.setText(itotal);
								
			}
		});
		ButtonTotalCost.setToolTipText("Total Cost");
		ButtonTotalCost.setVerticalAlignment(SwingConstants.TOP);
		ButtonTotalCost.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonTotalCost.setBounds(21, 614, 152, 37);
		frame.getContentPane().add(ButtonTotalCost);
		
		JButton ButtonRest = new JButton("Reset");
		ButtonRest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxGarri.setSelected(false);
				chckbxRice.setSelected(false);
				chckbxBeans.setSelected(false);
				chckbxMillet.setSelected(false);
				chckbxBuns.setSelected(false);
				
				textAreaReceipt.setText(null);
				
				textFieldGarri.setText(null);
				textFieldRice.setText(null);
				textFieldBeans.setText(null);
				textFieldMillet.setText(null);
				textFieldBuns.setText(null);
				
				textFieldCostGarri.setText(null);
				textFieldCostRice.setText(null);
				textFieldCostBeans.setText(null);
				textFieldCostMillet.setText(null);
				textFieldCostBuns.setText(null);
				
				textFieldSubTotal.setText(null);
				textFieldTax.setText(null);
				textFieldTotal.setText(null);
			}
		});
		ButtonRest.setToolTipText("Reset");
		ButtonRest.setVerticalAlignment(SwingConstants.TOP);
		ButtonRest.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonRest.setBounds(588, 518, 152, 37);
		frame.getContentPane().add(ButtonRest);
		
		JButton ButtonExit = new JButton("Exit");
		ButtonExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame =new JFrame("Exit");
				if (JOptionPane.showConfirmDialog(frame,"Confirm if you want o exit","Tprdc Online Billing System",
				JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
				System.exit(0);	
				}
			}
		});
		ButtonExit.setToolTipText("Exit");
		ButtonExit.setVerticalAlignment(SwingConstants.TOP);
		ButtonExit.setFont(new Font("Tahoma", Font.BOLD, 20));
		ButtonExit.setBounds(588, 613, 152, 37);
		frame.getContentPane().add(ButtonExit);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 64, 128));
		separator.setBackground(new Color(0, 64, 128));
		separator.setBounds(334, 439, 6, -286);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(21, 457, 715, 11);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1.setBounds(334, 121, 16, 335);
		frame.getContentPane().add(separator_1_1);
		
		JSeparator separator_1_2 = new JSeparator();
		separator_1_2.setBounds(21, 603, 715, 11);
		frame.getContentPane().add(separator_1_2);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1.setBounds(655, 554, 16, 49);
		frame.getContentPane().add(separator_1_1_1);
		
		JSeparator separator_1_1_1_1 = new JSeparator();
		separator_1_1_1_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1_1.setBounds(666, 554, 16, 49);
		frame.getContentPane().add(separator_1_1_1_1);
		
		JSeparator separator_1_1_1_2 = new JSeparator();
		separator_1_1_1_2.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1_2.setBounds(655, 461, 16, 55);
		frame.getContentPane().add(separator_1_1_1_2);
		
		JSeparator separator_1_1_1_3 = new JSeparator();
		separator_1_1_1_3.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1_3.setBounds(666, 461, 16, 59);
		frame.getContentPane().add(separator_1_1_1_3);
		
		JLabel lblItems = new JLabel("ITEMS");
		lblItems.setForeground(new Color(0, 64, 128));
		lblItems.setBackground(new Color(128, 128, 128));
		lblItems.setFont(new Font("Calibri", Font.BOLD, 24));
		lblItems.setBounds(33, 121, 72, 32);
		frame.getContentPane().add(lblItems);
		
		JLabel lblQuantity = new JLabel("ENTER QUANTITY");
		lblQuantity.setVerticalAlignment(SwingConstants.TOP);
		lblQuantity.setForeground(new Color(0, 64, 128));
		lblQuantity.setFont(new Font("Calibri", Font.BOLD, 24));
		lblQuantity.setBackground(new Color(128, 128, 128));
		lblQuantity.setBounds(130, 123, 181, 30);
		frame.getContentPane().add(lblQuantity);
		
		JSeparator separator_1_1_1_4 = new JSeparator();
		separator_1_1_1_4.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1_4.setBounds(103, 121, 16, 21);
		frame.getContentPane().add(separator_1_1_1_4);
		
		JSeparator separator_1_1_1_4_1 = new JSeparator();
		separator_1_1_1_4_1.setOrientation(SwingConstants.VERTICAL);
		separator_1_1_1_4_1.setBounds(117, 121, 16, 21);
		frame.getContentPane().add(separator_1_1_1_4_1);
		
		
	}
}

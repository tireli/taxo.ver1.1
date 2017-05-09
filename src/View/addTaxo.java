package View;
import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.ParkEventControll;
import Controller.ControllInterface.myAddTaxoListener;


public class addTaxo extends JFrame implements ActionListener{

	private JFrame frame = new JFrame(); ;
	private JTextField txtNewTaxoCitiName;
	private JLabel lblTaxitype;
	private JLabel lblNewTaxoSelfName;
	private JTextField textFieldNewTaxoSelfName;
	private myAddTaxoListener myEventListener;
	protected String licenseKey = "Zalushka";
	private JComboBox comboBox;
	
	
	
	
	public void setLoginListener(myAddTaxoListener myEventListener) {
		this.myEventListener = myEventListener;
	}
	
	
	/**
	 * Create the application.
	 */
	public addTaxo(myAddTaxoListener myEventListener) {
		this.myEventListener = myEventListener;
		initialize();
	}
	public addTaxo() {
		this.myEventListener = new ParkEventControll();
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame.setVisible(true);
		frame.setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		frame.setTitle("Добавить новый таксопарк");
		frame.setBounds(100, 100, 450, 300);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(12, 26, 426, 262);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		txtNewTaxoCitiName = new JTextField();
		txtNewTaxoCitiName.setBounds(176, 0, 238, 19);
		panel.add(txtNewTaxoCitiName);
		txtNewTaxoCitiName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Название города");
		lblNewLabel.setBounds(10, 2, 135, 15);
		panel.add(lblNewLabel);
		
		lblTaxitype = new JLabel("Система такси");
		lblTaxitype.setBounds(10, 35, 123, 15);
		panel.add(lblTaxitype);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "GetTaxi", "Uber", "Яндекс.Такси"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(176, 31, 238, 19);
		panel.add(comboBox);
		
		lblNewTaxoSelfName = new JLabel("Название таксопарка");
		lblNewTaxoSelfName.setBounds(10, 65, 155, 15);
		panel.add(lblNewTaxoSelfName);
		
		textFieldNewTaxoSelfName = new JTextField();
		textFieldNewTaxoSelfName.setBounds(176, 62, 238, 19);
		panel.add(textFieldNewTaxoSelfName);
		textFieldNewTaxoSelfName.setColumns(10);
		
		JButton btnCreateNewTaxoButton = new JButton("Создать");
		btnCreateNewTaxoButton.addActionListener(this);
	/*	btnCreateNewTaxoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				myEventListener.AddTaxo(new dataTransferObjAddTaxo(txtNewTaxoCitiName, 
						 textFieldNewTaxoSelfName, comboBox, licenseKey));
			}
		});*/

//		btnCreateNewTaxoButton.addActionListener(new addButtonControl(txtNewTaxoCitiName,textFieldNewTaxoSelfName,comboBox));
		
		btnCreateNewTaxoButton.setBounds(10, 225, 117, 25);
		panel.add(btnCreateNewTaxoButton);
		
		JButton btnCreateNewButton = new JButton("Отмена");
//		btnCreateNewButton.addActionListener(new cancelButtonControl());
		btnCreateNewButton.setBounds(139, 225, 117, 25);
		panel.add(btnCreateNewButton);
	//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("New ActionEvent e " + e);
		setVisible(false);
		System.out.println("Get event in new window: " + textFieldNewTaxoSelfName);
		System.out.println(txtNewTaxoCitiName);
		if (myEventListener != null) {
			myEventListener.AddTaxo(new dataTransferObjAddTaxo(txtNewTaxoCitiName, 
					 textFieldNewTaxoSelfName, comboBox, licenseKey));
		}else {
			System.out.println("Null obj");
		}
		
		
		
	}
}

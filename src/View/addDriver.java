package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

import Controller.ParkEventControll;
import Controller.ControllInterface.DriversEvent;
import Model.Driver;
import Model.Model;
import Model.Resident;
import Model.Tarif;
import Model.TaxoPark;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class addDriver extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPhone;
	private DriversEvent myEventListener = new ParkEventControll();
	private Model model;
	private TaxoPark currentTaxoPark;
	private ArrayList<Tarif> currentTarifList;
	private DefaultComboBoxModel dfm;
	private JTextField textFieldLastName;
	private JTextField textFieldOtchestvo;
	private String[] residentlistItems;
	private DefaultComboBoxModel rfm;

	/**
	 * @wbp.parser.constructor
	 */
	public addDriver(Model model) {
		// TODO Auto-generated constructor stub
		this.model = model;
		addDriver();
	}
	public addDriver(TaxoPark currentTaxoPark) {
		// TODO Auto-generated constructor stub
		this.currentTaxoPark = currentTaxoPark;
		addDriver();
	}
	
	/**
	 * Create the frame.
	 */
	public void addDriver() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(10, 10, 603, 724);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelObyaz = new JPanel();
		panelObyaz.setBorder(new TitledBorder(null, "\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043E\u043B\u044F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelObyaz.setBounds(12, 0, 578, 290);
		contentPane.add(panelObyaz);
		panelObyaz.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(12, 65, 187, 19);
		panelObyaz.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Имя водителя");
		lblNewLabel.setBounds(217, 65, 361, 19);
		panelObyaz.add(lblNewLabel);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(12, 127, 187, 19);
		panelObyaz.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel label = new JLabel("Телефон водителя");
		label.setBounds(217, 123, 361, 19);
		panelObyaz.add(label);
		
		textFieldLastName = new JTextField();
		textFieldLastName.setColumns(10);
		textFieldLastName.setBounds(12, 36, 187, 19);
		panelObyaz.add(textFieldLastName);
		
		textFieldOtchestvo = new JTextField();
		textFieldOtchestvo.setColumns(10);
		textFieldOtchestvo.setBounds(12, 96, 187, 19);
		panelObyaz.add(textFieldOtchestvo);
		
		JLabel label_1 = new JLabel("Фамилия водителя");
		label_1.setBounds(217, 36, 361, 19);
		panelObyaz.add(label_1);
		
		JLabel label_2 = new JLabel("Отчество водителя");
		label_2.setBounds(217, 92, 361, 19);
		panelObyaz.add(label_2);
		
		/*
		 * List resident type
		 */
		
		JComboBox comboBoxRsident = new JComboBox();
		ArrayList<Resident> currentResidentList = null;// = new ArrayList<Resident>;
		
		try {
			residentlistItems = new String[currentResidentList.size()+1];
			residentlistItems[0] = "Выберите тариф";
			for (int i = 0; i < currentResidentList.size(); i++) {
				residentlistItems[i+1] = currentResidentList.get(i).getResidentName();
			}
			 rfm = new DefaultComboBoxModel(residentlistItems);
		} catch (NullPointerException e) {
			// TODO: handle exception
			residentlistItems = new String[1];
			residentlistItems[0] = "РФ";
			 rfm = new DefaultComboBoxModel(residentlistItems);
		}
		comboBoxRsident.setModel(rfm);
		comboBoxRsident.setBackground(Color.WHITE);
		comboBoxRsident.setBounds(12, 158, 187, 24);
		panelObyaz.add(comboBoxRsident);
		
		JLabel label_3 = new JLabel("Резидент");
		label_3.setBounds(217, 163, 361, 19);
		panelObyaz.add(label_3);
		
		JPanel panelNeObyaz = new JPanel();
		panelNeObyaz.setBorder(new TitledBorder(null, "\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043E\u043B\u044F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelNeObyaz.setBounds(12, 403, 578, 140);
		contentPane.add(panelNeObyaz);
		panelNeObyaz.setLayout(null);
		
		
		JComboBox comboBox = new JComboBox();
		/*
		 * Set model from TarifList from current taxopark
		 */
		currentTarifList = currentTaxoPark.getTarifList();
		
		
		try {
			String[] tariflistItems = new String[currentTarifList.size()+1];
			tariflistItems[0] = "Выберите тариф";
			for (int i = 0; i < currentTarifList.size(); i++) {
				tariflistItems[i+1] = currentTarifList.get(i).getTarifName();
			}
			 dfm = new DefaultComboBoxModel(tariflistItems);
		} catch (NullPointerException e) {
			// TODO: handle exception
			String[] tariflistItems = new String[1];
			tariflistItems[0] = "Создайте тариф";
			 dfm = new DefaultComboBoxModel(tariflistItems);
		}
		comboBox.setModel(dfm);
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(12, 49, 193, 24);
		panelNeObyaz.add(comboBox);
		
		JLabel lblNewlabel = new JLabel("Тариф");
		lblNewlabel.setBounds(236, 54, 330, 19);
		panelNeObyaz.add(lblNewlabel);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelButtons.setBounds(12, 555, 578, 140);
		contentPane.add(panelButtons);
		panelButtons.setLayout(null);
		
		JButton btnNewDriverAdd = new JButton("Добавить водителя");
		
		btnNewDriverAdd.setBounds(12, 103, 250, 25);
		panelButtons.add(btnNewDriverAdd);
		
		JButton buttonCancelAdd = new JButton("Отмена");
		
		buttonCancelAdd.setBounds(296, 103, 250, 25);
		panelButtons.add(buttonCancelAdd);
		
		/*
		 * Buttons event
		 */
		btnNewDriverAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Make Add driver function call
				 */
				if (myEventListener != null) {
					
					myEventListener.addDriverEvent(new Driver(textFieldName.getText(), textFieldPhone.getText(),
							textFieldLastName.getText(),textFieldOtchestvo.getText(), 
							currentTarifList.get(comboBox.getSelectedIndex()-1)/*,
							currentResidentList.get(comboBoxRsident.getSelectedIndex())*/));
				}
				
			}
		});
		
		buttonCancelAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Cancel driver Add
				 */
				
			}
		});
	}
}

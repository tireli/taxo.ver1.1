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

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class addDriver extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldName;
	private JTextField textFieldPhone;
	private DriversEvent myEventListener = new ParkEventControll();

	/**
	 * Create the frame.
	 */
	public addDriver() {
		setVisible(true);
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(10, 10, 602, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelObyaz = new JPanel();
		panelObyaz.setBorder(new TitledBorder(null, "\u041E\u0431\u044F\u0437\u0430\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043E\u043B\u044F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelObyaz.setBounds(12, 0, 566, 151);
		contentPane.add(panelObyaz);
		panelObyaz.setLayout(null);
		
		textFieldName = new JTextField();
		textFieldName.setBounds(12, 48, 187, 19);
		panelObyaz.add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Имя водителя");
		lblNewLabel.setBounds(217, 48, 361, 19);
		panelObyaz.add(lblNewLabel);
		
		textFieldPhone = new JTextField();
		textFieldPhone.setBounds(12, 79, 187, 19);
		panelObyaz.add(textFieldPhone);
		textFieldPhone.setColumns(10);
		
		JLabel label = new JLabel("Телефон водителя");
		label.setBounds(217, 79, 361, 19);
		panelObyaz.add(label);
		
		JPanel panelNeObyaz = new JPanel();
		panelNeObyaz.setBorder(new TitledBorder(null, "\u0414\u043E\u043F\u043E\u043B\u043D\u0438\u0442\u0435\u043B\u044C\u043D\u044B\u0435 \u043F\u043E\u043B\u044F", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelNeObyaz.setBounds(12, 185, 578, 140);
		contentPane.add(panelNeObyaz);
		panelNeObyaz.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4"}));
		comboBox.setBackground(Color.WHITE);
		comboBox.setBounds(12, 49, 193, 24);
		panelNeObyaz.add(comboBox);
		
		JLabel lblNewlabel = new JLabel("Тариф");
		lblNewlabel.setBounds(236, 54, 330, 19);
		panelNeObyaz.add(lblNewlabel);
		
		JPanel panelButtons = new JPanel();
		panelButtons.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelButtons.setBounds(12, 351, 578, 140);
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
					myEventListener.addDriverEvent(new Driver(textFieldName.getText(), textFieldPhone.getText()));
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

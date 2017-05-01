package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;

import Controller.ParkEventControll;
import Controller.TarifController;
import Model.Tarif;

public class addTarifMaster extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField newTarfName;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private final ButtonGroup buttonGroup_2 = new ButtonGroup();
	private JTextField textField_5;
	private JTextField textField_6;
	private TarifController myEventListener;

	/**
	 * Launch the application.
	 */
	public addTarifMaster() {
		this.myEventListener = new TarifController();
		launch();
	}

	/**
	 * Create the frame.
	 */
	public void launch() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new CardLayout(0, 0));
		
		JPanel card1 = new JPanel();
		contentPane.add(card1, "name_326742109948386");
		card1.setLayout(null);
		
		JPanel card2 = new JPanel();
		contentPane.add(card2, "name_326801349516063");
		card2.setLayout(null);
		
		JLabel label = new JLabel("С каой суммы брать комиссию");
		label.setBounds(12, 11, 383, 15);
		card2.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Провозная плата целиком");
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setBounds(12, 34, 420, 23);
		card2.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Безналичная оплата поступающая на счет");
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.setBounds(12, 61, 420, 23);
		card2.add(rdbtnNewRadioButton_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 98, 416, 2);
		card2.add(separator_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Брать комиссию с бонусов");
		chckbxNewCheckBox.setBounds(12, 108, 420, 23);
		card2.add(chckbxNewCheckBox);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(12, 146, 416, 2);
		card2.add(separator_2);
		
		JLabel lblNewLabel_1 = new JLabel("Способ рассчета комиссии");
		lblNewLabel_1.setBounds(12, 160, 420, 15);
		card2.add(lblNewLabel_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Фиксированный платеж");
		buttonGroup_1.add(rdbtnNewRadioButton_2);
		rdbtnNewRadioButton_2.setBounds(12, 183, 405, 23);
		card2.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Вычисление процента");
		buttonGroup_1.add(rdbtnNewRadioButton_3);
		rdbtnNewRadioButton_3.setBounds(12, 210, 420, 23);
		card2.add(rdbtnNewRadioButton_3);
		
		JPanel card3 = new JPanel();
		contentPane.add(card3, "name_326826581316261");
		card3.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Снизить размер комиссии при достижении порога");
		lblNewLabel_2.setBounds(12, 0, 416, 15);
		card3.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(12, 48, 114, 19);
		card3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(206, 48, 114, 19);
		card3.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Порог 1");
		lblNewLabel_3.setBounds(12, 27, 70, 15);
		card3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Занчение порога");
		lblNewLabel_4.setBounds(206, 27, 185, 15);
		card3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Порог 2");
		lblNewLabel_5.setBounds(12, 79, 70, 15);
		card3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Значение порога");
		lblNewLabel_6.setBounds(206, 79, 161, 15);
		card3.add(lblNewLabel_6);
		
		textField_2 = new JTextField();
		textField_2.setBounds(12, 106, 114, 19);
		card3.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(206, 106, 114, 19);
		card3.add(textField_3);
		textField_3.setColumns(10);
		
		JPanel card4 = new JPanel();
		contentPane.add(card4, "name_326906332585252");
		card4.setLayout(null);
		
		JLabel lblNewLabel_8 = new JLabel("Производить расчет по схеме");
		lblNewLabel_8.setBounds(12, 12, 416, 15);
		card4.add(lblNewLabel_8);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("За месяц");
		buttonGroup_2.add(rdbtnNewRadioButton_4);
		rdbtnNewRadioButton_4.setBounds(12, 35, 149, 23);
		card4.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("За неделю");
		buttonGroup_2.add(rdbtnNewRadioButton_5);
		rdbtnNewRadioButton_5.setBounds(12, 62, 149, 23);
		card4.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("За сутки");
		buttonGroup_2.add(rdbtnNewRadioButton_6);
		rdbtnNewRadioButton_6.setBounds(12, 89, 149, 23);
		card4.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("Авансами по неделям");
		buttonGroup_2.add(rdbtnNewRadioButton_7);
		rdbtnNewRadioButton_7.setBounds(12, 116, 385, 23);
		card4.add(rdbtnNewRadioButton_7);
		
		JPanel card5 = new JPanel();
		contentPane.add(card5, "name_326929548594944");
		card5.setLayout(null);
		
		JLabel lblNewLabel_9 = new JLabel("Плата за вывод средств");
		lblNewLabel_9.setBounds(12, 12, 416, 15);
		card5.add(lblNewLabel_9);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(12, 39, 416, 2);
		card5.add(separator_4);
		
		JLabel lblNewLabel_10 = new JLabel("Прцент от суммы перевода");
		lblNewLabel_10.setBounds(12, 53, 211, 15);
		card5.add(lblNewLabel_10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(251, 53, 114, 19);
		card5.add(textField_5);
		textField_5.setColumns(10);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBounds(12, 80, 416, 2);
		card5.add(separator_5);
		
		JLabel lblNewLabel_11 = new JLabel("Фиксированная плата");
		lblNewLabel_11.setBounds(12, 94, 211, 15);
		card5.add(lblNewLabel_11);
		
		textField_6 = new JTextField();
		textField_6.setBounds(251, 92, 114, 19);
		card5.add(textField_6);
		textField_6.setColumns(10);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBounds(12, 134, 416, 2);
		card5.add(separator_6);
		
		JLabel lblNewLabel_12 = new JLabel("Тариф по умолчанию");
		lblNewLabel_12.setBounds(12, 148, 211, 15);
		card5.add(lblNewLabel_12);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Использовать по умолчанию для новых водителей");
		chckbxNewCheckBox_1.setBounds(12, 171, 416, 23);
		card5.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("Название тарифа");
		lblNewLabel.setBounds(12, 12, 214, 15);
		card1.add(lblNewLabel);
		
		newTarfName = new JTextField();
		newTarfName.setBounds(12, 39, 198, 19);
		card1.add(newTarfName);
		newTarfName.setColumns(10);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 180, 416, 2);
		card1.add(separator);
		/*
		 * card1 buttons
		 */
		JButton btnBackButton = new JButton("Назад");
		btnBackButton.setBounds(12, 213, 117, 25);
		btnBackButton.setActionCommand("BACK");
		btnBackButton.addActionListener(this);
		card1.add(btnBackButton);
		
		JButton btnNextButton = new JButton("Дальше");
		btnNextButton.setBounds(141, 213, 117, 25);
		btnNextButton.setActionCommand("NEXT");
		btnNextButton.addActionListener(this);
		card1.add(btnNextButton);
		
		JButton btnCancelButton = new JButton("Отмена");
		btnCancelButton.setBounds(311, 213, 117, 25);
		card1.add(btnCancelButton);
		/*
		 * card2 buttons
		 */
		JButton btnBackButton_card2 = new JButton("Назад");
		btnBackButton_card2.setBounds(12, 213, 117, 25);
		btnBackButton_card2.setActionCommand("BACK");
		btnBackButton_card2.addActionListener(this);
		card2.add(btnBackButton_card2);
		
		JButton btnNextButton_card2 = new JButton("Дальше");
		btnNextButton_card2.setBounds(141, 213, 117, 25);
		btnNextButton_card2.setActionCommand("NEXT");
		btnNextButton_card2.addActionListener(this);
		card2.add(btnNextButton_card2);
		
		JButton btnCancelButton_card2 = new JButton("Отмена");
		btnCancelButton_card2.setBounds(311, 213, 117, 25);
		card2.add(btnCancelButton_card2);
		/*
		 * card3 buttons
		 */		
		JButton btnBackButton_card3 = new JButton("Назад");
		btnBackButton_card3.setBounds(12, 213, 117, 25);
		btnBackButton_card3.setActionCommand("BACK");
		btnBackButton_card3.addActionListener(this);
		card3.add(btnBackButton_card3);
		
		JButton btnNextButton_card3 = new JButton("Дальше");
		btnNextButton_card3.setBounds(141, 213, 117, 25);
		btnNextButton_card3.setActionCommand("NEXT");
		btnNextButton_card3.addActionListener(this);
		card3.add(btnNextButton_card3);
		
		JButton btnCancelButton_card3 = new JButton("Отмена");
		btnCancelButton_card3.setBounds(311, 213, 117, 25);
		card3.add(btnCancelButton_card3);
		/*
		 * card4 buttons
		 */	
		JButton btnBackButton_card4 = new JButton("Назад");
		btnBackButton_card4.setBounds(12, 213, 117, 25);
		btnBackButton_card4.setActionCommand("BACK");
		btnBackButton_card4.addActionListener(this);
		card4.add(btnBackButton_card4);
		
		JButton btnNextButton_card4 = new JButton("Дальше");
		btnNextButton_card4.setBounds(141, 213, 117, 25);
		btnNextButton_card4.setActionCommand("NEXT");
		btnNextButton_card4.addActionListener(this);
		card4.add(btnNextButton_card4);
		
		JButton btnCancelButton_card4 = new JButton("Отмена");
		btnCancelButton_card4.setBounds(311, 213, 117, 25);
		card4.add(btnCancelButton_card4);
		/*
		 * card5 buttons
		 */	
		JButton btnBackButton_card5 = new JButton("Назад");
		btnBackButton_card5.setBounds(12, 213, 117, 25);
		btnBackButton_card5.setActionCommand("BACK");
		btnBackButton_card5.addActionListener(this);
		card5.add(btnBackButton_card5);
		
		JButton btnNextButton_card5 = new JButton("Готово");
		btnNextButton_card5.setBounds(141, 213, 117, 25);
		btnNextButton_card5.setActionCommand("OK");
		btnNextButton_card5.addActionListener(this);
		card5.add(btnNextButton_card5);
		
		JButton btnCancelButton_card5 = new JButton("Отмена");
		btnCancelButton_card5.setBounds(311, 213, 117, 25);
		card5.add(btnCancelButton_card5);
		
		
		/*
		 * 
		 */
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(12, 137, 416, 2);
		card3.add(separator_3);
		
		JLabel lblNewLabel_7 = new JLabel("Ограничить минимальную комиссию суммой");
		lblNewLabel_7.setBounds(12, 151, 416, 15);
		card3.add(lblNewLabel_7);
		
		textField_4 = new JTextField();
		textField_4.setBounds(12, 178, 114, 19);
		card3.add(textField_4);
		textField_4.setColumns(10);
	}
	/*
	 * Start event listener for cart changer
	 */
	@Override
    public void actionPerformed(ActionEvent e) {
		System.out.println("In Cards event");
		System.out.println("ActionCommand " + e.getActionCommand());
        CardLayout cl = (CardLayout) (contentPane.getLayout());
        String cmd = e.getActionCommand();
        if (cmd.equals("BACK")) {
        	System.out.println("BACK");
            cl.previous(contentPane);
        } else if (cmd.equals("NEXT")) {
        	System.out.println("NEXT");
            cl.next(contentPane);
        } else if (cmd.equals("OK")) {
        	System.out.println("OK");
        	if (myEventListener != null) {
    			myEventListener.addNewTarif(new Tarif(newTarfName.getText()));
    		}else {
    			System.out.println("Null obj");
    		}
        } 
    }
  
 //   ControlActionListenter cal = new ControlActionListenter();

	
}

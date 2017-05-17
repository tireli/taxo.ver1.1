package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import Controller.ParkEventControll;
import Controller.ControllInterface.DriversEvent;
import Model.Driver;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class csvDriverAdd extends JFrame {

	private JPanel contentPane;
	private DriversEvent myEventListener = new ParkEventControll();
	
	public csvDriverAdd() throws HeadlessException {
		init();
	}


	/**
	 * Create the frame.
	 */
	public void init() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 576, 708);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton readCSVDriverButton = new JButton("Загрузить");
		readCSVDriverButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*
				 * Make Add driver function call
				 */
				if (myEventListener != null) {
					
					
					myEventListener.addMenyDriverEvent();
				}
			}
		});
		readCSVDriverButton.setBounds(116, 609, 117, 25);
		contentPane.add(readCSVDriverButton);
		setVisible(true);
		
	}
}

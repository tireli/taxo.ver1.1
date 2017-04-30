package View;

import javax.swing.JComboBox;
import javax.swing.JTextField;

public class dataTransferObjAddTaxo {
	
	private JTextField txtNewTaxoCitiName;
	private JTextField textFieldNewTaxoSelfName;
	private JComboBox comboBox;
	private String licenseKey;
	
	
	public dataTransferObjAddTaxo(JTextField txtNewTaxoCitiName,
			JTextField textFieldNewTaxoSelfName, JComboBox comboBox,
			String licenseKey) {

		this.txtNewTaxoCitiName = txtNewTaxoCitiName;
		this.textFieldNewTaxoSelfName = textFieldNewTaxoSelfName;
		this.comboBox = comboBox;
		this.licenseKey = licenseKey;
	}


	public JTextField getTxtNewTaxoCitiName() {
		return txtNewTaxoCitiName;
	}


	public void setTxtNewTaxoCitiName(JTextField txtNewTaxoCitiName) {
		this.txtNewTaxoCitiName = txtNewTaxoCitiName;
	}


	public JTextField getTextFieldNewTaxoSelfName() {
		return textFieldNewTaxoSelfName;
	}


	public void setTextFieldNewTaxoSelfName(JTextField textFieldNewTaxoSelfName) {
		this.textFieldNewTaxoSelfName = textFieldNewTaxoSelfName;
	}


	public JComboBox getComboBox() {
		return comboBox;
	}


	public void setComboBox(JComboBox comboBox) {
		this.comboBox = comboBox;
	}


	public String getLicenseKey() {
		return licenseKey;
	}


	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}
	
	
	

}

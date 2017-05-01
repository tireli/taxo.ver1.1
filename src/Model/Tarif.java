package Model;

import java.io.Serializable;

public class Tarif extends Model implements Serializable {
	
	final String DEPOSIT = "DEPOSIT";
	final String PROVOZNAYA_PLATA = "PROVOZNAYA_PLATA";
	final String PROCENT = "PROCENT";
	final String FIX = "FIX";
	final String VIVOD_PROCENT = "VIVOD_PROCENT";
	final String VIVOD_FIX = "VIVOD_PROCENT";
	final String MESAC = "MESAC";
	final String NEDELA = "MESAC";
	final String NEDELA_AVANS = "MESAC";
	final String SUTKI = "MESAC";
	
	
	private String tarifName;
	private boolean bonusInclude;
	private boolean useItDefault;
	private float fixComPrice;
	private float percentComPrice;
	private float porog1;
	private float porog2;
	private float dopPrice1;
	private float dopPrice2;
	private float minCom;
	private float vivodFixPrice;
	private float vivodPercentPrice;
	
	private String baza;
	private String comisType;
	
	
	
	
	
	
	public Tarif(String tarifName, boolean bonusInclude, boolean useItDefault,
			float fixComPrice, float percentComPrice, float porog1,
			float porog2, float dopPrice1, float dopPrice2, float minCom,
			float vivodFixPrice, float vivodPercentPrice, String baza,
			String comisType) {
		super();
		this.tarifName = tarifName;
		this.bonusInclude = bonusInclude;
		this.useItDefault = useItDefault;
		this.fixComPrice = fixComPrice;
		this.percentComPrice = percentComPrice;
		this.porog1 = porog1;
		this.porog2 = porog2;
		this.dopPrice1 = dopPrice1;
		this.dopPrice2 = dopPrice2;
		this.minCom = minCom;
		this.vivodFixPrice = vivodFixPrice;
		this.vivodPercentPrice = vivodPercentPrice;
		this.baza = baza;
		this.comisType = comisType;
	}
	
	
	public Tarif(String tarifName) {
		super();
		this.tarifName = tarifName;
	}


	public String getTarifName() {
		return tarifName;
	}
	public void setTarifName(String tarifName) {
		this.tarifName = tarifName;
	}
	public boolean isBonusInclude() {
		return bonusInclude;
	}
	public void setBonusInclude(boolean bonusInclude) {
		this.bonusInclude = bonusInclude;
	}
	public boolean isUseItDefault() {
		return useItDefault;
	}
	public void setUseItDefault(boolean useItDefault) {
		this.useItDefault = useItDefault;
	}
	public float getFixComPrice() {
		return fixComPrice;
	}
	public void setFixComPrice(float fixComPrice) {
		this.fixComPrice = fixComPrice;
	}
	public float getPercentComPrice() {
		return percentComPrice;
	}
	public void setPercentComPrice(float percentComPrice) {
		this.percentComPrice = percentComPrice;
	}
	public float getPorog1() {
		return porog1;
	}
	public void setPorog1(float porog1) {
		this.porog1 = porog1;
	}
	public float getPorog2() {
		return porog2;
	}
	public void setPorog2(float porog2) {
		this.porog2 = porog2;
	}
	public float getDopPrice1() {
		return dopPrice1;
	}
	public void setDopPrice1(float dopPrice1) {
		this.dopPrice1 = dopPrice1;
	}
	public float getDopPrice2() {
		return dopPrice2;
	}
	public void setDopPrice2(float dopPrice2) {
		this.dopPrice2 = dopPrice2;
	}
	public float getMinCom() {
		return minCom;
	}
	public void setMinCom(float minCom) {
		this.minCom = minCom;
	}
	public float getVivodFixPrice() {
		return vivodFixPrice;
	}
	public void setVivodFixPrice(float vivodFixPrice) {
		this.vivodFixPrice = vivodFixPrice;
	}
	public float getVivodPercentPrice() {
		return vivodPercentPrice;
	}
	public void setVivodPercentPrice(float vivodPercentPrice) {
		this.vivodPercentPrice = vivodPercentPrice;
	}
	public String getBaza() {
		return baza;
	}
	public void setBaza(String baza) {
		this.baza = baza;
	}
	public String getComisType() {
		return comisType;
	}
	public void setComisType(String comisType) {
		this.comisType = comisType;
	}

	
	
	
	}

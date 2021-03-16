package modelClasess;

import java.math.BigDecimal;

public class CashDepositDetailsModel {
String depositor;
String currency;
String instrDate;
String crdr;
String remark;
String transMode;
BigDecimal transAmt;
String accNo;
String accType;
String cashAmount;
public String getDepositor() {
	return depositor;
}
public void setDepositor(String depositor) {
	this.depositor = depositor;
}
public String getCurrency() {
	return currency;
}
public void setCurrency(String currency) {
	this.currency = currency;
}
public String getInstrDate() {
	return instrDate;
}
public void setInstrDate(String instrDate) {
	this.instrDate = instrDate;
}
public String getCrdr() {
	return crdr;
}
public void setCrdr(String crdr) {
	this.crdr = crdr;
}
public String getRemark() {
	return remark;
}
public void setRemark(String remark) {
	this.remark = remark;
}
public String getTransMode() {
	return transMode;
}
public void setTransMode(String transMode) {
	this.transMode = transMode;
}
public BigDecimal getTransAmt() {
	return transAmt;
}
public void setTransAmt(BigDecimal transAmt) {
	this.transAmt = transAmt;
}
public String getAccNo() {
	return accNo;
}
public void setAccNo(String accNo) {
	this.accNo = accNo;
}
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public String getCashAmount() {
	return cashAmount;
}
public void setCashAmount(String cashAmount) {
	this.cashAmount = cashAmount;
}
@Override
public String toString() {
	return "CashDepositDetailsModel [depositor=" + depositor + ", currency=" + currency + ", instrDate=" + instrDate
			+ ", crdr=" + crdr + ", remark=" + remark + ", transMode=" + transMode + ", transAmt=" + transAmt
			+ ", accNo=" + accNo + ", accType=" + accType + ", cashAmount=" + cashAmount + "]";
}

}

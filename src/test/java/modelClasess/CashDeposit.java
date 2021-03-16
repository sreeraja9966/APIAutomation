package modelClasess;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class CashDeposit  {
	String scenario;

String accType;
BigDecimal transAmt;
String transType;
String status;
String transFlag;
String transCode;
List<CashDepositDetailsModel> detailModels;
Object rebate;
Object rebatePenaltyModel;
public String getAccType() {
	return accType;
}
public void setAccType(String accType) {
	this.accType = accType;
}
public BigDecimal getTransAmt() {
	return transAmt;
}
public void setTransAmt(BigDecimal transAmt) {
	this.transAmt = transAmt;
}
public String getTransType() {
	return transType;
}
public void setTransType(String transType) {
	this.transType = transType;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
public String getTransFlag() {
	return transFlag;
}
public void setTransFlag(String transFlag) {
	this.transFlag = transFlag;
}
public String getTransCode() {
	return transCode;
}
public void setTransCode(String transCode) {
	this.transCode = transCode;
}


public List<CashDepositDetailsModel> getDetailModels() {
	return detailModels;
}
public void setDetailModels(List<CashDepositDetailsModel> detailModels) {
	this.detailModels = detailModels;
}

public String getScenario() {
	return scenario;
}
public void setScenario(String scenario) {
	this.scenario = scenario;
}
public Object getRebate() {
	return rebate;
}
public void setRebate(Object rebate) {
	this.rebate = rebate;
}
public Object getRebatePenaltyModel() {
	return rebatePenaltyModel;
}
public void setRebatePenaltyModel(Object rebatePenaltyModel) {
	this.rebatePenaltyModel = rebatePenaltyModel;
}
@Override
public String toString() {
	return "CashDeposit [scenario=" + scenario + ", accType=" + accType + ", transAmt=" + transAmt + ", transType="
			+ transType + ", status=" + status + ", transFlag=" + transFlag + ", transCode=" + transCode
			+ ", detailModels=" + detailModels + ", rebate=" + rebate + ", rebatePenaltyModel=" + rebatePenaltyModel
			+ "]";
}


}





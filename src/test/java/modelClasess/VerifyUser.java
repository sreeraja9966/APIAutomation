package modelClasess;

public class VerifyUser {
String bankCode;
String userId;
public String getBankCode() {
	return bankCode;
}
public void setBankCode(String bankCode) {
	this.bankCode = bankCode;
}
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
@Override
public String toString() {
	return "VerifyUser [bankCode=" + bankCode + ", userId=" + userId + "]";
}

}

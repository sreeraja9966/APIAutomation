package modelClasess;

public class VerifyCredentialsModel {
 String userId;
 String bankCode;
 String digest;
public String getUserId() {
	return userId;
}
public void setUserId(String userId) {
	this.userId = userId;
}
public String getBankCode() {
	return bankCode;
}
public void setBankCode(String bankCode) {
	this.bankCode = bankCode;
}
public String getDigest() {
	return digest;
}
public void setDigest(String digest) {
	this.digest = digest;
}
@Override
public String toString() {
	return "VerifyCredentialsModel [userId=" + userId + ", bankCode=" + bankCode + ", digest=" + digest + "]";
}
 
}

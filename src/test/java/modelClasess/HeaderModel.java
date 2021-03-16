package modelClasess;

import java.util.HashMap;
import java.util.Map;

public class HeaderModel {
	
	public Map modelSetup() {
	Map<String,Object> headerMap = new HashMap<String,Object>();
	headerMap.put("userId", "8003");
	headerMap.put("parentBank", "804");
	headerMap.put("parentBranch", "2");
	headerMap.put("usermultiCurrency", "Y");
	headerMap.put("bankmultiCurrency", "Y");
	headerMap.put("todaysDate", "2021/01/31");
	headerMap.put("branchmultiCurrency", "Y");
	headerMap.put("transCode", "");
	headerMap.put("Content-Type", "application/json");
	return headerMap;
}
}
